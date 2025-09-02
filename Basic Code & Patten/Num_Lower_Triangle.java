// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Num_Lower_Triangle {
   public Num_Lower_Triangle() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter Number To form Inverted Half Triangle");
      int var2 = var1.nextInt();

      for(int var3 = 1; var3 <= var2; ++var3) {
         for(int var4 = 1; var4 <= var3; ++var4) {
            System.out.print("" + var4 + " ");
         }

         System.out.println();
         var1.close();
      }

   }
}



// Output:-
// Enter Number To form Inverted Half Triangle
// 5
// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1
