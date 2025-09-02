import java.util.*;
public class IF {
    public static void main(String args[]){
        System.out.println("Enter Your age");
        Scanner sc= new Scanner(System.in);
        int age =sc.nextInt();
        if(age>18)System.out.println("You are Adult");
        else System.out.println("You are Not ADULT");
         sc.close();
    }
    
}
