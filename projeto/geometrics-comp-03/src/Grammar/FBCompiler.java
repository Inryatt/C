import org.stringtemplate.v4.*;

import java.awt.Color;
import java.util.HashMap;

import java.util.Iterator;

public class FBCompiler extends FigureBankBaseVisitor<ST> {

   private String target;
   private STGroupFile stg;   
   static HashMap<String, int[]> rgbCodes = new HashMap<String, int[]>();

   public boolean validTarget(String target) {
     // File f = new File("FBCompiler.stg");
     // return ("FBCompiler".equalsIgnoreCase(target) && f.exists() && f.isFile() && f.canRead());
      return true;
   }

   public void setTarget(String target) {
   //   assert validTarget(target);
      this.target = target;
   }

   @Override public ST visitProg(FigureBankParser.ProgContext ctx) {

      int[] rgbRed = {0,0,255};
      rgbCodes.put("Red", rgbRed);
      int[] rgbBlue = {255,0,0};
      rgbCodes.put("Blue", rgbBlue);
      int[] rgbGreen = {0,255,0};
      rgbCodes.put("Green", rgbGreen);
      int[] rgbYellow = {0,255,255};
      rgbCodes.put("Yellow", rgbYellow);
      int[] rgbOrange = {0,128,255};
      rgbCodes.put("Orange", rgbOrange);
      int[] rgbPink = {255,0,255};
      rgbCodes.put("Pink", rgbPink);
      int[] rgbWhite = {255,255,255};
      rgbCodes.put("White", rgbWhite);
      int[] rgbBlack = {0,0,0};
      rgbCodes.put("Black", rgbBlack);
      int[] rgbPurple = {255,0,127};
      rgbCodes.put("Purple", rgbPurple);
      int[] rgbBrown = {204,229,255};
      rgbCodes.put("Brown", rgbBrown);

      this.stg = new STGroupFile("FBCompiler.stg");
      ST res = stg.getInstanceOf("statModule");
     // System.out.println("Starting...");
      Iterator<FigureBankParser.StatContext> list = ctx.stat().iterator();
      while(list.hasNext()) {
         try{
          //  System.out.println("found a thing.");

         res.add("stat", visit(list.next()).render());
         }catch(NullPointerException ex ){
                //Boas práticas de programção 2k21 :)
         }
      }
      //System.out.println(res.render());
      return res;
   }

