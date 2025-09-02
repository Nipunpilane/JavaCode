import java.util.*;

public class Function{
public static void printMyName(String name){
    System.out.println("Your Sweet name is :-"+ name);
    return ;  
}
  public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your name To Display");
        String name =sc.next();
        printMyName(name);


    }
}