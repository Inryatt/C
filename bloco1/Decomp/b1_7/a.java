/* Decompiler 21ms, total 144ms, lines 100 */
import java.util.Scanner;

class a {
   private static Scanner a;
   private a a;
   private a b;
   private String a;
   private double a;
   boolean a;
   // $FF: synthetic field
   private static boolean b = !a.class.desiredAssertionStatus();

   private static boolean a(String var0) {
      String[] var1 = new String[]{"+", "-", "*", "/"};
      boolean var2 = false;

      for(int var3 = 0; !var2 && var3 < 4; ++var3) {
         var2 = var1[var3].equals(var0);
      }

      return var2;
   }

   public a(b var1) {
      a var10000;
      boolean var10001;
      label21: {
         super();
         this.a = null;
         this.b = null;
         this.a = null;
         this.a = true;
         if (!a.hasNext()) {
            var10000 = this;
         } else {
            if (a.hasNextDouble()) {
               this.a = a.nextDouble();
               return;
            }

            this.a = a.next();
            this.a = new a(var1);
            this.b = new a(var1);
            var10000 = this;
            if (a(this.a) && this.a.a && this.b.a) {
               var10001 = true;
               break label21;
            }
         }

         var10001 = false;
      }

      var10000.a = var10001;
   }

   public final void a() {
      if (!b && !this.a) {
         throw new AssertionError();
      } else if (this.a == null) {
         System.out.print(this.a);
      } else {
         System.out.print("(");
         this.a.a();
         System.out.print(this.a);
         this.b.a();
         System.out.print(")");
      }
   }

   public final double a() {
      if (!b && !this.a) {
         throw new AssertionError();
      } else {
         double var1 = 0.0D;
         if (this.a == null) {
            var1 = this.a;
         } else {
            double var3 = this.a.a();
            double var5 = this.b.a();
            if (this.a.equals("+")) {
               var1 = var3 + var5;
            } else if (this.a.equals("-")) {
               var1 = var3 - var5;
            } else if (this.a.equals("*")) {
               var1 = var3 * var5;
            } else if (this.a.equals("/")) {
               var1 = var3 / var5;
            }
         }

         return var1;
      }
   }

   static {
      a = new Scanner(System.in);
   }
}
