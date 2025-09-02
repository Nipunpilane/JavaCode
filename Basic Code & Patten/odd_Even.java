import java.util.*;
public class odd_Even {
    public static void main(String args[]){
        System.out.println("Enter A Number To check Even or Odd");
        Scanner add =new Scanner(System.in);
        int  o_e = add.nextInt();
           add.close();  // Add.close use for avoid memory leack it not nessory to write it just a warning
        if(o_e%2==0)
        System.out.println("Number is Even");
        else 
        System.out.println("Number is Odd");
      
    }
}


