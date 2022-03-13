/* Decompiler 85ms, total 242ms, lines 123 */
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1_6 {
   public static void main(String[] var0) {
      if (var0.length < 2) {
         System.err.println("Usage: java -ea b1_6 <dictionary-file> <input-file> ...");
         System.exit(1);
      }

      Map var1 = a(var0[0]);

      for(int var2 = 1; var2 < var0.length; ++var2) {
         try {
            File var3 = new File(var0[var2]);
            Scanner var7 = new Scanner(var3);

            while(var7.hasNextLine()) {
               String var4 = var7.nextLine();
               System.out.print("\"" + var4 + "\" -> \"");
               String[] var8 = var4.split("\\s+");

               for(int var5 = 0; var5 < var8.length; ++var5) {
                  if (var5 > 0) {
                     System.out.print(" ");
                  }

                  System.out.print(a(var1, var8[var5], new String[0]));
               }

               System.out.println("\"");
            }

            var7.close();
         } catch (IOException var6) {
            System.err.println("ERROR: reading input file \"" + var0[var2] + "\"!");
            System.exit(1);
         }
      }

   }

   private static Map a(String var0) {
      HashMap var1 = new HashMap();

      try {
         File var6 = new File(var0);
         Scanner var7 = new Scanner(var6);

         while(true) {
            String[] var2;
            do {
               if (!var7.hasNextLine()) {
                  var7.close();
                  return var1;
               }
            } while((var2 = var7.nextLine().split("\\s+")).length <= 0);

            if (var2.length < 2) {
               System.err.println("ERRO: linha mal formatada!");
               System.exit(1);
            }

            if (var1.containsKey(var2[0])) {
               System.err.println("ERRO: palavra já existe!");
               System.exit(1);
            }

            String var3 = var2[1];

            for(int var4 = 2; var4 < var2.length; ++var4) {
               var3 = var3 + " " + var2[var4];
            }

            var1.put(var2[0], new a(var3));
         }
      } catch (IOException var5) {
         System.err.println("ERROR: reading dictionary file!");
         System.exit(1);
         return var1;
      }
   }

   private static String a(Map var0, String var1, String[] var2) {
      String var3 = "";
      a var4;
      if ((var4 = (a)var0.get(var1)) != null) {
         String[] var10 = var4.a.split("\\s+");

         for(int var5 = 0; var5 < var10.length; ++var5) {
            String var7 = var1;
            String[] var6 = var2;
            boolean var8 = false;

            for(int var9 = 0; !var8 && var9 < var6.length; ++var9) {
               var8 = var7.equals(var6[var9]);
            }

            if (var8) {
               System.err.println("ERRO: dicionário com recursão infinita!");
               System.exit(1);
            }

            if (var3.length() > 0) {
               var3 = var3 + " ";
            }

            var6 = new String[var2.length + 1];
            System.arraycopy(var2, 0, var6, 0, var2.length);
            var6[var2.length] = var1;
            var3 = var3 + a(var0, var10[var5], var6);
         }
      } else {
         var3 = var1;
      }

      return var3;
   }
}
