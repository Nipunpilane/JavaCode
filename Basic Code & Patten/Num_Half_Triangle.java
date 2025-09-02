import java.util.*;
public class Num_Half_Triangle {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number To form Inverted Half Triangle");
        int inver =sc.nextInt();
        for(int i=1;i<=inver;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j+" ");}
           
            System.out.println();  
          sc.close();
    }
}
}

// Output:-
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5