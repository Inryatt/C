import java.util.HashMap;
import java.io.File;
import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.RuleContext;




public class SemanticChecker extends GeometricsBaseVisitor<Boolean> {


   private int errorCount = 0;

   //private Map<String,Symbol> symbolTable = new HashMap<>();

   private ArrayList<Map<String,Symbol>> symbolTableStack = new ArrayList<>();
   //private //symbolTree //symbolTree = new //symbolTree();

   private final Type intType = new IntegerType();
   private final Type doubleType = new DoubleType();
   private final Type booleanType = new BooleanType();
   private final Type stringType = new StringType();
   private final Type pointType = new PointType();
   private final Type timeType = new TimeType();
   private final FigureType figureType = new CompositeFigureType();
   private final FigureType circleType = new CircleType();
   private final FigureType ellipseType = new ElipseType();
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

   private int breakCount = 0;

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

   public int getErrorCount(){
      return errorCount;
   }



   @Override public Boolean visitProg(GeometricsParser.ProgContext ctx) {
      symbolTableStack.add(new HashMap<String,Symbol>());
      //System.err.println("AAA");
      //System.err.println(//symbolTree);
      visitChildren(ctx);
      //System.err.println(//symbolTree);
      return true;
   }


   @Override public Boolean visitStat(GeometricsParser.StatContext ctx) {
      //boolean res = visitChildren(ctx);
      //System.err.println(ctx.getText());
      return visitChildren(ctx);
   }

   @Override public Boolean visitLoadBank(GeometricsParser.LoadBankContext ctx){
      //TODO: Change String to expr
      String fileName = ctx.String().getText().replace("\"","");
      //System.err.println(fileName); 
      boolean res = true;

      if(fileName.length() < 4){
         System.err.println("ERROR: invalid file name: " + fileName);
         res = false;
         errorCount++;
      }
      String extension = fileName.substring(fileName.length() - 3);
      //System.err.println(extension);
      if(!extension.equals(".f3")){
         System.err.println("ERROR: invalid file extension: " + fileName);
         res = false;
         errorCount++;
      }

      File f = new File(fileName);
      if(!f.isFile()){
         System.err.println("ERROR: file does not exists");
         res = false;
         errorCount++;
      }

      // Call SemanticChecker for figurebank
      if (res){
         String[] args = {
            fileName
         };
         FigureBankMain.figurebank(args);

         if (FigureBankMain.getErrorCount() == 0){

         
            Map<String,Symbol> temp = FigureBankMain.getSymbolTable();

            for(String id : temp.keySet()){
               if(symbolTableStack.get(0).containsKey(id)){
                  System.err.println("LOADING ERROR: figure '" + id + "' has already been declared");
                  res = false;
                  errorCount++;
                  break;
               }
               else{
                  symbolTableStack.get(0).put(id, temp.get(id));
                  //symbolTree.putSymbol(temp.get(id));
               }
            }

         }
         else{
            errorCount += FigureBankMain.getErrorCount();
            res = false;
         }
         //System.err.println(symbolTableStack);
      }

      return res;
   }

