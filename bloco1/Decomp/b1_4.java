/* Decompiler 40ms, total 189ms, lines 79 */
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1_4 {
   private static Scanner a;

   public static void main(String[] var0) {
      Map var5 = a("numbers.txt");

      while(a.hasNextLine()) {
         String var1 = a.nextLine().replace('-', ' ');
         Scanner var6 = new Scanner(var1);

         for(boolean var2 = true; var6.hasNext(); var2 = false) {
            String var3;
            String var4 = (var3 = var6.next()).toLowerCase();
            if (!var2) {
               System.out.print(" ");
            }

            if (var5.containsKey(var4)) {
               var3 = ((Integer)var5.get(var4)).toString();
            }

            System.out.print(var3);
         }

         System.out.println();
      }

   }

   private static Map a(String var0) {
      HashMap var1 = new HashMap();

      try {
         Scanner var6 = new Scanner(new File(var0));

         while(var6.hasNextLine()) {
            String var2;
            if ((var2 = var6.nextLine().trim()).length() > 0) {
               String[] var7;
               if ((var7 = var2.split(" - ")).length != 2) {
                  System.err.println("ERROR: syntax error in number file!");
                  System.exit(1);
               }

               String var3 = var7[1].toLowerCase();
               if (var1.containsKey(var3)) {
                  System.err.println("ERROR: repeated number \"" + var3 + "\" in number file!");
                  System.exit(1);
               }

               try {
                  var1.put(var3, Integer.parseInt(var7[0]));
               } catch (NumberFormatException var4) {
                  System.err.println("ERROR: invalid number \"" + var7[0] + "\" in number file!");
                  System.exit(1);
               }
            }
         }

         var6.close();
      } catch (IOException var5) {
         System.err.println("ERROR: reading number file!");
         System.exit(2);
      }

      return var1;
   }

   static {
      a = new Scanner(System.in);
   }
}