   @Override public ST visitStat(FigureBankParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitFigure(FigureBankParser.FigureContext ctx) {

      ST res = stg.getInstanceOf("figureDecl");
      ST prop = stg.getInstanceOf("stats");

      String figName = ctx.ID().getText(); //da erro mas parece estar a funcionar
      res.add("figure", figName);
    //  System.out.println("Found a figure!");
      Iterator<FigureBankParser.Figure_propertiesContext> figProperties = ctx.figure_properties().iterator();
      while(figProperties.hasNext()) {
         try{
            FigureBankParser.Figure_propertiesContext nextFig = figProperties.next();
            nextFig.str=figName;
            res.add("stats", visit(nextFig).render());
           // res.add("type",figName);
         }catch(NullPointerException ex){
                //Boas práticas de programção 2k21 :)
         }
      }
      return res;
   }

   @Override public ST visitFigureProperty(FigureBankParser.FigurePropertyContext ctx) {

      //DENTRO DE UMA FIG
      ST res = stg.getInstanceOf("figDeclPrim2");
      res.add("fig",ctx.str);
      res.add("type",ctx.fig.getText());
      res.add("label",ctx.inst.getText());
      ST pos = stg.getInstanceOf("changePos");
      pos.add("point",visit(ctx.point()).render());
      res.add("position",pos.render());

      return res; 
   }

   @Override public ST visitPoint(FigureBankParser.PointContext ctx) {
      ST res = stg.getInstanceOf("point_declaration");
      String xVal = ctx.x.getText();
      String yVal = ctx.y.getText();
      res.add("x",xVal);
      res.add("y",yVal);
      return res;
   }

   //WIP -- gotta make the stg first -C
   @Override public ST visitPrimitive_declaration(FigureBankParser.Primitive_declarationContext ctx) {
     ST res = stg.getInstanceOf("primFigDecl"); 
      res.add("type",ctx.type.getText());
      res.add("id", ctx.id.getText());
      Iterator<FigureBankParser.Property_assignmentContext> figProperties = ctx.property_assignment().iterator();
      ST block =stg.getInstanceOf("primFigProps");
      //System.out.println("Found primitive");
      while(figProperties.hasNext()) {
         try{
            //System.out.println("Property!");
            FigureBankParser.Property_assignmentContext elem = figProperties.next();
            
            block.add("prop",visit(elem).render());

         }catch(NullPointerException ex){
                //Boas práticas de programção 2k21 :)
         }
      }
      res.add("properties",block.render());
      return res;

      //return visitChildren(ctx);
   }

   @Override public ST visitPrimitive_type(FigureBankParser.Primitive_typeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitPrimitiveProperty(FigureBankParser.PrimitivePropertyContext ctx) {
      //DENTRO DE UMA FIG
      ST res = stg.getInstanceOf("figDeclPrim");
      res.add("fig",ctx.str);
      res.add("type",ctx.primitive_declaration().type.getText());
      res.add("label",ctx.primitive_declaration().id.getText());
      ST props = stg.getInstanceOf("stats");
      //System.out.println("gotHere "+ctx.str+" "+ctx.primitive_declaration().id.getText());
      Iterator<FigureBankParser.Property_assignmentContext> list = ctx.primitive_declaration().property_assignment().iterator();
      while(list.hasNext()) {
         FigureBankParser.Property_assignmentContext elem = list.next();
         //System.out.println("property "+elem.pName.getText());
         ST prop = stg.getInstanceOf("propAssignSub");
         prop.add("prop",elem.pName.getText());
         //System.out.println("value "+visit(elem.val).render());
         prop.add("val",visit(elem.val).render());
         props.add("stat",prop.render());
      }
      
      res.add("props",props.render());
      ST pos = stg.getInstanceOf("changePos");
      pos.add("point",visit(ctx.primitive_declaration().point()).render());
      res.add("position",pos.render());

      return res; 
   }

   @Override public ST visitProperty_assignment(FigureBankParser.Property_assignmentContext ctx) {
      ST res = stg.getInstanceOf("propAssign");

      String property = visit(ctx.property_name()).render();
      res.add("label",property);
      //System.out.println("oh look a prop assignment");

      res.add("prop",visit(ctx.pName).render());
    //  System.out.println("back from pname with "+visit(ctx.pName).render() );

      switch(property){
         case("fill_color"):{
            res.add("val",visit(ctx.value()).render());

            break;
         }
         case("color"):{
            res.add("val",visit(ctx.value()).render());
            break;
         }
         default:
            res.add("val",ctx.value().getText());

      }
   //   res.add("val",ctx.value().getText());
      return res;
   }
  
   @Override public ST visitProperty_name(FigureBankParser.Property_nameContext ctx) {
      ST res = stg.getInstanceOf("getValue");
     // System.out.println("whats this value"+ctx.getText());
      res.add("value",ctx.getText());
      return res;
   
   
       // return visitChildren(ctx);

}

   @Override public ST visitValueInt(FigureBankParser.ValueIntContext ctx) {
      //System.out.println("boba");
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", ctx.Int().getText());
      //System.out.println("HERE: " + res.render());
      return res;
   }

   @Override public ST visitValueDouble(FigureBankParser.ValueDoubleContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", ctx.Double().getText());
      return res;
   }

   @Override public ST visitValueBoolean(FigureBankParser.ValueBooleanContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", ctx.Boolean().getText());
      return res;
   }

   @Override public ST visitValueColor(FigureBankParser.ValueColorContext ctx) {
      ST res = stg.getInstanceOf("RGB");

      String color = ctx.Color().getText();

      int[] RGB = rgbCodes.get(color);
      String R = String.valueOf(RGB[0]);
      String G = String.valueOf(RGB[1]);
      String B = String.valueOf(RGB[2]);

      res.add("R",R);
      res.add("G",G);
      res.add("B",B);

      return res;
   }

   @Override public ST visitValueRGBColor(FigureBankParser.ValueRGBColorContext ctx) {
      ST res = stg.getInstanceOf("RGB");

      if (ctx.i1 != null) {
         String R = ctx.i1.getText();
         String G = ctx.i2.getText();
         String B = ctx.i3.getText();
         res.add("R",R);
         res.add("G",G);
         res.add("B",B);
      }
      else {
         String hex = ctx.HexColor().getText();
         Color color = Color.decode(hex);
         String R = String.valueOf(color.getRed());
         String G = String.valueOf(color.getGreen());
         String B = String.valueOf(color.getBlue());
         res.add("R",R);
         res.add("G",G);
         res.add("B",B);
      }

      return res;
   }
   // @Override public ST visitValueHexColor(FigureBankParser.ValueHexColorContext ctx) {
   //    ST res = stg.getInstanceOf("RGB");

   //    String hex = ctx.HexColor().getText();
   //    Color color = Color.decode(hex);
   //    String R = String.valueOf(color.getRed());
   //    String G = String.valueOf(color.getGreen());
   //    String B = String.valueOf(color.getBlue());
   //    res.add("R",R);
   //    res.add("G",G);
   //    res.add("B",B);
      
   //    return res;
   // }

   @Override public ST visitValueHSVColor(FigureBankParser.ValueHSVColorContext ctx) {
      ST res = stg.getInstanceOf("RGB");

      if (ctx.i1 != null) {
         Float H = Float.parseFloat(ctx.i1.getText());
         Float S = Float.parseFloat(ctx.i2.getText());
         Float V = Float.parseFloat(ctx.i3.getText());

         int RGB = Color.HSBtoRGB(H,S,V);
         Color color = new Color(RGB);

         String R = String.valueOf(color.getRed());
         String G = String.valueOf(color.getGreen());
         String B = String.valueOf(color.getBlue());
         
         res.add("R",R);
         res.add("G",G);
         res.add("B",B);
      }
      else {
         String hex = ctx.HexColor().getText();
         Color color = Color.decode(hex);
         String R = String.valueOf(color.getRed());
         String G = String.valueOf(color.getGreen());
         String B = String.valueOf(color.getBlue());
         res.add("R",R);
         res.add("G",G);
         res.add("B",B);
      }

      return res;
   }

   @Override public ST visitValuePoint(FigureBankParser.ValuePointContext ctx) {
      //ST res = stg.getInstanceOf("point_declaration");
     // System.out.println("Debug point: "+ctx.point().getText());

      return visit(ctx.point()); // this should work trust me
                                 // visitPoint returns the ST we want
                                 // bit redundant but I don't make the rules (here)
      //res.add("x", ctx.point(0).getText());
      //res.add("y",ctx.point(1).getText());
//      return res;
   }

   @Override public ST visitValueMultPoints(FigureBankParser.ValueMultPointsContext ctx) {
      ST res = stg.getInstanceOf("aggregation");
      ST vals = stg.getInstanceOf("aggregationVals");
      if(ctx.point().size() == 0) {/*pass*/}
      else if(ctx.point().size() == 1) {
         vals.add("value",visit(ctx.point(0)).render());
      }
      else {
         Iterator<FigureBankParser.PointContext> list = ctx.point().iterator();
         while(list.hasNext()) {
            FigureBankParser.PointContext elem = list.next();
            vals.add("value",visit(elem).render());
         }
      }
      res.add("vals",vals.render());
      return res;
   }
}