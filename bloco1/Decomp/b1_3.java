/* Decompiler 27ms, total 178ms, lines 70 */
import java.util.Scanner;
import java.util.Stack;

public class b1_3 {
   private static Scanner a;
   // $FF: synthetic field
   private static boolean a = !b1_3.class.desiredAssertionStatus();

   public static void main(String[] var0) {
      Stack var8 = new Stack();

      while(a.hasNext()) {
         if (a.hasNextDouble()) {
            var8.push(a.nextDouble());
         } else {
            double var6 = 0.0D;
            String var1;
            String var2;
            if (!(var2 = var1 = a.next()).equals("+") && !var2.equals("-") && !var2.equals("*") && !var2.equals("/")) {
               System.err.println("ERROR: invalid operator!");
               System.exit(1);
            }

            if (var8.isEmpty()) {
               System.err.println("ERROR: two operands missing!");
               System.exit(2);
            }

            double var4 = (Double)var8.peek();
            var8.pop();
            if (var8.isEmpty()) {
               System.err.println("ERROR: one operand missing!");
               System.exit(3);
            }

            double var9 = (Double)var8.peek();
            var8.pop();
            if (var1.equals("+")) {
               var6 = var9 + var4;
            } else if (var1.equals("-")) {
               var6 = var9 - var4;
            } else if (var1.equals("*")) {
               var6 = var9 * var4;
            } else if (var1.equals("/")) {
               if (var4 == 0.0D) {
                  System.err.println("ERROR: divide by zero!");
                  System.exit(4);
               }

               var6 = var9 / var4;
            }

            var8.push(var6);
         }

         if (!a && var8.isEmpty()) {
            throw new AssertionError();
         }

         System.out.print("Stack: " + var8);
         System.out.println();
      }

   }

   static {
      a = new Scanner(System.in);
   }
}
