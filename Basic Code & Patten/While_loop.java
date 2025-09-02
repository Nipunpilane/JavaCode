import java.util.*;

public class While_loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Loops");
        int loop = sc.nextInt();
        int i = 0; // initialization
        while (i <= loop) {// condition
            System.out.println(i);
            i++;// increment/decrement

        }
        sc.close();

    }

}
