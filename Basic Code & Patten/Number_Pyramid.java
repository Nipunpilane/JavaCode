import java.util.*;
public class Number_Pyramid {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number To Print Pyramid");
        
        int py =sc.nextInt();
        for(int i=1;i<=py;i++){
            for(int j=1;j<py-i;j++){
                System.out.print(" ");   
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+ " ");
                
            }
            System.out.println();
            
        }
    }
    
}

// OutPut:-
// Enter Number To Print Pyramid
// 5
//    1 
//   2 2
//  3 3 3
// 4 4 4 4
// 5 5 5 5 5