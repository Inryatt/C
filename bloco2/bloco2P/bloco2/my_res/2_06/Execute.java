
import java.util.HashMap;

public class Execute extends CalculatorBaseVisitor<Double> {

   public static HashMap<String, Double> save = new HashMap<>();

   @Override
   public Double visitStat(CalculatorParser.StatContext ctx) {
      for (int i = 0; i < ctx.getText().length(); i++)
         if (ctx.getText().charAt(i) == '=')
            return visit(ctx.assignment());
      System.out.println(visit(ctx.expr()));
      return 0.0;
   }

   @Override
   public Double visitAssignment(CalculatorParser.AssignmentContext ctx) {
      String var = "";
      for (int i = 0; i < ctx.getText().length(); i++) {
         if (ctx.getText().charAt(i) == '=') {
            for (int j = 0; j < i; j++) {
               var = var + ctx.getText().charAt(j);
            }
            break;
         }
      }
      save.put(var, visit(ctx.expr()));
      return 0.0;
   }

   @Override
   public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
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
   public Double visitExprId(CalculatorParser.ExprIdContext ctx) {
      // System.out.println("assign " + ctx.getText());
      return save.getOrDefault(ctx.getText(), 0.0);
   }

   @Override
   public Double visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Double arg1 = visit(ctx.expr(0));
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
