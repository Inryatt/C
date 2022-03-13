import java.util.*;

public class FigureBankCheck extends FigureBankBaseVisitor<Boolean> {

   private int errorCount = 0;

   //private Map<String,Symbol> symbolTable = new HashMap<>();
   private ArrayList<Map<String,Symbol>> symbolTableStack = new ArrayList<>();

   private final Type intType = new IntegerType();
   private final Type doubleType = new DoubleType();
   private final Type booleanType = new BooleanType();
   private final Type stringType = new StringType();
   private final Type pointType = new PointType();
   private final Type timeType = new TimeType();
   private final FigureType figureType = new CompositeFigureType();
   private final FigureType circleType = new CircleType();
   private final FigureType elipseType = new ElipseType();
   private final FigureType lineType = new LineType();
   private final FigureType polylineType = new PolylineType();
   private final FigureType polygonType = new PolygonType();
   private final FigureType squareType = new SquareType();
   private final FigureType rectangleType = new RectangleType();
   private final FigureType arcType = new ArcType();
   private final Type colorType = new ColorType("color");
   private final ColorType normalColorType = new NormalColorType();
   private final ColorType hexColorType = new HexColorType();
   private final ColorType rgbColorType = new RGBColorType();
   private final ColorType hsvColorType = new HSVColorType();
   private final Type groupType = new GroupType();

   public boolean symbolExists(String id){
      int idx = symbolTableStack.size() -1;
      while(idx > -1){
         if(symbolTableStack.get(idx).containsKey(id))
            return true;
         idx--;
      }
      return false;
   }

   public int getIdxOfSymbolTable(String id){
      int idx = symbolTableStack.size() -1;
      while(idx > -1){
         if(symbolTableStack.get(idx).containsKey(id))
            return idx;
         idx--;
      }
      return symbolTableStack.size() - 1;
   }

   public Map<String,Symbol> getSymbolTable(int idx){
      return symbolTableStack.get(idx);
   }

   public Map<String,Symbol> getSymbolTable(){
      return symbolTableStack.get(0);
   }

   public int getErrorCount(){
      return errorCount;
   }

   @Override public Boolean visitProg(FigureBankParser.ProgContext ctx) {
      symbolTableStack.add(new HashMap<String,Symbol>());
      return visitChildren(ctx);
   }

