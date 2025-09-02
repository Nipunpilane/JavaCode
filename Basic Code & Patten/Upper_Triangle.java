import java.util.*;
public class Upper_Triangle {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number To form upper Triangle");
        
        int upper =sc.nextInt();
for(int i=1;i<=upper;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
        
    }
System.out.println();
}
}  
}



// Output:-
// *
// **
// ***
// ****
// *****