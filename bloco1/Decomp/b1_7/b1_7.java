/* Decompiler 7ms, total 117ms, lines 13 */
public class b1_7 {
   public static void main(String[] var0) {
      a var1;
      if (!(var1 = new a(new b())).a) {
         System.err.println("ERROR: invalid prefix expression!");
         System.exit(1);
      }

      var1.a();
      System.out.println(" = " + var1.a());
   }
}
