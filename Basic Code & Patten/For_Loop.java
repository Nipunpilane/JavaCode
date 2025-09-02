import java.util.*;

public class For_Loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Loops");
        int loop = sc.nextInt();
        for (int i = 0; i <= loop; i++) { //for (initialization; condition; increment/decrement)
            System.out.println(i);
            sc.close();
        }

    }

}
