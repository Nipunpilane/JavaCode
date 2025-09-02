import java.util.*;
public class Inverted_Half_Pyramid {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number To form Inverted Half Triangle");
        int inver =sc.nextInt();
        for(int i=1;i<=inver;i++){

            for(int j=1;j<=inver-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");    
            }
            System.out.println();  
        }  sc.close();
    }
}


// Output:-
//     *
//    **
//   ***
//  ****
// *****