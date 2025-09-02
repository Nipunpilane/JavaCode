import java.util.*;

public class UserInputArray {
    public static void main(String args[]){
        System.out.println("Enter Number");
        
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();

        int user[]=new int [size];

        for (int i=0;i<size;i++){
            user[i]=sc.nextInt();
        }
System.out.println("You Input:-");

        for(int i=0;i<size;i++){
            System.out.println(user[i]);
            
        }
    }
}
