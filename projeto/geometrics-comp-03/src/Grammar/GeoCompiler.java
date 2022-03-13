import java.io.File;
import org.stringtemplate.v4.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.Iterator;
import java.lang.Math.*;
import java.awt.Color;
import java.util.HashMap;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class GeoCompiler extends GeometricsBaseVisitor<ST> {
   private String target;
   private STGroupFile stg;
   private String filename;

   static HashMap<String, int[]> rgbCodes = new HashMap<String, int[]>();
   
   public void setFN(String FN) {
      this.filename = FN;
   }

   public boolean validTarget(String target) {
     // File f = new File("GeoCompiler.stg");
     // return ("GeoCompiler".equalsIgnoreCase(target) && f.exists() && f.isFile() && f.canRead());
      return true;
   }

   public void setTarget(String target) {
   //   assert validTarget(target);
      this.target = target;
   }

   @Override public ST visitProg(GeometricsParser.ProgContext ctx) {
   //   assert validTarget(target);

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
      int[] rgbBrown = {139,69,19};
      rgbCodes.put("Brown", rgbBrown);

      this.stg = new STGroupFile("GeoCompiler.stg");
      ST res = stg.getInstanceOf("statModule");
      res.add("name",ctx.grammar_declaration().name.getText());
      Iterator<GeometricsParser.StatContext> list = ctx.stat().iterator();
      while(list.hasNext()) {
         try{
         res.add("stat", visit(list.next()).render());
         }catch(NullPointerException ex){

         }
      }
      try {
         String[] files = filename.split("/");
         File f = new File("../../examples/bin/"+files[files.length-1]+".py");
         PrintWriter pw = new PrintWriter(f);
         pw.println(res.render());
         pw.close();
      }
      catch (FileNotFoundException e) {
         System.err.println(e);
         System.exit(1);
      }
      //System.out.println(res.render());
      return res;
   }

   @Override public ST visitRender(GeometricsParser.RenderContext ctx) {
      ST res = stg.getInstanceOf("render");
      boolean hasOptionalArg = ctx.expr() != null;
      if(hasOptionalArg) res.add("numFrames",visit(ctx.expr()).render());
      else res.add("numFrames","1");
      return res;
   }

   @Override public ST visitCreate_instance(GeometricsParser.Create_instanceContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      ctx.instantiate_figure().context = 0;
      res.add("self",visit(ctx.instantiate_figure()).render());
      return res;
   }

   @Override public ST visitDestroy_instance(GeometricsParser.Destroy_instanceContext ctx) {
      ST res = stg.getInstanceOf("instDestroy");
      res.add("inst",ctx.Label().getText());
      //System.out.println("this do be workin");
      return res;
   }

   @Override public ST visitSet_frame_rate(GeometricsParser.Set_frame_rateContext ctx) {
      ST res = stg.getInstanceOf("set_frame_rate");
      res.add("framerate", ctx.expr().getText());
      return res;
   }

   @Override public ST visitCanvas_size(GeometricsParser.Canvas_sizeContext ctx) {
      ST res = stg.getInstanceOf("canvas_size");
      res.add("height", ctx.expr(0).getText());
      res.add("width", ctx.expr(1).getText());
      return res;   
   }

   @Override public ST visitInstantiate_figure(GeometricsParser.Instantiate_figureContext ctx) {
      ST res = null;
      if(ctx.context == 0) {
         res = stg.getInstanceOf("add_to_draw");
      }
      else if(ctx.context == 1) {
         res = stg.getInstanceOf("add_to_fig");
         res.add("fig",ctx.figName);
      }
      res.add("label",ctx.instance_name.getText());
      res.add("object",ctx.obj.getText());
      boolean hasOptionalArg = ctx.position() != null;
      if(hasOptionalArg) {
         ST pos = stg.getInstanceOf("changePos");
         pos.add("point",visit(ctx.position()).render());
         res.add("position",pos.render());
      }
      return res;
   }

   @Override public ST visitFigure_declaration(GeometricsParser.Figure_declarationContext ctx) {
      ST res = stg.getInstanceOf("figDelc");
      ST prop = stg.getInstanceOf("stats");
      res.add("label",ctx.id.getText());
      Iterator<GeometricsParser.Figure_propertiesContext> list = ctx.figure_properties().iterator();
      while(list.hasNext()) {
         GeometricsParser.Figure_propertiesContext elem = list.next();
         elem.figName = ctx.id.getText();
         prop.add("stat",visit(elem).render()); 
      }
      res.add("figStats",prop.render());
      return res;
   }

   @Override public ST visitFigureDeclarePrimitiveFigure(GeometricsParser.FigureDeclarePrimitiveFigureContext ctx) {
      //DENTRO DE UMA FIG
      ST res = stg.getInstanceOf("figDeclPrim");
      res.add("fig",ctx.figName);
      res.add("type",ctx.primitive_figure_declaration().type.getText());
      res.add("label",ctx.primitive_figure_declaration().id.getText());
      ST props = stg.getInstanceOf("stats");
      Iterator<GeometricsParser.Property_assignmentContext> list = ctx.primitive_figure_declaration().primitive_figure_block().property_assignment().iterator();
      while(list.hasNext()) {
         GeometricsParser.Property_assignmentContext elem = list.next();
         ST prop = stg.getInstanceOf("propAssignSub");
         prop.add("prop",elem.name.getText());
         prop.add("val",visit(elem.value).render());
         props.add("stat",prop.render());
      }
      res.add("props",props.render());
      boolean hasOptionalArg = ctx.position() != null;
      if(hasOptionalArg) {
         ST pos = stg.getInstanceOf("changePos");
         pos.add("point",visit(ctx.position()).render());
         res.add("position",pos.render());
      }
      return res;
   }

   @Override public ST visitFigureDeclarePrimitive(GeometricsParser.FigureDeclarePrimitiveContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitFigureInstanciateFigure(GeometricsParser.FigureInstanciateFigureContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      ctx.instantiate_figure().context = 1;
      ctx.instantiate_figure().figName = ctx.figName;
      res.add("self",visit(ctx.instantiate_figure()).render());
      return res;
   }

   @Override public ST visitFigureChangeInstanceProperty(GeometricsParser.FigureChangeInstancePropertyContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitFigurePropertyAssignment(GeometricsParser.FigurePropertyAssignmentContext ctx) {
      ctx.property_assignment().label = ctx.figName;
      return visit(ctx.property_assignment());
   }

   @Override public ST visitPrimitive_figure_type(GeometricsParser.Primitive_figure_typeContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", ctx.getText());
      return res;
   }

   @Override public ST visitPrimitive_figure_declaration(GeometricsParser.Primitive_figure_declarationContext ctx) {
      ST res = stg.getInstanceOf("primFigDecl"); 
      
      res.add("type",visit(ctx.primitive_figure_type()).render());
      
      res.add("id", ctx.Label().getText());
      
      boolean hasOptionalArg = ctx.primitive_figure_block() != null;
      if(hasOptionalArg) {
         ctx.primitive_figure_block().label = ctx.Label().getText();
         res.add("properties",visit(ctx.primitive_figure_block()).render());
         
      }
      else res.add("properties","");
      return res;
   }

   @Override public ST visitPrimitive_figure_block(GeometricsParser.Primitive_figure_blockContext ctx) {
      ST res = stg.getInstanceOf("primFigBlock"); 
      
      Iterator<GeometricsParser.Property_assignmentContext> list = ctx.property_assignment().iterator();
      while(list.hasNext()) {
         GeometricsParser.Property_assignmentContext elem = list.next();
         elem.label = ctx.label;
         res.add("prop",visit(elem).render());
      }
      return res;
   }

   @Override public ST visitProperty_assignment(GeometricsParser.Property_assignmentContext ctx) {
      ST res = stg.getInstanceOf("propAssign");
      res.add("label",ctx.label);
      res.add("prop",ctx.name.getText());
      res.add("val",visit(ctx.value).render());
      return res;
   }

   @Override public ST visitProperty_name(GeometricsParser.Property_nameContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitIntType(GeometricsParser.IntTypeContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", ctx.getText());
      return res;
   }

   @Override public ST visitDoubleType(GeometricsParser.DoubleTypeContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", ctx.getText());
      return res;
   }

   @Override public ST visitStringType(GeometricsParser.StringTypeContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", ctx.getText());
      return res;
   }

   @Override public ST visitBooleanType(GeometricsParser.BooleanTypeContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", ctx.getText());
      return res;
   }

   @Override public ST visitTimeType(GeometricsParser.TimeTypeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitNormalPrimitiveDeclaration(GeometricsParser.NormalPrimitiveDeclarationContext ctx) {
      ST res = stg.getInstanceOf("primitiveDecl");
      res.add("label",ctx.id.getText());
      return res; 
   }

   @Override public ST visitNormalPrimitiveDeclarationAssignment(GeometricsParser.NormalPrimitiveDeclarationAssignmentContext ctx) {
      ST res = stg.getInstanceOf("primitiveAssign");
      res.add("label",ctx.id.getText());
      res.add("value",visit(ctx.value).render());
      return res; 
   }

   @Override public ST visitNormalPrimitiveDeclarationAssignmentInput(GeometricsParser.NormalPrimitiveDeclarationAssignmentInputContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitAssignValue(GeometricsParser.AssignValueContext ctx) {
      ST res = stg.getInstanceOf("normal_primitive_assignment");
      res.add("name", ctx.Label());
      res.add("value",visit(ctx.expr()));
      //System.out.println(res.render());
      return res;
   }

   @Override public ST visitAssignInput(GeometricsParser.AssignInputContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitLiteralPoint(GeometricsParser.LiteralPointContext ctx) {
      ST res = stg.getInstanceOf("point_declaration");
      res.add("x", ctx.expr(0).getText());
      res.add("y",ctx.expr(1).getText());
      return res;
   }

   @Override public ST visitPosition(GeometricsParser.PositionContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitTime(GeometricsParser.TimeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitTime_unit(GeometricsParser.Time_unitContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitCreate_group(GeometricsParser.Create_groupContext ctx) {
      ST res = stg.getInstanceOf("create_group");
      res.add("label", ctx.id.getText());
      res.add("values", visit(ctx.group()).render());
      return res;
   }

   @Override public ST visitGroupEntities(GeometricsParser.GroupEntitiesContext ctx) {
      ST res = stg.getInstanceOf("aggregation");
      ST vals = stg.getInstanceOf("aggregationVals");
      if(ctx.expr().size() == 0) {}
      else if(ctx.expr().size() == 1) {
        // System.out.println(ctx.expr().type);
         // if (ctx.expr().type == Label) {

         // }
         vals.add("value",visit(ctx.expr(0)).render());
      }
      else {
         Iterator<GeometricsParser.ExprContext> list = ctx.expr().iterator();
         while(list.hasNext()) {
            GeometricsParser.ExprContext elem = list.next();
            if(elem instanceof GeometricsParser.ExprLabelContext) {
               vals.add("value","\""+visit(elem).render()+"\"");
            }
            else {
               vals.add("value",visit(elem).render());
            }
         }
      }
      res.add("vals",vals.render());
      return res;
   }

   @Override public ST visitAnimation(GeometricsParser.AnimationContext ctx) {
      
      ST res = stg.getInstanceOf("animation");
      res.add("funcName",ctx.name.getText());

      res.add("args", ctx.sub.getText());

      Iterator<GeometricsParser.Argument_declarationContext> list = ctx.argument_declaration().iterator();
      while(list.hasNext()) {
         try {
            res.add("args", ",");
            res.add("args", visit(list.next()).render());
         } catch(NullPointerException ex){}
      }
      ST instruc = visit(ctx.animation_block());
      res.add("instruc", instruc);
      return res;

   }

   @Override public ST visitAnimation_block(GeometricsParser.Animation_blockContext ctx) {
      ST res = stg.getInstanceOf("stats");

      Iterator<GeometricsParser.Animation_statmentsContext> list = ctx.animation_statments().iterator();
      while(list.hasNext()) {
         try {
            res.add("stat", visit(list.next()).render());
         } catch(NullPointerException ex){

         }
      }

      return res;
   }

   @Override public ST visitArgument_declaration(GeometricsParser.Argument_declarationContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", ctx.id.getText());
      return res;
   }

   @Override public ST visitAnimation_statments(GeometricsParser.Animation_statmentsContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitAnimate(GeometricsParser.AnimateContext ctx) {

      ST res = stg.getInstanceOf("animate");
      res.add("funcName",ctx.animationName.getText());

      res.add("args", ctx.first.getText());

      Iterator<GeometricsParser.ExprContext> list = ctx.expr().iterator();
      while(list.hasNext()) {
         try {
            res.add("args", ", ");
            res.add("args", visit(list.next()).render());
         } catch(NullPointerException ex){

         }
      }
      return res;
   }

   @Override public ST visitFigure_operation(GeometricsParser.Figure_operationContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitFigureLabelChain(GeometricsParser.FigureLabelChainContext ctx) {
      ST res = stg.getInstanceOf("figureLabelChain");
      res.add("motherlabel", visit(ctx.figure_label()).render());
      res.add("childlabel", ctx.Label().getText());
    //  System.out.println(res);
      return res;
   }

   @Override public ST visitFigureLabelBase(GeometricsParser.FigureLabelBaseContext ctx) {
      ST res = stg.getInstanceOf("figureLabel");
      res.add("label", ctx.Label().getText());
      return res;
   }

   @Override public ST visitMoveBy(GeometricsParser.MoveByContext ctx) {
      ST res = stg.getInstanceOf("moveBy");
      res.add("figure", visit(ctx.figure_label()).render());
      res.add("vector", visit(ctx.expr()).render());
     // System.out.println(res);
      return res;
   }

   @Override public ST visitMoveTo(GeometricsParser.MoveToContext ctx) {
      ST res = stg.getInstanceOf("moveTo");
      res.add("figure", visit(ctx.figure_label()).render());
      res.add("point", visit(ctx.expr()).render());
    //  System.out.println(res);
      return res;
   }

   @Override public ST visitRotateBy(GeometricsParser.RotateByContext ctx) {
      ST res = stg.getInstanceOf("rotateBy");
      res.add("figure", visit(ctx.figure_label()).render());
      res.add("angle", visit(ctx.expr()).render());
    //  System.out.println(res);
      return res;
   }

   @Override public ST visitRotateTo(GeometricsParser.RotateToContext ctx) {
      ST res = stg.getInstanceOf("rotateTo");
      res.add("figure", visit(ctx.figure_label()).render());
      res.add("angle", visit(ctx.expr()).render());
     // System.out.println(res);
      return res;
   }

   @Override public ST visitRotateByAround(GeometricsParser.RotateByAroundContext ctx) {
      ST res = stg.getInstanceOf("rotateByAround");
      res.add("figure", visit(ctx.figure_label()).render());
      res.add("angle", visit(ctx.expr()).render());
      res.add("around", visit(ctx.rotate_around()).render());
//      System.out.println(res);
      return res;
   }

   @Override public ST visitRotateToAround(GeometricsParser.RotateToAroundContext ctx) {
      ST res = stg.getInstanceOf("rotateToAround");
      res.add("figure", visit(ctx.figure_label()).render());
      res.add("angle", visit(ctx.expr()).render());
      res.add("around", visit(ctx.rotate_around()).render());
 //     System.out.println(res);
      return res;
   }

   @Override public ST visitRotate_around(GeometricsParser.Rotate_aroundContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", visit(ctx.expr()).render());
      return res;
   }

   @Override public ST visitScaleBy(GeometricsParser.ScaleByContext ctx) {
      ST res = stg.getInstanceOf("scaleBy");
      res.add("figure", visit(ctx.figure_label()).render());
      res.add("ratio", visit(ctx.expr()).render());
   //   System.out.println(res);
      return res;
   }

   @Override public ST visitScaleTo(GeometricsParser.ScaleToContext ctx) {
      ST res = stg.getInstanceOf("scaleTo");
      res.add("figure", visit(ctx.figure_label()).render());
      res.add("ratio", visit(ctx.expr()).render());
   //   System.out.println(res);
      return res;
   }

   @Override public ST visitHideFigure(GeometricsParser.HideFigureContext ctx) {      
      ST res = stg.getInstanceOf("hide");
      res.add("figure", visit(ctx.figure_label()).render());
     // System.out.println(res);
      return res;
   }

   @Override public ST visitShowFigure(GeometricsParser.ShowFigureContext ctx) { 
      ST res = stg.getInstanceOf("show");
      res.add("figure", visit(ctx.figure_label()).render());
     //7 System.out.println(res);
      return res;
   }

   @Override public ST visitChangeProperty(GeometricsParser.ChangePropertyContext ctx) {
      ST res = stg.getInstanceOf("changeProperty");
      res.add("figure", visit(ctx.figure_label()).render());
      res.add("propertyName", ctx.property_name().getText());
      res.add("newValue", visit(ctx.expr()).render());
   //   System.out.println(res);
      return res;
   }

   @Override public ST visitChangePrimitive(GeometricsParser.ChangePrimitiveContext ctx) {
      ST res = stg.getInstanceOf("changeProperty");
      res.add("figure", visit(ctx.figure_label()).render());
      res.add("propertyName", ctx.Label().getText());
      res.add("newValue", visit(ctx.expr()).render());
   //   System.out.println(res);
      return res;
   }

   @Override public ST visitCond_statement(GeometricsParser.Cond_statementContext ctx) {
      ST res = stg.getInstanceOf("cond_block");
  //    System.out.println("If:" + visit(ctx.if_statement()).render());
      res.add("stat",visit(ctx.if_statement()).render());
      Iterator<GeometricsParser.Else_if_statementContext > list = ctx.else_if_statement().iterator();
      while(list.hasNext()) {
         GeometricsParser.Else_if_statementContext  thing = list.next();
         res.add("stat", visit(thing).render());
      }
      if( ctx.else_statment()!=null){
         res.add("stat",visit(ctx.else_statment()).render());
      }
      return res;
   }

   @Override public ST visitIfStatement(GeometricsParser.IfStatementContext ctx) {
      ST res = stg.getInstanceOf("if_condStat");

      res.add("condition", visit(ctx.expr()).render());
     //       System.out.println("If-ing: "+ctx.expr().getText());
      Iterator<GeometricsParser.Valid_statmentsContext> list = ctx.condition_block().valid_statments().iterator();
      while(list.hasNext()) {
         GeometricsParser.Valid_statmentsContext  thing = list.next();
         res.add("stat", visit(thing).render());
      }
      return res;
   }

   @Override public ST visitElseIfStatement(GeometricsParser.ElseIfStatementContext ctx) {
      ST res = stg.getInstanceOf("elseIf_condStat");
      res.add("condition", visit(ctx.expr()).render());
      Iterator<GeometricsParser.Valid_statmentsContext> list = ctx.condition_block().valid_statments().iterator();
      while(list.hasNext()) {
         GeometricsParser.Valid_statmentsContext  thing = list.next();
         res.add("stat", visit(thing).render());
      }
      return res;
   }

   @Override public ST visitElseStatment(GeometricsParser.ElseStatmentContext ctx) {
      ST res = stg.getInstanceOf("else_condStat");
      Iterator<GeometricsParser.Valid_statmentsContext > list = ctx.condition_block().valid_statments().iterator();
      while(list.hasNext()) {
         GeometricsParser.Valid_statmentsContext  thing = list.next();
         res.add("stat", visit(thing).render());
      }
      return res;
   }

   @Override public ST visitExprInt(GeometricsParser.ExprIntContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self",ctx.Int());
      return res;
   }

   @Override public ST visitExprBoolean(GeometricsParser.ExprBooleanContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      String add = ctx.Boolean().getText();
      add = add.substring(0, 1).toUpperCase() + add.substring(1);
      res.add("self",add);
      return res; 
   }

   @Override public ST visitKeyPressed(GeometricsParser.KeyPressedContext ctx) {
      //System.out.println("visiting key press");
      ST res = stg.getInstanceOf("returnSelf");
      String key = visit(ctx.key_pressed()).render();
      //System.out.print("got "+key);
      res.add("self", key);
      return res;
   }

   @Override public ST visitExprAddSub(GeometricsParser.ExprAddSubContext ctx) {
      
      String e1 = visit(ctx.e1).render();
      String e2 = visit(ctx.e2).render();
      // Point + Point
      if((ctx.e1 instanceof GeometricsParser.ExprPointContext) && (ctx.e2 instanceof GeometricsParser.ExprPointContext)) {

         switch(ctx.op.getText()) {
            case "+":
               ST res1 = stg.getInstanceOf("sumPoint");
               res1.add("pointA",e1);
               res1.add("pointB",e2);
               return res1;
            case "-":
               ST res2 = stg.getInstanceOf("diffPoint");
               res2.add("pointA",e1);
               res2.add("pointB",e2);
               return res2;
         }
         
      }
      // Point + (Int OR Double OR time)
      else if ((ctx.e1 instanceof GeometricsParser.ExprPointContext)
                  &&
               ((ctx.e2 instanceof GeometricsParser.ExprIntContext)||(ctx.e2 instanceof GeometricsParser.ExprDoubleContext)||(ctx.e2 instanceof GeometricsParser.ExprTimeContext))) {

         switch(ctx.op.getText()) {
            case "+":
               ST res1 = stg.getInstanceOf("sumPointNum");
               res1.add("point",e1);
               res1.add("num",e2);
               return res1;
            case "-":
               ST res2 = stg.getInstanceOf("diffPointNum");
               res2.add("point",e1);
               res2.add("num",e2);
               return res2;
         }

      }
      // (Int OR Double OR time) + Point
      else if (((ctx.e1 instanceof GeometricsParser.ExprIntContext)||(ctx.e1 instanceof GeometricsParser.ExprDoubleContext)||(ctx.e1 instanceof GeometricsParser.ExprTimeContext))
                  &&
               (ctx.e2 instanceof GeometricsParser.ExprPointContext)) {
         
         switch(ctx.op.getText()) {
            case "+":
               ST res1 = stg.getInstanceOf("sumPointNum");
               res1.add("num",e1);
               res1.add("point",e2);
               return res1;
            case "-":
               ST res2 = stg.getInstanceOf("diffPointNum");
               res2.add("num",e1);
               res2.add("point",e2);
               return res2;
         }

      }
      // (Int OR Double OR time OR Label) + (Int OR Double OR time OR Label)
      else if (((ctx.e1 instanceof GeometricsParser.ExprIntContext)||(ctx.e1 instanceof GeometricsParser.ExprDoubleContext)||(ctx.e1 instanceof GeometricsParser.ExprTimeContext)||(ctx.e1 instanceof GeometricsParser.ExprLabelContext))
                  &&
               ((ctx.e2 instanceof GeometricsParser.ExprIntContext)||(ctx.e2 instanceof GeometricsParser.ExprDoubleContext)||(ctx.e2 instanceof GeometricsParser.ExprTimeContext)||(ctx.e2 instanceof GeometricsParser.ExprLabelContext))) {

         switch(ctx.op.getText()) {
            case "+":
               ST res1 = stg.getInstanceOf("normalSum");
               res1.add("num1",e1);
               res1.add("num2",e2);
               return res1;
            case "-":
               ST res2 = stg.getInstanceOf("normalDiff");
               res2.add("num1",e1);
               res2.add("num2",e2);
               return res2;
         }

      }
      else {
         switch(ctx.op.getText()) {
            case "+":
               ST res1 = stg.getInstanceOf("normalSum");
               res1.add("num1",visit(ctx.e1).render());
               res1.add("num2",visit(ctx.e2).render());
               return res1;
            case "-":
               ST res2 = stg.getInstanceOf("normalDiff");
               res2.add("num1",visit(ctx.e1).render());
               res2.add("num2",visit(ctx.e2).render());
               return res2;
         }
      }

      return null;
      
   }

   @Override public ST visitExprGroup(GeometricsParser.ExprGroupContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self",visit(ctx.group()).render());
      return res;
   }

   @Override public ST visitExprColor(GeometricsParser.ExprColorContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self",visit(ctx.color()).render());
      return res;
   }


   @Override public ST visitExprEquality(GeometricsParser.ExprEqualityContext ctx) {

      ST res = stg.getInstanceOf("returnSelf");
      String e1 = visit(ctx.e1).render();
      String e2 = visit(ctx.e2).render();
      String operator = ctx.op.getText();
      String result = e1 + " " + operator + " " + e2;

      res.add("self",result);
      return res;
      
   }

   @Override public ST visitExprUnary(GeometricsParser.ExprUnaryContext ctx) {

      ST res = stg.getInstanceOf("returnSelf");
      String unary = visit(ctx.expr()).render();
      String operator = ctx.op.getText(); 

      switch(ctx.op.getText()) {
         case "+":
            break;
         case "-":
            unary = "-" + unary;
            break;
      }

      res.add("self",unary);
      return res;
   
   }

   @Override public ST visitExprTime(GeometricsParser.ExprTimeContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitSetLogic(GeometricsParser.SetLogicContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitExprPoint(GeometricsParser.ExprPointContext ctx) {
      ST res = stg.getInstanceOf("testePoint");
      res.add("content", visit(ctx.point()).render());
      return res;

   }

   @Override public ST visitExprParentisis(GeometricsParser.ExprParentisisContext ctx) {

      ST res = stg.getInstanceOf("returnSelf");
      String bool = visit(ctx.expr()).render();
      bool = "(" + bool + ")";
      res.add("self",bool);
      return res;
   }

   @Override public ST visitExprDouble(GeometricsParser.ExprDoubleContext ctx) {
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self",ctx.Double());
      return res;
   }

   @Override public ST visitCollisionIs(GeometricsParser.CollisionIsContext ctx) {
      String label1 = ctx.e1.getText();
      String label2 = ctx.e2.getText();
      ST res = stg.getInstanceOf("is_colliding");
      res.add("collider",label1);
      res.add("collidee",label2);
      return res;
      }

   @Override public ST visitExprAndOr(GeometricsParser.ExprAndOrContext ctx) {

      ST res = stg.getInstanceOf("returnSelf");
      String e1 = visit(ctx.e1).render();
      String e2 = visit(ctx.e2).render();
      String operator = ctx.op.getText();
      String result = e1 + " " + operator + " " + e2;

      res.add("self",result);
      return res;

   }

   @Override public ST visitExprLabel(GeometricsParser.ExprLabelContext ctx) {
      
      ST res = stg.getInstanceOf("returnSelf");
      res.add("self", ctx.Label().getText());
      // System.out.print(res.render());
    //  System.out.println(res);
      return res;

   }

   @Override public ST visitCollisionJust(GeometricsParser.CollisionJustContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitExprString(GeometricsParser.ExprStringContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitExprGreaterLesser(GeometricsParser.ExprGreaterLesserContext ctx) {

      ST res = stg.getInstanceOf("returnSelf");
      String e1 = visit(ctx.e1).render();
      String e2 = visit(ctx.e2).render();
      String operator = ctx.op.getText();
      String result = e1 + " " + operator + " " + e2;

      res.add("self",result);
      return res;

   }

   @Override public ST visitExprPower(GeometricsParser.ExprPowerContext ctx) {

      ST res = stg.getInstanceOf("normalPow");
      String e1 = visit(ctx.e1).render();
      String e2 = visit(ctx.e2).render();
      res.add("num1",e1);
      res.add("num2",e2);
      return res;
      
   }

   @Override public ST visitCollisionStop(GeometricsParser.CollisionStopContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitExprNegation(GeometricsParser.ExprNegationContext ctx) {

      ST res = stg.getInstanceOf("returnSelf");
      String bool = visit(ctx.expr()).render();
      bool = "not " + bool;
      res.add("self",bool);
      return res;
   }

   @Override public ST visitColorNormal(GeometricsParser.ColorNormalContext ctx) {

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

   @Override public ST visitColorHSV(GeometricsParser.ColorHSVContext ctx) {

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

   @Override public ST visitColorRGB(GeometricsParser.ColorRGBContext ctx) {
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

   @Override public ST visitExprMultDivRem(GeometricsParser.ExprMultDivRemContext ctx) {

      String e1 = visit(ctx.e1).render();
      String e2 = visit(ctx.e2).render();


      // Point * (Int OR Double)
      if((ctx.e1 instanceof GeometricsParser.ExprPointContext)
            &&
         ((ctx.e2 instanceof GeometricsParser.ExprIntContext)||(ctx.e2 instanceof GeometricsParser.ExprDoubleContext))) {
         
         switch(ctx.op.getText()) {
            case "*":
               ST res1 = stg.getInstanceOf("mulPointNum");
               res1.add("point",e1);
               res1.add("num",e2);
               return res1;
            case "/":
               ST res2 = stg.getInstanceOf("divPointNum");
               res2.add("point",e1);
               res2.add("num",e2);
               return res2;
            case "%":
               ST res3 = stg.getInstanceOf("remPointNum");
               res3.add("point",e1);
               res3.add("num",e2);
               return res3;
         }
      
      }
      // (Int OR Double) * Point
      else if(((ctx.e1 instanceof GeometricsParser.ExprIntContext)|| (ctx.e1 instanceof GeometricsParser.ExprDoubleContext))
                  &&
               (ctx.e2 instanceof GeometricsParser.ExprPointContext)) {

         switch(ctx.op.getText()) {
            case "*":
               ST res1 = stg.getInstanceOf("mulPointNum");
               res1.add("num",e1);
               res1.add("point",e2);
               return res1;
            case "/":
               ST res2 = stg.getInstanceOf("divPointNum");
               res2.add("num",e1);
               res2.add("point",e2);
               return res2;
            case "%":
               ST res3 = stg.getInstanceOf("remPointNum");
               res3.add("num",e1);
               res3.add("point",e2);
               return res3;
         }

      }

      // (Int OR Double OR time) * (Int OR Double OR time)
      else if (((ctx.e1 instanceof GeometricsParser.ExprIntContext)||(ctx.e1 instanceof GeometricsParser.ExprDoubleContext)||(ctx.e1 instanceof GeometricsParser.ExprTimeContext)||(ctx.e1 instanceof GeometricsParser.ExprLabelContext)||(ctx.e1 instanceof GeometricsParser.ExprParentisisContext))
                  &&
               ((ctx.e2 instanceof GeometricsParser.ExprIntContext)||(ctx.e2 instanceof GeometricsParser.ExprDoubleContext)||(ctx.e1 instanceof GeometricsParser.ExprTimeContext)||(ctx.e2 instanceof GeometricsParser.ExprLabelContext)||(ctx.e2 instanceof GeometricsParser.ExprParentisisContext))) {

         switch(ctx.op.getText()) {
            case "*":
               ST res1 = stg.getInstanceOf("normalMul");
               res1.add("num1",e1);
               res1.add("num2",e2);
               return res1;
            case "/":
               ST res2 = stg.getInstanceOf("normalDiv");
               res2.add("num1",e1);
               res2.add("num2",e2);
               return res2;
            case "%":
               ST res3 = stg.getInstanceOf("normalRem");
               res3.add("num1",e1);
               res3.add("num2",e2);
               return res3;
         }
         
      }
      /*
      System.out.println("Estudasse");
      System.out.println(ctx.e1.getClass().getName());
      System.out.println(ctx.e2.getClass().getName());
      */
      return null;

   }

   @Override public ST visitForTimes(GeometricsParser.ForTimesContext ctx) {

      ST res = stg.getInstanceOf("timesLoop_stat");
      //System.out.println("Looping: "+ctx.expr().getText());
      res.add("times", ctx.expr().getText());
      Iterator<GeometricsParser.Valid_statmentsContext > list = ctx.condition_block().valid_statments().iterator();
      while(list.hasNext()) {
         GeometricsParser.Valid_statmentsContext  thing = list.next();
         res.add("stat", visit(thing).render());
      }
      return res;

   }

   @Override public ST visitForIn(GeometricsParser.ForInContext ctx) {

      ST res = stg.getInstanceOf("forInLoop_stat");
      res.add("element", ctx.Label().getText());
      res.add("container", ctx.expr().getText());
      Iterator<GeometricsParser.Valid_statmentsContext > list = ctx.condition_block().valid_statments().iterator();
      while(list.hasNext()) {
         GeometricsParser.Valid_statmentsContext  thing = list.next();
         res.add("stat", visit(thing).render());
      }
   
      return res;

   }

   @Override public ST visitWhileCondition(GeometricsParser.WhileConditionContext ctx) {

      ST res = stg.getInstanceOf("whileLoop_stat");
      res.add("condition", visit(ctx.expr()));
      Iterator<GeometricsParser.Valid_statmentsContext> list = ctx.condition_block().valid_statments().iterator();
      while(list.hasNext()) {
         GeometricsParser.Valid_statmentsContext  thing = list.next();
         res.add("stat", visit(thing).render());
      }
      return res;
      
   }

   @Override public ST visitDoWhile(GeometricsParser.DoWhileContext ctx) {

      ST res = stg.getInstanceOf("doWhile");
      String condition = visit(ctx.expr()).render();
      res.add("condition",condition);

      Iterator<GeometricsParser.Valid_statmentsContext> list = ctx.condition_block().valid_statments().iterator();
      while(list.hasNext()) {
         GeometricsParser.Valid_statmentsContext  thing = list.next();
         res.add("instruc", visit(thing).render());
      }

      return res;
   }


   //uneeded :)
   @Override public ST visitCondition_block(GeometricsParser.Condition_blockContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitBreakInLoop(GeometricsParser.BreakInLoopContext ctx) {
      ST res = stg.getInstanceOf("break");
      return res;
   }

   @Override public ST visitWaitCommand(GeometricsParser.WaitCommandContext ctx) {
      String key = ctx.Key().getText();
      key=key.substring(4, key.length());
      //System.out.println("Waiting For key " +key);
      ST res = stg.getInstanceOf("wait_for_key");
      res.add("key", key.strip());
      return res;
   }

   @Override public ST visitInputCommand(GeometricsParser.InputCommandContext ctx) {
      return visitChildren(ctx);
   }

   @Override public ST visitKeyPressedMethod(GeometricsParser.KeyPressedMethodContext ctx) {
      String key = ctx.Key().getText();
      key=key.substring(4, key.length());
      //System.out.println("Is this key pressed? " +key.strip());
      ST res = stg.getInstanceOf("key_pressed");
      res.add("key", key.strip());
      return res;
   }

   @Override public ST visitPewCommand(GeometricsParser.PewCommandContext ctx) {
      ST res = stg.getInstanceOf("pew");
      return res;
   }

   @Override public ST visitLoadBank(GeometricsParser.LoadBankContext ctx) {
      
      //TODO: Change String to expr
      String fileName = ctx.String().getText().replace("\"","");
      File f = new File(fileName);

      // Call Compiler for figurebank

      String[] args = {
         fileName
      };
      ST res = FigureBankCompile.figurebank(args);

      return res;
   }
}