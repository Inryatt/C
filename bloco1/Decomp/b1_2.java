/* Decompiler 249ms, total 373ms, lines 137 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1_2 {
   private static Scanner a;
   private static Map a;
   // $FF: synthetic field
   private static boolean a = !b1_2.class.desiredAssertionStatus();

   public static void main(String[] var0) {
      while(a.hasNextLine()) {
         Scanner var1 = new Scanner(a.nextLine());
         System.out.println("result = " + a(var1));
         var1.close();
      }

   }

   private static double a(Scanner var0) {
      if (!a && var0 == null) {
         throw new AssertionError();
      } else {
         double var1 = 0.0D;
         double var4 = 0.0D;
         String var3;
         if (a(var3 = var0.next())) {
            if (a.containsKey(var3)) {
               var4 = (Double)a.get(var3);
            } else if (!var0.hasNext()) {
               System.err.printf("ERROR: variable \"" + var3 + "\" not defined\n");
               System.exit(1);
            }
         } else {
            Scanner var6;
            boolean var7 = (var6 = new Scanner(var3)).hasNextDouble();
            var6.close();
            if (var7) {
               var4 = Double.parseDouble(var3);
            } else {
               System.err.printf("ERROR: invalid number \"%s\"\n", var3);
               System.exit(1);
            }
         }

         if (var0.hasNext()) {
            String var10;
            if ((var10 = var0.next()).equals("=")) {
               if (!a(var3)) {
                  System.err.printf("ERROR: invalid assignment\n");
                  System.exit(1);
               }

               var1 = a(var0);
               a.put(var3, var1);
            } else {
               double var11 = a(var0);
               byte var9 = -1;
               switch(var10.hashCode()) {
               case 42:
                  if (var10.equals("*")) {
                     var9 = 2;
                  }
                  break;
               case 43:
                  if (var10.equals("+")) {
                     var9 = 0;
                  }
                  break;
               case 45:
                  if (var10.equals("-")) {
                     var9 = 1;
                  }
                  break;
               case 47:
                  if (var10.equals("/")) {
                     var9 = 3;
                  }
                  break;
               case 61:
                  if (var10.equals("=")) {
                     var9 = 4;
                  }
               }

               switch(var9) {
               case 0:
                  var1 = var4 + var11;
                  break;
               case 1:
                  var1 = var4 - var11;
                  break;
               case 2:
                  var1 = var4 * var11;
                  break;
               case 3:
                  if (var11 == 0.0D) {
                     System.err.printf("ERROR: divide by zero\n");
                     System.exit(1);
                  }

                  var1 = var4 / var11;
               case 4:
                  break;
               default:
                  System.err.printf("ERROR: invalid operator \"%s\"\n", var10);
                  System.exit(1);
               }
            }
         } else {
            var1 = var4;
         }

         return var1;
      }
   }

   private static boolean a(String var0) {
      if (!a && var0 == null) {
         throw new AssertionError();
      } else {
         boolean var1 = var0.length() > 0 && Character.isLetter(var0.charAt(0));

         for(int var2 = 1; var1 && var2 < var0.length(); ++var2) {
            var1 = Character.isLetterOrDigit(var0.charAt(var2));
         }

         return var1;
      }
   }

   static {
      a = new Scanner(System.in);
      a = new HashMap();
   }
}
