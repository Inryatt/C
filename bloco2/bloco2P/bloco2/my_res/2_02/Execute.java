public class Execute extends SuffixCalculatorBaseVisitor<String> {



   @Override public String visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      //System.out.println(ctx);
      SaveThings.setA1(-1);
      SaveThings.setA2(-1);
      SaveThings.setRes(0);
      SaveThings.setOp(' ');
      //((System.out.println("bep1");

      return visitChildren(ctx);
   }

   @Override public String visitStat(SuffixCalculatorParser.StatContext ctx) {
      //System.out.println("visitStat"+ctx);
      //((System.out.println("bep2");

      return visitChildren(ctx);
   }

   @Override public String visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      //System.out.println("visitExprNumber"+ctx.Number());
      if(SaveThings.getA1()==-1){
         SaveThings.setA1(Integer.parseInt(ctx.Number().getText()));
         //System.out.println("set arg1 to "+SaveThings.getA1());
      //System.out.println("bep3");

      }else{
         SaveThings.setA2(Integer.parseInt(ctx.Number().getText()));
         //System.out.println("set arg2 to "+SaveThings.getA2());
      //System.out.println("bep4");

      
      //System.out.println(SaveThings.getA1()+" "+SaveThings.getA2()+" "+SaveThings.getRes());
      
      switch(SaveThings.getOp()){
         case('+'):{
            SaveThings.setRes(SaveThings.getA1()+SaveThings.getA2());
            System.out.println(SaveThings.getRes());

            break;
         }
         case('-'):{
            SaveThings.setRes(SaveThings.getA1()-SaveThings.getA2());
            System.out.println(SaveThings.getRes());

            break;
         }
         case('*'):{
            SaveThings.setRes(SaveThings.getA1()*SaveThings.getA2());
            System.out.println(SaveThings.getRes());

            break;
         }
         case('/'):{
            SaveThings.setRes(SaveThings.getA1()/SaveThings.getA2());
            System.out.println(SaveThings.getRes());

            break;
         }
         case(' '):{
            break;
         }
      }
      }
      return visitChildren(ctx);
   }

   @Override public String visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      String op=ctx.getText();
      //System.out.println("bep5");

      Character better_op=op.charAt(op.length() - 1);
      //System.out.println("visitExprSuffix"+better_op);
      SaveThings.setOp(better_op);
      
      return visitChildren(ctx);
   }
}
