import java.util.*;

public class InputMulti { 
  public static int multi(int a,int b){
   int result =a*b;
    return  result; 
  }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number For Multiplay:-");
        int one=sc.nextInt();
        int two=sc.nextInt();
       int result=multi(one,two);
       System.out.println("Your Multi  of "+one+" And "+ two +" is :- "+result);
    }
    
}
