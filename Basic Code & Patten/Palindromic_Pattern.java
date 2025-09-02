import java.util.*;

public class Palindromic_Pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // first half (descending)
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }

            // second half (ascending)
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
