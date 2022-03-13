/* Decompiler 139ms, total 291ms, lines 97 */
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1_5 {
   private static Scanner a;

   public static void main(String[] var0) {
      Map var10 = a("numbers.txt");

      label42:
      while(a.hasNextLine()) {
         long var2 = 0L;
         long var4 = 0L;
         String var1;
         String var6 = (var1 = a.nextLine()).replace('-', ' ').replace(',', ' ').toLowerCase();
         Scanner var11 = new Scanner(var6);

         while(true) {
            while(true) {
               String var7;
               do {
                  if (!var11.hasNext()) {
                     var4 += var2;
                     System.out.println(var1 + " -> " + var4);
                     continue label42;
                  }
               } while((var7 = var11.next()).equals("and"));

               if (!var10.containsKey(var7)) {
                  System.err.println("Number text \"" + var7 + "\" does not exist in table!");
                  System.exit(1);
               }

               long var8;
               if ((var8 = (Long)var10.get(var7)) <= var2) {
                  var4 += var2;
                  var2 = 0L;
               }

               if (var2 != 0L && var8 > var2) {
                  var2 *= var8;
               } else {
                  var2 = var8;
               }
            }
         }
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
                  var1.put(var3, Long.parseLong(var7[0]));
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
