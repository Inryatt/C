/* Decompiler 59ms, total 292ms, lines 82 */
import java.util.Scanner;

public class b1_1 {
   private static Scanner a;

   public static void main(String[] var0) {
      double var5 = 0.0D;
      System.out.printf("Operation (number op number): ");
      double var1 = a();
      if (!a.hasNext()) {
         System.err.printf("ERROR: read operator failure\n");
         System.exit(1);
      }

      String var9 = a.next();
      double var3 = a();
      byte var8 = -1;
      switch(var9.hashCode()) {
      case 42:
         if (var9.equals("*")) {
            var8 = 2;
         }
         break;
      case 43:
         if (var9.equals("+")) {
            var8 = 0;
         }
      case 44:
      case 46:
      default:
         break;
      case 45:
         if (var9.equals("-")) {
            var8 = 1;
         }
         break;
      case 47:
         if (var9.equals("/")) {
            var8 = 3;
         }
      }

      switch(var8) {
      case 0:
         var5 = var1 + var3;
         break;
      case 1:
         var5 = var1 - var3;
         break;
      case 2:
         var5 = var1 * var3;
         break;
      case 3:
         if (var3 == 0.0D) {
            System.err.printf("ERROR: divide by zero\n");
            System.exit(1);
         }

         var5 = var1 / var3;
         break;
      default:
         System.err.printf("ERROR: invalid operator \"%s\"\n", var9);
         System.exit(1);
      }

      System.out.printf("%g %s %g = %g\n", var1, var9, var3, var5);
   }

   private static double a() {
      if (!a.hasNextDouble()) {
         System.err.printf("ERROR: read number failure\n");
         System.exit(1);
      }

      return a.nextDouble();
   }

   static {
      a = new Scanner(System.in);
   }
}
