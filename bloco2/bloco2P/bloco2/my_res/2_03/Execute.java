public class Execute extends CalculatorBaseVisitor<Double> {

    
   @Override
   public Double visitStat(CalculatorParser.StatContext ctx) {

       System.out.println(visit(ctx.expr()));
       return 0.0;
   }

   @Override
   public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
       Double arg1 =visit(ctx.expr(0));
       Double arg2 =visit(ctx.expr(1));
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
       }
       return (res);
   }

   @Override
   public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
       return visit(ctx.expr());
   }

   @Override
   public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
       return Double.parseDouble(ctx.getText());
   }

   @Override
   public Double visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
       Double arg1 =visit(ctx.expr(0));
       Double arg2 = visit(ctx.expr(1));
       Double res = 0.0;
       switch (ctx.op.getText()) {
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
@Override 
public Double visitExprNeg(CalculatorParser.ExprNegContext ctx) {
   return -visit(ctx.expr());
}

}
