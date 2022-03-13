public class Execute extends PrefixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(PrefixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Double visitStat(PrefixCalculatorParser.StatContext ctx) {
      System.out.println(visit(ctx.expr()));
      return 0.0;
   }


   @Override
   public Double visitExprNumber(PrefixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.getText());
   }

   @Override
   public Double visitExprPrefix(PrefixCalculatorParser.ExprPrefixContext ctx) {
      Double arg1 = visit(ctx.expr(0));
      Double arg2 = visit(ctx.expr(1));
      Double res = 0.0;
      switch (ctx.op.getText()) {
      case ("+"): {
         res = arg1 + arg2;
         break;
      }
      case ("-"): {
         res = arg1 - arg2;
         break;
      }
      case ("*"): {
         res = arg1 * arg2;
         break;
      }
      case ("/"): {
         res = arg1 / arg2;
         break;
      }
      case (" "): {
         break;
      }
      }
      return (res);
   }

}