import java.util.*;

public class Natural_Num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Loops");
        int loop = sc.nextInt();
        int sum=0;
        for (int i = 0; i <= loop; i++) { //for (initialization; condition; increment/decrement)
            sum+= i; // Equal === sum =sum+i; 
        }
        System.out.println(sum);
        sc.close();
        

    }

}
