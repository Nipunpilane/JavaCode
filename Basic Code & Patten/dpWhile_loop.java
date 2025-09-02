import java.util.*;

public class dpWhile_loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number For Loops");
        int loop = sc.nextInt();
        int i = 0; // initialization
        do{
            System.out.println(i);
            i++;// increment/decrement
        }while(i<=loop);// condition
         sc.close();
        }
       

    }
