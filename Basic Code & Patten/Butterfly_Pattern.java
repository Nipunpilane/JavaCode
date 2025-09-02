import java.util.*;

public class Butterfly_Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int star = sc.nextInt();

        // Upper half
        for (int i = 1; i <= star; i++) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            int spaces = 2 * (star - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = star; i >= 1; i--) {
            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces
            int spaces = 2 * (star - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}

// Output:-
// Enter number of rows: 5
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *