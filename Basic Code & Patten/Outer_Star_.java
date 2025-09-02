import java.util.*;
public class Outer_Star_ {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num for only star print in outer layer\n");
        int outer =sc.nextInt();
        
 for(int i=1;i<=outer;i++){
         for(int j=1;j<=outer;j++){
              if(i==1 || j==1 ||i==outer||j==outer){
                System.out.print("*");
              }
              else{
                System.out.print(" ");
              }
         }
         System.out.println();
    
        }
    }
}

// OutPut:-
// 5
// *****
// *   *
// *   *
// *   *
// *****