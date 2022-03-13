public class Execute extends CalculatorBaseVisitor<String> {

   static String full_out;

   @Override
   public String visitStat(CalculatorParser.StatContext ctx) {
      String output = "";
      boolean hasAssignment=false;
      for (int i = 0; i < ctx.getText().length(); i++)
         if (ctx.getText().charAt(i) == '='){
            output = visit(ctx.assignment());
            hasAssignment=true;
            break;
         }

      if(!hasAssignment){
         output=visit(ctx.expr()); 
      }
      System.out.println(output);
      return "";
   }

   @Override
   public String visitAssignment(CalculatorParser.AssignmentContext ctx) {
      String output = "";
      String var = "";
      for (int i = 0; i < ctx.getText().length(); i++) {
         if (ctx.getText().charAt(i) == '=') {
            for (int j = 0; j < i; j++) {
               var = var + ctx.getText().charAt(j);
            }
            output = var + " = ";
            break;
         }
      }
      output = output + visit(ctx.expr());
      return output;
   }

   @Override
   public String visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      String arg1 = visit(ctx.expr(0));
      String arg2 = visit(ctx.expr(1));

      String out = "";
      switch (ctx.op.getText()) {
      case ("+"): {
         out = arg1 + " " + arg2 + " + ";
         break;
      }
      case ("-"): {
         out = arg1 + " " + arg2 + " - ";
         break;
      }
      }

      return out;
   }

   @Override
   public String visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override
   public String visitExprNeg(CalculatorParser.ExprNegContext ctx) {
      return  visit(ctx.expr())+" !-";
   }

   @Override
   public String visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return ctx.getText();
   }

   @Override
   public String visitExprPos(CalculatorParser.ExprPosContext ctx) {
      return visit(ctx.expr())+" !+";
   }

   @Override
   public String visitExprId(CalculatorParser.ExprIdContext ctx) {
      return ctx.getText();
   }

   @Override
   public String visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      String arg1 = visit(ctx.expr(0));
      String arg2 = visit(ctx.expr(1));

      String out = "";
      switch (ctx.op.getText()) {
      case ("*"): {
         out = arg1 + " " + arg2 + " * ";
         break;
      }
      case ("/"): {
         out = arg1 + " " + arg2 + " / ";
         break;
      }
      case (" "): {
         break;
      }
      }

      return out;
   }
}