   @Override public Boolean visitRender(GeometricsParser.RenderContext ctx) {
      boolean res =  true;
      if(ctx.expr() != null){
         res = visit(ctx.expr());
         if(!ctx.expr().type.subType(intType)){
            System.err.println("ERROR: expecting Integer");
            res = false;
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitCreate_instance(GeometricsParser.Create_instanceContext ctx) {
      boolean res = true; // A chamada a um create é inversa ao break, ou seja, não pode ser feita dentro de ciclos
      if(!res){
         System.err.println("ERROR: invalid call for a create statment");
         errorCount++;
      }
      else{
         visitChildren(ctx);
      }
      return res;
   }

   @Override public Boolean visitDestroy_instance(GeometricsParser.Destroy_instanceContext ctx) {
      boolean res = true; // A chamada a um destroy é inversa ao break, ou seja, não pode ser feita dentro de ciclos
      if(!res){
         System.err.println("ERROR: invalid call for a destroy statment");
         errorCount++;
      }
      else{
         if(!symbolExists(ctx.Label().getText())){
            System.err.println("ERROR: instance '" + ctx.Label().getText() + "' does not exist" );
            res = false;
         }
         else{
            // Remove the symbol in case of wanting to use it again in the future
            int idx = getIdxOfSymbolTable(ctx.Label().getText());
            symbolTableStack.get(idx).remove(ctx.Label().getText());
            //symbolTree.removeSymbol(ctx.Label().getText());
         }            
      }
      return res;
   }

   @Override public Boolean visitSet_frame_rate(GeometricsParser.Set_frame_rateContext ctx) {
      boolean res = visit(ctx.expr());
      if (res) {
         if (ctx.expr().type.subType(intType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: frame rate must be integer");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitCanvas_size(GeometricsParser.Canvas_sizeContext ctx) {
      boolean res = visit(ctx.width) && visit(ctx.height);
      if (res) {
         if (ctx.width.type.subType(intType) && ctx.height.type.subType(intType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: canvas dimentions must be integers");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitInstantiate_figure(GeometricsParser.Instantiate_figureContext ctx) {
      String figType = ctx.obj.getText();
      String name = ctx.instance_name.getText();
      
      boolean res = true;
      if(ctx.position() != null){
         //System.err.println(ctx.position().getText());
         res = visit(ctx.position());
      }
      if(res){
         // O tipo deve exister mas o instancia não
         if(!symbolExists(figType)){
            System.err.println("ERROR: '" + figType + "' hasn't been declared");
            errorCount++;
            return false;
         }
         else if(symbolExists(name)){
            System.err.println("ERROR: instance '" + name + "' has already been declared");
            errorCount++;
            return false;
         }
         //Criar novo Simbolo
         FigureSymbol var = new FigureSymbol(name, figureType, "instance");
         //Meter o novo symbolo no Contexto atual
         getSymbolTable(getIdxOfSymbolTable(name)).put(name, var);

         //symbolTree.putSymbol(var);

         var.setSymbolTable(getSymbolTable(getIdxOfSymbolTable(figType)).get(figType).getSymbols());

         //symbolTableStack.get(0).put(name, new VariableSymbol(name, figureType, "instance"));

      }
      return res;
   }

   @Override public Boolean visitFigure_declaration(GeometricsParser.Figure_declarationContext ctx) {
      String varName = ctx.id.getText();
      boolean res = symbolTableStack.get(0).containsKey(varName);
      if(!res){
         symbolTableStack.get(0).put(varName, new FigureSymbol(varName, figureType, "figure"));
         //symbolTree.putSymbol(new FigureSymbol(varName, figureType, "figure"));
         //Add local context
         symbolTableStack.add(new HashMap<String,Symbol>());
         //symbolTree.addChild();
         visitChildren(ctx);
         //symbolTree.leaveContext();
         //symbolTree.findSymbol(varName).setSymbolTable( symbolTableStack.get(symbolTableStack.size() - 1) );
         symbolTableStack.get(0).get(varName).setSymbolTable( symbolTableStack.get(symbolTableStack.size() - 1) );
         //Pop local context
         symbolTableStack.remove(symbolTableStack.size() - 1);
      }
      else{
         System.err.println("ERROR: " + varName + " has already been declared");
         res = false;
         errorCount++;
      }
      //System.err.println(symbolTableStack);
      //System.err.println(varName + ": " + symbolTableStack.get(0).get(varName).getSymbols());
      return res;
   }

   @Override public Boolean visitFigureDeclarePrimitiveFigure(GeometricsParser.FigureDeclarePrimitiveFigureContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitFigureDeclarePrimitive(GeometricsParser.FigureDeclarePrimitiveContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitFigureInstanciateFigure(GeometricsParser.FigureInstanciateFigureContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitFigureChangeInstanceProperty(GeometricsParser.FigureChangeInstancePropertyContext ctx) {
      return visitChildren(ctx);
   }


   @Override public Boolean visitPrimitive_figure_declaration(GeometricsParser.Primitive_figure_declarationContext ctx) {
      
      FigureType figType = null;
      //Get type
      switch(ctx.type.getText()){
         case "circle": figType = circleType; break;
         case "line": figType = lineType; break;
         case "rectangle": figType = rectangleType; break;
         case "square": figType = squareType; break;               
         case "ellipse": figType = ellipseType; break;
         case "polyline": figType = polylineType; break;
         case "polygon": figType = polygonType; break;
         case "arc": figType = arcType; break;
         default:
            System.err.println("Invalid Type?? This shouldn't have happened");
            errorCount++;
            return false;
      }
      // Get id
      String id = ctx.id.getText();
      int idx = symbolTableStack.size() - 1;
      //See if the Symbol Exists in the Current Context
      if(! symbolTableStack.get(idx).containsKey(id)){
         boolean res = true;
         // no figure block, no problem
         if (ctx.primitive_figure_block() == null){
            FigureSymbol var = new FigureSymbol(id, figType, "primitive");
            symbolTableStack.get(idx).put(id, var);
            //symbolTree.putSymbol(var);
         }
         else{
            ctx.primitive_figure_block().primType = figType;
            //visit block
            res = visit(ctx.primitive_figure_block());

            if(res){
               FigureSymbol var = new FigureSymbol(id, figType, "primitive");
               symbolTableStack.get(idx).put(id, var);
               //symbolTree.putSymbol(var);
            }
         }
         // get figure type
      
         return res;
      }
      else{
         System.err.println("ERROR: figure '" + id + "' has already been declared");
         errorCount++;
         return false;
      }

   }

   @Override public Boolean visitPrimitive_figure_block(GeometricsParser.Primitive_figure_blockContext ctx) {
      Iterator<GeometricsParser.Property_assignmentContext> list = ctx.property_assignment().iterator();

      boolean res = true;

      //for (int i = 0; i < ctx.children.length; i++) {  // this probably ain't right
      while (list.hasNext()) {
         GeometricsParser.Property_assignmentContext node = list.next();

         if(!ctx.primType.isValidProperty(node.name.getText())){
            res = false;
            errorCount++;
            System.err.println("ERROR: property '" + node.name.getText() + "' is not valid for " + ctx.primType);
         }

         if (!visit(node)){
            res = false;
            errorCount++;
         }

         if (!res){
            errorCount++;
            break;
         }
      }
      return res;
   }

   @Override public Boolean visitProperty_assignment(GeometricsParser.Property_assignmentContext ctx) {
      
      boolean res = visit(ctx.value);
      if(res){
         Type type = ctx.value.type;
         //System.err.println(type);
         switch (ctx.name.getText()) {
            case "width":
            case "height":
            case "length":
            case "radius":
            case "scale":
               if (!type.subType(doubleType))
                  res = false;
               break;
            case "angle":
            case "layer":
            case "thickness":
               if (!type.subType(intType))
                  res = false;
               break;
            case "center":
            case "position":
            case "pivot":
               if (!type.subType(pointType))
                  res = false;
               break;
            case "hidden":
            case "fill":
            case "border":
               if (!type.subType(booleanType))
                  res = false;
               break;
            case "fill_color":
            case "border_color":
               if (!type.subType(colorType))
                  res = false;
               break;
            case "points":
               if (!type.subType(groupType))
                  res = false;
               break;
            default:
               res = false;
         }
         if(!res){
            System.err.println("ERROR: Type '" + type + "' is invalid for property '" + ctx.name.getText() + "'");
            errorCount++;
         }
      }
      
      return res;
   }

   @Override public Boolean visitPointType(GeometricsParser.PointTypeContext ctx) {
      ctx.type = pointType;
      return true;
   }

   @Override public Boolean visitIntType(GeometricsParser.IntTypeContext ctx) {
      ctx.type = intType;
      return true;
   }

   @Override public Boolean visitDoubleType(GeometricsParser.DoubleTypeContext ctx) {
      ctx.type = doubleType;
      return true;
   }

   @Override public Boolean visitStringType(GeometricsParser.StringTypeContext ctx) {
      ctx.type = stringType;
      return true;
   }

   @Override public Boolean visitBooleanType(GeometricsParser.BooleanTypeContext ctx) {
      ctx.type = booleanType;
      return true;
   }

   @Override public Boolean visitTimeType(GeometricsParser.TimeTypeContext ctx) {
      ctx.type = timeType;
      return true;
   }

   @Override public Boolean visitNormalPrimitiveDeclaration(GeometricsParser.NormalPrimitiveDeclarationContext ctx) {
      //System.err.println("visitNormalPrimitiveDeclaration");
      boolean res = true;

      visit(ctx.normal_primitive_type());
      Type type = ctx.normal_primitive_type().type;
      String varName = ctx.id.getText();

      // variable must not have been declared before
      if (!symbolExists(varName)) {
         int idx = getIdxOfSymbolTable(varName);
         VariableSymbol var = new VariableSymbol(varName, type, "normal");
         getSymbolTable(idx).put(varName, var);
      }
      //symbolTree.putSymbol(var);      }
      else {
         System.err.println("ERROR: variable " + varName + " has already been declared");
         res = false; 
         errorCount++;
      }

      return res;
   }

   @Override public Boolean visitNormalPrimitiveDeclarationAssignment(GeometricsParser.NormalPrimitiveDeclarationAssignmentContext ctx) {
      //System.err.println("visitNormalPrimitiveDeclarationAssignment");
      boolean res = visit(ctx.value);

      visit(ctx.normal_primitive_type());
      Type type = ctx.normal_primitive_type().type; 
      String varName = ctx.id.getText(); 

      /*System.err.println(varName);
      System.err.println(res);
      System.err.println(type);*/

      
      if(res){
      // variable must not have been declared before
         if (!symbolExists(varName)) {
            int idx = symbolTableStack.size() - 1;
            
            getSymbolTable(idx).put(varName, new VariableSymbol(varName, type, "normal"));
            //symbolTree.putSymbol(new VariableSymbol(varName, type, "normal"));
            if (ctx.value.type.subType(type)){
               getSymbolTable(idx).get(varName).setValue(true);
               //symbolTree.findSymbol(varName).setValue(true);
            }
            else {
               System.err.println("ERROR: can't assign " + ctx.value.type.getName() + " to " + type.getName() );
               res = false;
               errorCount++;
            }           
         }
         else {
            System.err.println("ERROR: variable " + varName + " has already been declared");
            res = false;
            errorCount++;
         }
      }

      return res;
   }

   @Override public Boolean visitAssignValue(GeometricsParser.AssignValueContext ctx) {
      //System.err.println("visitAssignValue");
      boolean res;
      res = visit(ctx.value);
      String varName = ctx.id.getText();
      
      if (res) {
         // symbol must be declared and must be a "normal" type (int, boolean, point, etc...)
         if(symbolExists(varName)){
            int idx = getIdxOfSymbolTable(varName);
            if (getSymbolTable(idx).get(varName).getCategory().equals("normal")) {
               // symbol's declared type and value's type devem ter conformidade
               
               if (ctx.value.type.subType(getSymbolTable(idx).get(varName).getType())){
                  getSymbolTable(idx).get(varName).setValue(true);
                  //System.err.println(varName);
                  //System.err.println(//symbolTree);
                  //symbolTree.findSymbol(varName).setValue(true);
               }
               else {
                  System.err.println("ERROR: can't assign " + ctx.value.type.getName() + " to " + getSymbolTable(idx).get(varName).getType().getName() );
                  res = false;
                  errorCount++;
               }
            }
            else {
               System.err.println("ERROR: symbol  is invalid category (such as figure)");
               System.err.println(getSymbolTable(idx));
               res = false;
               errorCount++;
            }
         }
         else{
            System.err.println("ERROR: symbol '" + varName + "' does not exist");
            res = false;
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitNormalPrimitiveDeclarationAssignmentInput(GeometricsParser.NormalPrimitiveDeclarationAssignmentInputContext ctx) {
      boolean res = visit(ctx.normal_primitive_type());
      if(!ctx.normal_primitive_type().type.subType(stringType)){
         System.err.println("ERROR: invalid assignment");
         res = false;
         errorCount++;
      }
      String varName = ctx.id.getText();
      if(res){
         // variable must not have been declared before
         if (!symbolTableStack.get(symbolTableStack.size() - 1).containsKey(varName)) {
            int idx = symbolTableStack.size() - 1;           
            getSymbolTable(idx).put(varName, new VariableSymbol(varName, stringType, "normal"));
            //symbolTree.putSymbol(new VariableSymbol(varName, stringType, "normal"));            
         }
         else {
            System.err.println("ERROR: variable " + varName + " has already been declared");
            res = false;
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitAssignInput(GeometricsParser.AssignInputContext ctx) {
      boolean res = true;
      String varName = ctx.id.getText();
      if(!symbolExists(varName)){
         System.err.println("ERROR: Variable '" + varName + "' has not been declared");
         res = false;
         errorCount++;
      }
      else{
         int idx = getIdxOfSymbolTable(varName);
         if(!getSymbolTable(idx).get(varName).getType().subType(stringType)){
            System.err.println("ERROR: Invalid assignment!");
            res = false;
            errorCount++;
         }
      }

      return res;
   }

   @Override public Boolean visitLiteralPoint(GeometricsParser.LiteralPointContext ctx) {
      boolean res = visit(ctx.x) && visit(ctx.y);
      if(res){
         if(!(ctx.x.type.subType(doubleType) || ctx.y.type.subType(doubleType))){
            System.err.println("ERROR: " + ctx.getText() + "is not a valid point" );
            res = false;
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitPosition(GeometricsParser.PositionContext ctx) {
      boolean res = visit(ctx.expr());
      if (res) {
         if (ctx.expr().type.subType(pointType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: position must be a point");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitTime(GeometricsParser.TimeContext ctx) {
      //ctx.type = timeType;
      return true;
   }
   

   @Override public Boolean visitCreate_group(GeometricsParser.Create_groupContext ctx) {
      String name = ctx.Label().getText();
      boolean res = visit(ctx.group());
      if (res){
         if(!symbolExists(name)){
            int idx = getIdxOfSymbolTable(name);
            getSymbolTable(idx).put(name, new VariableSymbol(name, ctx.group().type, "group"));
            //symbolTree.putSymbol(new VariableSymbol(name, ctx.group().type, "group"));
         }
         else {
            System.err.println("ERROR: '" + name +"' has already been declared");
            errorCount++;
            res = false;
         }

      }
      return res;
   }

   @Override public Boolean visitGroupEntities(GeometricsParser.GroupEntitiesContext ctx) {
      Iterator<GeometricsParser.ExprContext> list = ctx.expr().iterator();
      Type groupType = null;
      while (list.hasNext()) {
         GeometricsParser.ExprContext node = list.next();
         //Check if it has a valid expression
         boolean res = visit(node);
         if(!res){
            System.err.println("ERROR: Invalid List");
            errorCount++;
            return false;
         }
         //Set the Group Type
         if(groupType == null){
            groupType = node.type;
         }
         //Check if all share the same group type
         if(!node.type.subType(groupType)){
            System.err.println("ERROR: Group consisting of different types");
            errorCount++;
            return false;
         }
         ctx.type = groupType;
      }
      return true;
   }

   

   @Override public Boolean visitFigureLabelBase(GeometricsParser.FigureLabelBaseContext ctx) {
      //System.err.println(ctx.getText());
      String name = ctx.Label().getText();
      boolean res;

      // See if instance exists
      if (symbolExists(name)) {

         int idx = getIdxOfSymbolTable(name);
         // Verificar se é uma instancia e não uma defenição
         if (!getSymbolTable(idx).get(name).getCategory().equals("instance")) {
            System.err.println("ERROR: can only change properties of figures instances!");
            errorCount++;
            res =  false;
         }
         else{
            ctx.symbol = getSymbolTable(idx).get(name);
            //System.err.println( symbolTableStack.get(0).get(name).getCategory());
            ctx.type = ctx.symbol.getType();
            res = true;
         }
      }
      else {
         System.err.println("ERROR: instance '" + name +"' does not exist");
         errorCount++;
         res = false;
      }
      return res;
   }

   @Override public Boolean visitFigureLabelChain(GeometricsParser.FigureLabelChainContext ctx) {
      boolean res = visit(ctx.figure_label());
      String name = ctx.Label().getText();
      //System.err.println(ctx.getText());
      if (res) {
         //Check instances are nested
         if (ctx.figure_label().symbol.hasSymbol(name)) {
            Symbol s = ctx.figure_label().symbol.getSymbol(name);
            ctx.symbol = s;
            ctx.type = s.getType();
         }
         else {
            //System.err.println("tabela de "+ctx.figure_label().symbol.getName()+": "+ctx.figure_label().symbol.getSymbols());
            System.err.println("ERROR: Instance '" + ctx.figure_label().symbol.getName() +
               "' has no sub-figure or property named '" + name + "'!");
            res = false;
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitMoveBy(GeometricsParser.MoveByContext ctx) {
      boolean res = visit(ctx.figure_label()) && visit(ctx.expr());

      if (res) {
         if (ctx.expr().type.subType(pointType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: offset must be a point");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitMoveTo(GeometricsParser.MoveToContext ctx) {
      boolean res = visit(ctx.figure_label()) && visit(ctx.expr());

      if (res) {
         if (ctx.expr().type.subType(pointType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: position must be a point");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitRotateBy(GeometricsParser.RotateByContext ctx) {
      boolean res = visit(ctx.figure_label()) && visit(ctx.expr());

      if (res) {
         if (ctx.expr().type.subType(intType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: rotation amount must be an int");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitRotateTo(GeometricsParser.RotateToContext ctx) {
      boolean res = visit(ctx.figure_label()) && visit(ctx.expr());

      if (res) {
         if (ctx.expr().type.subType(intType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: angle must be an int");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitRotateByAround(GeometricsParser.RotateByAroundContext ctx) {
      boolean res = visit(ctx.figure_label()) && visit(ctx.expr()) && visit(ctx.rotate_around());

      if (res) {
         if (ctx.expr().type.subType(intType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: rotation amount must be an int");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitRotateToAround(GeometricsParser.RotateToAroundContext ctx) {
      boolean res = visit(ctx.figure_label()) && visit(ctx.expr()) && visit(ctx.rotate_around());

      if (res) {
         if (ctx.expr().type.subType(intType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: angle must be an int");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitRotate_around(GeometricsParser.Rotate_aroundContext ctx) {
      boolean res = visit(ctx.expr());
      if (res) {
         if (ctx.expr().type.subType(pointType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: pivot must be a point");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitScaleBy(GeometricsParser.ScaleByContext ctx) {
      boolean res = visit(ctx.figure_label()) && visit(ctx.expr());

      if (res) {
         if (ctx.expr().type.subType(doubleType) || ctx.expr().type.subType(pointType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: scale must be a point, double or int");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitScaleTo(GeometricsParser.ScaleToContext ctx) {
      boolean res = visit(ctx.figure_label()) && visit(ctx.expr());

      if (res) {
         if (ctx.expr().type.subType(doubleType) || ctx.expr().type.subType(pointType))
            return true;
         else {
            res = false;
            System.err.println("ERROR: scale must be a point, double or int");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitChangeProperty(GeometricsParser.ChangePropertyContext ctx) {
      //System.err.println(ctx.getText());
      boolean res = visit(ctx.figure_label()) && visit(ctx.expr());

      if (res) {
         
         //System.err.println("----------------");
         //System.err.println(ctx.figure_label().getText());
         //System.err.println(ctx.figure_label().symbol.getCategory());
         
         // verificar se a propriedade é válida para o tipo de figura
         FigureType figType = (FigureType)  ctx.figure_label().type;
         Type exprType = ctx.expr().type;
         String propName = ctx.property_name().getText();

         //System.err.println(figType);
         //System.err.println(ctx.property_name().getText());
         //System.err.println(circleType.isValidProperty(ctx.property_name().getText()));

         if(!figType.isValidProperty(propName)){
            res = false;
            System.err.println("ERROR: " + figType + " does not accept property: " + propName);
         }
         if(res){
            // verificar se propriedade e valor têm conformidade 
            switch (propName) {
               case "width":
               case "height":
               case "length":
               case "radius":
               case "scale":
                  if (!exprType.subType(doubleType))
                     res = false;
                  break;
               case "angle":
               case "layer":
               case "thickness":
                  if (!exprType.subType(intType))
                     res = false;
                  break;
               case "center":
               case "position":
               case "pivot":
                  if (!exprType.subType(pointType))
                     res = false;
                  break;
               case "hidden":
               case "fill":
               case "border":
                  if (!exprType.subType(booleanType))
                     res = false;
                  break;
               case "fill_color":
               case "border_color":
                  if (!exprType.subType(colorType))
                     res = false;
                  break;
               case "points":
                  if (!exprType.subType(groupType))
                     res = false;
                  break;
               default:
                  res = false;
            }
            if(!res){
               System.err.println("ERROR: Type '" + exprType + "' is invalid for property '" + propName + "'");
               errorCount++;
            }  
         }
      }
      return res;
   }

   @Override public Boolean visitChangePrimitive(GeometricsParser.ChangePrimitiveContext ctx) {
      boolean res = visit(ctx.figure_label()) && visit(ctx.expr());

      if (res) {
         Symbol figSymbol = ctx.figure_label().symbol;
         Type exprType = ctx.expr().type;

         // verificar se a figura contém a variável
         if (figSymbol.hasSymbol(ctx.Label().getText())) {
            // verificar se a variável e valor têm conformidade
            Symbol var = figSymbol.getSymbol(ctx.Label().getText());
            if (!var.getType().subType(exprType)) {
               System.err.println("ERROR: can't assign '" + exprType.getName() + 
                  "' to '" + var.getType().getName() + "' type!");
               res = false;
               errorCount++;
            }
         }
         else {
            System.err.println("ERROR: figure '" + figSymbol.getName() +
               "' has no variable named '" + ctx.Label().getText() + "'!");
            res = false;
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitCond_statement(GeometricsParser.Cond_statementContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitIfStatement(GeometricsParser.IfStatementContext ctx) {
      boolean res = visit(ctx.expr());
      

      if (res) {
         if (!(ctx.expr().type.subType(booleanType) || ctx.expr().type.subType(doubleType))) {
            res = false;
            System.err.println("Error: '" + ctx.expr().type + "' is a invalid type for if statement!");
            errorCount++;
         }
         else{
            //add local context
            symbolTableStack.add(new HashMap<String,Symbol>());
            //symbolTree.addChild();
            visit(ctx.block);
            //Pop local context
            //symbolTree.leaveContext();
            symbolTableStack.remove(symbolTableStack.size() - 1);
         }  
      }

      return res;
   }

   @Override public Boolean visitElseIfStatement(GeometricsParser.ElseIfStatementContext ctx) {
      boolean res = visit(ctx.cond);

      if (res) {
         if (!(ctx.cond.type.subType(booleanType) || ctx.cond.type.subType(doubleType))) {
            res = false;
            System.err.println("Error: '" + ctx.expr().type + "' is a invalid type for else if statement!");
            errorCount++;
         }
         else{
            //add local context
            symbolTableStack.add(new HashMap<String,Symbol>());
            //symbolTree.addChild();
            visit(ctx.block);
            //Pop local context
            //symbolTree.leaveContext();
            symbolTableStack.remove(symbolTableStack.size() - 1);
         }
      }

      return res;
   }

   @Override public Boolean visitElseStatment(GeometricsParser.ElseStatmentContext  ctx){
      //add local context
      symbolTableStack.add(new HashMap<String,Symbol>());
      //symbolTree.addChild();
      visit(ctx.block);
      //Pop local context
      //symbolTree.leaveContext();
      symbolTableStack.remove(symbolTableStack.size() - 1);
      return true;
   }

   @Override public Boolean visitExprInt(GeometricsParser.ExprIntContext ctx) {
      ctx.type = intType;
      return true;
   }

   @Override public Boolean visitExprTime(GeometricsParser.ExprTimeContext ctx) {
      ctx.type = timeType;
      return true;
   }

   @Override public Boolean visitExprBoolean(GeometricsParser.ExprBooleanContext ctx) {
      ctx.type = booleanType;
      return true;
   }

   @Override public Boolean visitExprEquality(GeometricsParser.ExprEqualityContext ctx) {
      /*
         True == False -> valid
         (5 > 6) != True -> valid
         6 == 5 -> valid
         True == 5 -> invalid
         5 != 8.9 -> valid
         Brown == #FFFFFF -> valid
         Blue == 3 -> invalid
         (4,6) != (5,6) -> valid
         "asdasd" == "asdasdas" -> valid
         circle == square -> invalid
      */
      boolean res = visit(ctx.e1) && visit(ctx.e2);
      if(res){
         ctx.type = booleanType;
         if(!(ctx.e1.type.subType(ctx.e2.type) || ctx.e2.type.subType(ctx.e1.type))){
            System.err.println("ERROR: " + ctx.e1.getText() + " and " + ctx.e2.getText() + " are not comparable");
            errorCount++;
            res = false;
         }
         else if(ctx.e1.type.subType(figureType)){
            System.err.println("ERROR: " + ctx.e1.getText() + "is not comparable");
            errorCount++;
            res = false;
         }
         else if(ctx.e2.type.subType(figureType)){
            System.err.println("ERROR: " + ctx.e2.getText() + "is not comparable");
            errorCount++;
            res = false;
         }
      }
      return res;
   }

   @Override public Boolean visitExprGreaterLesser(GeometricsParser.ExprGreaterLesserContext ctx) {
      /* 5 > 8+9 -> valid
         3*18 < (3,4) -> invalid
         (3,5) < (4,6) -> invalid
         6.0 > 6 -> valid
      */
      boolean res = visit(ctx.e1) && visit(ctx.e2);
      if(res){
         ctx.type = booleanType;
         if(!ctx.e1.type.subType(doubleType)){
            System.err.println("ERROR: " + ctx.e1.getText() + " is not a double");
            errorCount++;
            res = false;
         }
         else if(!ctx.e2.type.subType(doubleType)){
            System.err.println("ERROR: " + ctx.e2.getText() + " is not a double");
            errorCount++;
            res = false;
         }
      }
      return res;
   }

   @Override public Boolean visitKeyPressed(GeometricsParser.KeyPressedContext ctx) {
      ctx.type=booleanType;

      return visitChildren(ctx);
   }

   @Override public Boolean visitExprAddSub(GeometricsParser.ExprAddSubContext ctx) {
      /* 8+9 -> valid
         (3,4) - (9,8) -> valid
         7 + (1,1) -> valid
         red + green -> invalid
         5s + 5.4s -> valid
         5s - 4 ->invalid
      */
      boolean res = visit(ctx.e1) && visit(ctx.e2);
      if(res){
         Type type1 = ctx.e1.type;
         Type type2 = ctx.e2.type;
         ArrayList<Type> validTypes = new ArrayList<>();
         validTypes.add(intType);
         validTypes.add(doubleType);
         validTypes.add(timeType);
         validTypes.add(pointType);

         //System.err.println(ctx.getText());
         //System.err.println(type1);
         //System.err.println(type2);

         if(!validTypes.contains(type1)){
            System.err.println("ERROR: " + ctx.e1.getText() + " is not a valid Type");
            errorCount++;
            res = false;
         }
         else if(!validTypes.contains(type2)){
            System.err.println("ERROR: " + ctx.e2.getText() + " is not a valid Type");
            errorCount++;
            res = false;
         }
         else if(type1.subType(pointType) && type2.subType(doubleType) || type2.subType(pointType) && type1.subType(doubleType)){
            ctx.type = pointType;
         }
         else if(!(ctx.e1.type.subType(ctx.e2.type) || ctx.e2.type.subType(ctx.e1.type))){
            System.err.println("ERROR: " + ctx.e1.getText() + " and " + ctx.e2.getText() + " are not compatible");
            errorCount++;
            res = false;
         }
         else{
            if(ctx.e1.type.subType(ctx.e2.type)){
               ctx.type = type2;
            }
            else{
               ctx.type = type1;
            }
         }
      }
      return res;
   }

   @Override public Boolean visitExprGroup(GeometricsParser.ExprGroupContext ctx) {
      boolean res = visit(ctx.group());
      if(res){
         ctx.type = groupType;
      }
      return res;
   }

   @Override public Boolean visitExprUnary(GeometricsParser.ExprUnaryContext ctx) {
      // + 5 -> valid
      // - Brown -> invalid
      // + 6.4 -> valid
      // - (5,0) -> valid
      boolean res = visit(ctx.expr());
      if(res){
         ctx.type = ctx.expr().type;
         if( !(ctx.type.subType(doubleType) || ctx.type.subType(pointType)) ){
            System.err.println("ERROR: " + ctx.expr().getText() + " is not valid");
            errorCount++;
            res = false;
         }
      }
      return res;
   }

   @Override public Boolean visitSetLogic(GeometricsParser.SetLogicContext ctx) {
      boolean res = visit(ctx.e1) && visit(ctx.e2);
      if(res){
         if( !(ctx.e1.type.subType(groupType) || ctx.e2.type.subType(groupType)) ){
            res = false;
            System.err.println("ERROR: Invalid group operations");
            errorCount++;
         }
      }
      return res;
   }

   @Override public Boolean visitExprPoint(GeometricsParser.ExprPointContext ctx) {
      boolean res = visit(ctx.point());
      if(res)
         ctx.type = pointType;
      return res;
   }

   @Override public Boolean visitExprParentisis(GeometricsParser.ExprParentisisContext ctx) {
      boolean res = visit(ctx.expr());
      if(res)
         ctx.type = ctx.expr().type;
      return res;
   }

   @Override public Boolean visitExprDouble(GeometricsParser.ExprDoubleContext ctx) {
      ctx.type = doubleType;
      return true;
   }

   @Override public Boolean visitCollisionIs(GeometricsParser.CollisionIsContext ctx) {
      boolean res = visit(ctx.e1) && visit(ctx.e2);
      if(res){
         ctx.type = booleanType;
         if(! ctx.e1.type.subType(figureType)){
            System.err.println("ERROR: '" + ctx.e1 + "' is not a figure");
            errorCount++;
            res = false;
         }
         else if(! ctx.e2.type.subType(figureType)){
            System.err.println("ERROR: '" + ctx.e1 + "' is not a figure");
            errorCount++;
            res = false;
         }
      }

      return res;
   }

   @Override public Boolean visitExprAndOr(GeometricsParser.ExprAndOrContext ctx) {
      // 3 + 5 and 7*5 -> invalid
      // True or False -> valid
      // (3+5 > 6) or False -> valid
      boolean res = visit(ctx.e1) && visit(ctx.e2);
      ctx.type = booleanType;
      if(res){
         if(!ctx.e1.type.subType(booleanType)){
            System.err.println("ERROR: " + ctx.e1.getText() + " is not a boolean");
            errorCount++;
            res = false;
         }
         else if(!ctx.e2.type.subType(booleanType)){
            System.err.println("ERROR: " + ctx.e2.getText() + " is not a boolean");
            errorCount++;
            res = false;
         }
      }
      return res;
   }

   @Override public Boolean visitExprLabel(GeometricsParser.ExprLabelContext ctx) {
      String varName = ctx.Label().getText();
      // símbolo tem de existir na tabela
      if (symbolExists(varName)) {
         int idx = getIdxOfSymbolTable(varName);
         //System.err.println(varName);
         //System.err.println(getSymbolTable(idx).get(varName).getCategory());
         //System.err.println(getSymbolTable(idx).get(varName).getType());
         //return true;
         // se existir, tem de ser um tipo "normal" (int, point, boolean, time, etc...) e tem de ter um valor atribuído
         if (getSymbolTable(idx).get(varName).getCategory().equals("normal") && getSymbolTable(idx).get(varName).hasValue()){
            ctx.type = getSymbolTable(idx).get(varName).getType();
            return true;
         }
         else if(getSymbolTable(idx).get(varName).getCategory().equals("instance")){
            ctx.type = getSymbolTable(idx).get(varName).getType();
            return true;
         }
         else if(getSymbolTable(idx).get(varName).getCategory().equals("group")){
            ctx.type = groupType;
            return true;
         }
         else {
            System.err.println("ERROR: variable '"+ varName + "' not assigned");
            errorCount++;
            return false;
         }
      }
      System.err.println("ERROR: variable '"+ varName + "' not defined");
      errorCount++;
      return false;
   }

   @Override public Boolean visitExprFigure(GeometricsParser.ExprFigureContext ctx) {
      boolean res = visit(ctx.figure_label());
      if (res) {
         ctx.type = ctx.figure_label().type;
      }
      return res;
   }

   @Override public Boolean visitExprFigureProperty(GeometricsParser.ExprFigurePropertyContext ctx) {
      boolean res = visit(ctx.figure_label());
      if (res) {
         FigureType figType = (FigureType) ctx.figure_label().symbol.getType();
         String propName = ctx.property_name().getText();
         // is it a valid property of the figure
         if(!figType.isValidProperty(propName)){
            res = false;
            System.err.println("ERROR: " + figType + " does not accept property: " + propName);
         }

         // return correct type
         switch (propName) {
            case "width":
            case "height":
            case "length":
            case "radius":
            case "scale":
               ctx.type = doubleType;
               break;
            case "angle":
            case "layer":
            case "thickness":
               ctx.type = intType;
               break;
            case "center":
            case "position":
            case "pivot":
               ctx.type = pointType;
               break;
            case "hidden":
            case "fill":
            case "border":
               ctx.type = booleanType;
               break;
            case "fill_color":
            case "border_color":
               ctx.type = colorType;
               break;
            case "points":
               ctx.type = groupType;
               break;
            default:
               res = false;
         }
      }
      if(!res) errorCount++;

      return res;
   }

   @Override public Boolean visitCollisionJust(GeometricsParser.CollisionJustContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitExprString(GeometricsParser.ExprStringContext ctx) {
      ctx.type = stringType;
      return true;
   }

   @Override public Boolean visitExprPower(GeometricsParser.ExprPowerContext ctx) {
      boolean res = visit(ctx.e1) && visit(ctx.e2);
      if (res) {
         Type t1 = ctx.e1.type;
         Type t2 = ctx.e2.type;

         boolean valid = false;

         if (t1.subType(doubleType) && t2.subType(doubleType)){
            valid = true;
            // if at least one is a double, result is a double
            if(doubleType.subType(t1) || doubleType.subType(t2))
               ctx.type = doubleType;
            else
               ctx.type = intType;
         }

         if (!valid) {
            res = false;
            System.err.println("Error: '" + t1 + "' and '" + t2 + 
            "' are not valid operators for '" + ctx.op.getText() + "' operation!");
            errorCount++;
         }
      }

      return res;
   }

   @Override public Boolean visitCollisionStop(GeometricsParser.CollisionStopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Boolean visitExprNegation(GeometricsParser.ExprNegationContext ctx) {
      boolean res = visit(ctx.expr());
      if(res){
         ctx.type = booleanType;
         if(!ctx.expr().type.subType(booleanType)){
            System.err.println("ERROR: '" + ctx.expr() + "'' is not a boolean");
            errorCount++;
            res = false;
         }
      }
      return res;
   }

   @Override public Boolean visitColorNormal(GeometricsParser.ColorNormalContext ctx) {
      ctx.type = normalColorType;
      return true;
   }

   /*
   @Override public Boolean visitColorHex(GeometricsParser.ColorHexContext ctx) {
      ctx.type = hexColorType;
      boolean res = hexColorType.isValid(ctx.HexColor().getText());
      return res;
   }*/
   
   @Override public Boolean visitColorHSV(GeometricsParser.ColorHSVContext ctx) {
      ctx.type = hsvColorType;
      boolean res = true;

      if (ctx.HexColor() == null) {

         res = hsvColorType.isValid(
            ctx.i1.getText()+ "G" +
            ctx.i2.getText()+ "%" +
            ctx.i3.getText()
         );
      }

      else {
         res = hexColorType.isValid(ctx.HexColor().getText());
      }

      return res;
   }
  
   @Override public Boolean visitColorRGB(GeometricsParser.ColorRGBContext ctx) {
      ctx.type = rgbColorType;
      boolean res = true;

      if (ctx.HexColor() == null) {

         res = rgbColorType.isValid(
            ctx.i1.getText()+ "-" +
            ctx.i2.getText()+ "-" +
            ctx.i3.getText()
         );
      }

      else {
         res = hexColorType.isValid(ctx.HexColor().getText());
      }

      return res;
   }
 
   @Override public Boolean visitExprColor(GeometricsParser.ExprColorContext ctx) {
      boolean res = visit(ctx.color());
      ctx.type = ctx.color().type;
      return res;
   }

   @Override public Boolean visitExprMultDivRem(GeometricsParser.ExprMultDivRemContext ctx) {
      boolean res = visit(ctx.e1) && visit(ctx.e2);
      if (res) {
         Type t1 = ctx.e1.type;
         Type t2 = ctx.e2.type;
         String op = ctx.op.getText();

         boolean valid = false;
         // Se ambos forem double/int
         if (t1.subType(doubleType) && t2.subType(doubleType)){
            valid = true;
            // if at least one is a double, result is a double
            if(doubleType.subType(t1) || doubleType.subType(t2))
               ctx.type = doubleType;
            else
               ctx.type = intType;
         }
         // Se op for *|/ e Num*point || point*Num
         else if ( (op.equals("*") || op.equals("/")) && ( (t1.subType(doubleType) && t2.subType(pointType)) ||  (t2.subType(doubleType) && t1.subType(pointType)) ) ){
            valid = true;
            ctx.type = pointType;
         }
         // Se op for *|/ e Num*time || time*Num
         else if ( (op.equals("*") || op.equals("/")) && ( (t1.subType(doubleType) && t2.subType(timeType)) ||  (t2.subType(doubleType) && t1.subType(timeType)) ) ){
            valid = true;
            ctx.type = timeType;
         }

         if (!valid) {
            res = false;
            System.err.println("Error: '" + t1 + "' and '" + t2 + 
            "' are not valid operators for '" + op + "' operation!");
            errorCount++;
         }
      }

      return res;
   }

   @Override public Boolean visitDoWhile(GeometricsParser.DoWhileContext ctx) {
      boolean res = visit(ctx.expr());
      if (res) {
         if (!(ctx.expr().type.subType(doubleType) || ctx.expr().type.subType(booleanType))) {
            res = false;
            System.err.println("Error: '" + ctx.expr().type + "' is a invalid type for while1 condition!");
            errorCount++;
         }
         if(ctx.block != null){
            //Create new local context
            symbolTableStack.add(new HashMap<String,Symbol>());
            //symbolTree.addChild();
            breakCount++;
            visit(ctx.block);
            //Pop local context
            //symbolTree.leaveContext();
            symbolTableStack.remove(symbolTableStack.size() - 1);
            breakCount--;
         }
      }

      return res;
   }

   @Override public Boolean visitForTimes(GeometricsParser.ForTimesContext ctx) {
      boolean res = visit(ctx.expr());

      if(res){
         if (!(ctx.expr().type.subType(intType))) {
            res = false;
            System.err.println("Error: '" + ctx.expr().type + "' is a invalid type for a For condition!");
            errorCount++;
         }
         if(ctx.block != null){
            //Create new local context
            symbolTableStack.add(new HashMap<String,Symbol>());
            //symbolTree.addChild();
            breakCount++;
            visit(ctx.block);
            //Pop local context
            //symbolTree.leaveContext();
            symbolTableStack.remove(symbolTableStack.size() - 1);
            breakCount--;
         }
      }

      return res;
   }

   @Override public Boolean visitForIn(GeometricsParser.ForInContext ctx) {
      boolean res = visit(ctx.expr());

      if(res){
         if (!(ctx.expr().type.subType(groupType))) {
            res = false;
            System.err.println("Error: '" + ctx.expr().type + "' is a invalid type for forIn condition!");
            errorCount++;
         }
         else if(symbolExists(ctx.Label().getText())){
            res = false;
            System.err.println("Error: '" + ctx.Label() + "' has already been declared!");
            errorCount++;
         }
         if(ctx.block != null){
            //Create new local context
            symbolTableStack.add(new HashMap<String,Symbol>());
            String varName = ctx.Label().getText();
            
            symbolTableStack.get(symbolTableStack.size() - 1).put(varName, new FigureSymbol(varName, figureType, "instance"));           
            //symbolTree.addChild();
            breakCount++;
            visit(ctx.block);
            //Pop local context
            //symbolTree.leaveContext();
            symbolTableStack.remove(symbolTableStack.size() - 1);
            breakCount--;
         }
      }


      return res;
   }
   
   @Override public Boolean visitWhileCondition(GeometricsParser.WhileConditionContext ctx) {
      boolean res = visit(ctx.expr());
      
      if (res) {
         if (!(ctx.expr().type.subType(doubleType) || ctx.expr().type.subType(booleanType))) {
            res = false;
            System.err.println("Error: '" + ctx.expr().type + "' is a invalid type for while3 condition!");
            errorCount++;
         }
         if(ctx.block != null){
            //Create new local context
            symbolTableStack.add(new HashMap<String,Symbol>());
            //symbolTree.addChild();
            breakCount++;
            visit(ctx.block);
            //Pop local context
            //symbolTree.leaveContext();
            symbolTableStack.remove(symbolTableStack.size() - 1);
            breakCount--;
         }
      }

      return res;
   }

   @Override public Boolean visitBreakInLoop(GeometricsParser.BreakInLoopContext ctx) {
      if(breakCount < 1){
         System.err.println("ERROR: Invalid 'break' instruction");
         errorCount++;
      }
      return true;
   }

   @Override public Boolean visitWaitCommand(GeometricsParser.WaitCommandContext ctx) {
      String key = ctx.Key().getText();
      boolean res = true;
      if(! key.matches("key.[A-Za-z]")){
         System.err.println("ERROR: Invalid Key");
         errorCount++;
         res = false;
      }
      return res;
   }

   @Override public Boolean visitWaitTime(GeometricsParser.WaitTimeContext ctx){
      boolean res = visit(ctx.expr());
      if(res){
         if(!ctx.expr().type.subType(timeType)){
            System.err.println("ERROR: Expecting Time");
            errorCount++;
            res = false;
         }
      }
      return res;
   }

   @Override public Boolean visitKeyPressedMethod(GeometricsParser.KeyPressedMethodContext ctx) {
      String key = ctx.Key().getText();
      boolean res = true;
      if(! key.matches("key.[A-Za-z]")){
         System.err.println("ERROR: Invalid Key");
         errorCount++;
         res = false;
      }
      if(res){
       //  ctx.type=booleanType;
      }
      return res;
   }

   // ANIMATION
   @Override public Boolean visitAnimate(GeometricsParser.AnimateContext ctx){
      String name = ctx.animationName.getText();
      boolean res = true;
      if(symbolExists(name)){
         int idx = getIdxOfSymbolTable(name);
         if(getSymbolTable(idx).get(name).getCategory().equals("animation")){
            AnimationSymbol symb = (AnimationSymbol)  getSymbolTable(idx).get(name);
            
            String first = ctx.first.getText();
            if(!symbolExists(first)){
               res = false;
               System.err.println("ERROR: variable '" + first +"' has not been declared");
               errorCount++;
            }
            else{
               int idx2 = getIdxOfSymbolTable(first);
               // Verificar se é uma instancia e não uma defenição
               if(getSymbolTable(idx2).get(first).getCategory().equals("group")){
                  if(!getSymbolTable(idx2).get(first).getType().subType(figureType)){
                     System.err.println("ERROR: can only animate a group of instanced figures!");
                     errorCount++;
                     res =  false;
                  }
               }
               else if (!getSymbolTable(idx2).get(first).getCategory().equals("instance")) {
                  System.err.println("ERROR: can only animate instanced figures!");
                  errorCount++;
                  res =  false;
               }

            }

            if(res){
               int count = 1;
               Iterator<GeometricsParser.ExprContext> list = ctx.expr().iterator();
               
               while(list.hasNext()){
                  if(count >= symb.getArgs().size()){
                     System.err.println("ERROR: Invalid number of arguments. Expected " + symb.getArgs().size() + " got " + (count+1) );
                     res = false;
                     errorCount++;
                     break;
                  }
                  GeometricsParser.ExprContext node = list.next();
                  res = visit(node);
                  //System.err.println(symb.getArgs());
                  //System.err.println(node.getText());
                  if(!res){
                     res = false;
                     errorCount++;
                     break;
                  }
                  else if (!node.type.subType( symb.getArgs().get(count).getType() )){
                     System.err.println("ERROR: Expecting '" + symb.getArgs().get(count).getType() + "' got '" + node.type + "'");
                     res = false;
                     errorCount++;
                     break;
                  }
                  count++;
               }
               if(count != symb.getArgs().size()){
                  System.err.println("ERROR: Invalid number of arguments. Expected " + symb.getArgs().size() + " got " + (count) );
                  res = false;
                  errorCount++;
               }
            }
            
         }
         else{
            res = false;
            System.err.println("ERROR: '" + name + "' is not an animation");
            errorCount++;
         }
      }
      else{
         res = false;
         System.err.println("ERROR: animation '" + name + "' does not exist");
         errorCount++;
      }
      return res;
   }

   @Override public Boolean visitArgument_declaration(GeometricsParser.Argument_declarationContext ctx){
      boolean res = true;

      visit(ctx.normal_primitive_type());
      Type type = ctx.normal_primitive_type().type;
      String varName = ctx.id.getText();

      int idx = symbolTableStack.size() - 1;
      ctx.s = new VariableSymbol(varName, type, "normal");
      ctx.s.setValue(true);

      return res;

   }

   @Override public Boolean visitAnimation(GeometricsParser.AnimationContext ctx) {
      String name = ctx.name.getText();
      boolean res = true;
      if(symbolExists(name)){
         System.err.println("ERROR: " + name + " has already been declared");
         res = false;
         errorCount++;
      }
      else{
         AnimationSymbol s =  new AnimationSymbol(name);
         Symbol first = new FigureSymbol(ctx.sub.getText(), figureType, "instance");
         s.putSymbol(first);
         s.addSymbol(first);

         Iterator<GeometricsParser.Argument_declarationContext> list = ctx.argument_declaration().iterator();

         while (list.hasNext()) {
            // Visit argument
            GeometricsParser.Argument_declarationContext node = list.next();
            res = visit(node);
            if(!res){
               res = false;
               errorCount++;
               break;
            }
            else{
               // save argument
               s.putSymbol(node.s);
               s.addSymbol(node.s);
            }
         }
         //System.err.println(s.getSymbols());
         if(res){
            symbolTableStack.get(0).put(name,s);
            //symbolTree.putSymbol(s);
            symbolTableStack.add(s.getSymbols());
            //symbolTree.addChild();
            //symbolTree.setSymbolTable(s.getSymbols());
            //System.err.println(symbolTableStack);
            visit(ctx.block);
            //symbolTree.leaveContext();
            symbolTableStack.remove(symbolTableStack.size() - 1);
         }


      }
      return res;
   }

   @Override public Boolean visitAnimation_block(GeometricsParser.Animation_blockContext ctx) {
      return visitChildren(ctx);
   }
}