   @Override public Boolean visitStat(FigureBankParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitFigure(FigureBankParser.FigureContext ctx) {
      //System.out.println(ctx.getText());
      String id = ctx.ID().getText();
      boolean res = true;
      if(!symbolExists(id)){
         symbolTableStack.get(0).put(id, new FigureSymbol(id,figureType,"figure"));
         symbolTableStack.add(new HashMap<String,Symbol>());

         Iterator<FigureBankParser.Figure_propertiesContext> list = ctx.figure_properties().iterator();

         while (list.hasNext()) {
            
            FigureBankParser.Figure_propertiesContext node = list.next();
            //System.out.println(node.getText());
            res = visit(node);
            if(!res){
               break;
            }
         }

         symbolTableStack.get(0).get(id).setSymbolTable( symbolTableStack.get(symbolTableStack.size() - 1) );
         //Pop local context
         symbolTableStack.remove(symbolTableStack.size() - 1);
         //System.out.println(id);
         //System.out.println("\t" + symbolTableStack.get(0).get(id).getSymbols());
      }
      else{
         System.out.println("LOADING ERROR: " + id + " has already been declared");
         res = false;
         errorCount++;
      }

      return res;
   }

   @Override public Boolean visitPrimitiveProperty(FigureBankParser.PrimitivePropertyContext ctx) {
      return visit(ctx.primitive_declaration());
   }

   @Override public Boolean visitFigureProperty(FigureBankParser.FigurePropertyContext ctx) {
      //System.out.println(ctx.getText());
      boolean res = true;
      String inst = ctx.inst.getText();
      String fig = ctx.fig.getText();
      if(res){

         if(!symbolExists(fig)){
            System.out.println("LOADING ERROR: figure '" + fig + "' has not been declared");
            res = false;
            errorCount++;
         }
         else if(symbolTableStack.get(symbolTableStack.size() - 1).containsKey(inst)){
            System.out.println("LOADING ERROR: '" + inst + "' has already been declared");
            res = false;
            errorCount++;
         }
         else{
            symbolTableStack.get(symbolTableStack.size() - 1).put(inst, new VariableSymbol(inst, figureType, "figure"));
         }
      }
         return res;
      }

   @Override public Boolean visitPrimitive_declaration(FigureBankParser.Primitive_declarationContext ctx) {
      
      FigureType figType = null;
      String id = ctx.id.getText();
      boolean res = true;
      if(symbolTableStack.get(symbolTableStack.size() - 1).containsKey(id)){
         System.out.println("LOADING ERROR: '" + id + "' has already been declared");
         res = false;
         errorCount++;
      }

      if(res){
         //Get type
         switch(ctx.type.getText()){
            case "circle": figType = circleType; break;
            case "line": figType = lineType; break;
            case "rectangle": figType = rectangleType; break;
            case "square": figType = squareType; break;               
            case "elipse": figType = elipseType; break;
            case "polyline": figType = polylineType; break;
            case "polygon": figType = polygonType; break;
            case "arc": figType = arcType; break;
            default:
               System.out.println("Invalid Type?? This shouldn't have happened");
               errorCount++;
               return false;
         }

         Iterator<FigureBankParser.Property_assignmentContext> list = ctx.property_assignment().iterator();

         
         while (list.hasNext()) {
            FigureBankParser.Property_assignmentContext node = list.next();

            res = visit(node);
            if(!res){
               break;
            }

            if(!figType.isValidProperty(node.name)){
               System.out.println("LOADING ERROR: " + figType + " does not accept " + node.name);
               res = false;
               errorCount++;
               break;
            }
         }
         if(res){
            symbolTableStack.get(symbolTableStack.size() - 1).put(id, new FigureSymbol(id, figureType, "primitive"));
         }
      }


      return res;
   }

   @Override public Boolean visitPrimitive_type(FigureBankParser.Primitive_typeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitProperty_assignment(FigureBankParser.Property_assignmentContext ctx) {
      boolean res = visit(ctx.pName) && visit(ctx.val);
      if(res){
         String prop_name = ctx.pName.getText();
         Type type = ctx.val.type;

         switch (prop_name){
            case "width":
            case "height":
            case "length":
            case "radius":
            case "scale":
               if(!type.subType(doubleType)){
                  System.out.println("LOADING ERROR: invalid value for property" + prop_name);
                  res = false;
                  errorCount++;
               }
               break;
            case "angle":
            case "thickness":
               if(!type.subType(intType)){
                  System.out.println("LOADING ERROR: invalid value for property" + prop_name);
                  res = false;
                  errorCount++;
               }
               break;
            case "center":
            case "position":
            case "pivot":
               if(!type.subType(pointType)){
                  System.out.println("LOADING ERROR: invalid value for property" + prop_name);
                  res = false;
               }
               break;
            case "hidden":
            case "fill":
            case "border":
               if(!type.subType(booleanType)){
                  System.out.println("LOADING ERROR: invalid value for property" + prop_name);
                  res = false;
                  errorCount++;
               }
               break;
            case "fill_color":
            case "border_color":
            if(!type.subType(colorType)){
               System.out.println("LOADING ERROR: invalid value for property" + prop_name);
               res = false;
               errorCount++;
            }
               break;
            case "points":
            if(!type.subType(groupType)){
               System.out.println("LOADING ERROR: invalid value for property" + prop_name);
               res = false;
               errorCount++;
            }
               break;
            default:
               res = false;
               errorCount++;
         }
         ctx.name = prop_name;
      }
      

      return res;
   }

   @Override public Boolean visitProperty_name(FigureBankParser.Property_nameContext ctx) {
      return true;
   }

   @Override public Boolean visitValueInt(FigureBankParser.ValueIntContext ctx) {
      ctx.type = intType;
      return true;
   }

   @Override public Boolean visitValueDouble(FigureBankParser.ValueDoubleContext ctx) {
      ctx.type = doubleType;
      return true;
   }

   @Override public Boolean visitValueBoolean(FigureBankParser.ValueBooleanContext ctx) {
      ctx.type = booleanType;
      return true;
   }

   @Override public Boolean visitValueColor(FigureBankParser.ValueColorContext ctx) {
      ctx.type = normalColorType;
      return true;
   }

   @Override public Boolean visitValueRGBColor(FigureBankParser.ValueRGBColorContext ctx) {
      ctx.type = rgbColorType;
      return true;
   }

   @Override public Boolean visitValueHSVColor(FigureBankParser.ValueHSVColorContext ctx) {
      ctx.type = hsvColorType;
      return true;
   }

   @Override public Boolean visitValuePoint(FigureBankParser.ValuePointContext ctx) {
      ctx.type = pointType;
      return true;
   }

   @Override public Boolean visitValueMultPoints(FigureBankParser.ValueMultPointsContext ctx) {
      ctx.type = groupType;
      return true;
   }

   @Override public Boolean visitNormalPrimitiveDeclaration(FigureBankParser.NormalPrimitiveDeclarationContext ctx){
      boolean res = visit(ctx.value()) && visit(ctx.normal_primitive_type());
      if(res){
         String name = ctx.ID().getText();
         Type type = ctx.normal_primitive_type().type;
         Type valType = ctx.value().type;
         if(!symbolExists(name)){
            if(!valType.subType(type)){
               System.out.println("LOADING ERROR: '" + valType + "' is invalid type assignment for '" + name + "'");
               res = false;
               errorCount++;
            }
            else{
               symbolTableStack.get(symbolTableStack.size() - 1).put(name, new VariableSymbol(name, type, "primitive"));
            }
         }
         else{
            System.out.println("LOADING ERROR: '" + name + "' has already been declared");
            res = false;
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitPointType(FigureBankParser.PointTypeContext ctx) {
      ctx.type = pointType;
      return true;
   }

   @Override public Boolean visitIntType(FigureBankParser.IntTypeContext ctx) {
      ctx.type = intType;
      return true;
   }

   @Override public Boolean visitDoubleType(FigureBankParser.DoubleTypeContext ctx) {
      ctx.type = doubleType;
      return true;
   }

   @Override public Boolean visitBooleanType(FigureBankParser.BooleanTypeContext ctx) {
      ctx.type = booleanType;
      return true;
   }

   @Override public Boolean visitTimeType(FigureBankParser.TimeTypeContext ctx) {
      ctx.type = timeType;
      return true;
   }

}
