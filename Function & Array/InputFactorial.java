// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class InputFactorial {

   public static void factorial(int var0 ){
    if(var0<0){
        System.out.println("Invalid Number");
        return ;
        
    }
    int fact =1;
   for(int i=var0;i>=1;i--){
    fact=fact*i;
   }
 System.out.println(fact);
 return;
 
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter Number For Factorial:-");
      int var2 = var1.nextInt();
      factorial(var2 );
   }
}
