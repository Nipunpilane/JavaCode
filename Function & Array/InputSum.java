import java.util.*;

public class InputSum { 
  public static int sum(int a,int b){
    System.out.println("Your Sum of "+a+" And "+ b+" is :- "+(a+b));
    return ; 
  }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number For Sum:-");
        int one=sc.nextInt();
        int two=sc.nextInt();
        sum(one,two);
        sc.close();
    }
    
}
