import java.util.HashMap;

public class Execute extends yetanothercalcBaseVisitor<String> {
   HashMap<String,String> variables=new HashMap<String,String>();

   @Override public String visitStat(yetanothercalcParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitAssignment(yetanothercalcParser.AssignmentContext ctx) {
      String var = "";
      for (int i = 0; i < ctx.getText().length(); i++) {
         if (ctx.getText().charAt(i) == '>') {
            for (int j = i+1; j < ctx.getText().length(); j++) {
               if(ctx.getText().charAt(j)!=';')
               var = var + ctx.getText().charAt(j);
            }
            break;
         }
      }
      String in= visit(ctx.expr());
      variables.put(var,in );
      System.out.println("Saved "+var+" as "+in);
      return "";   
   }

   @Override public String visitExprPrint(yetanothercalcParser.ExprPrintContext ctx) {
      System.out.println(visit(ctx.expr()));
      return "";
   }

   @Override public String visitExprFrac(yetanothercalcParser.ExprFracContext ctx) {
      return ctx.getText();
   }

   @Override public String visitExprId(yetanothercalcParser.ExprIdContext ctx) {
      return variables.getOrDefault(ctx.getText(), "");
   }
}
