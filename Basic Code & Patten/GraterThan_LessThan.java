import java.util.*;
public class GraterThan_LessThan {
public static void main(String args[]){
    System.out.println("Enter Two number Check Gretest Num Amoung Them ");
    Scanner sc= new Scanner(System.in);
        System.out.println("First");
        int a =sc.nextInt();
        System.out.println("Second");
        int b=sc.nextInt();
        if(a>b){
            System.out.println("First Number is Greater");
        }
       else if(b>a){
            System.out.println("Second Number is Greater");
        }
        else{
            System.out.println("Both are Equal");
        }

    sc.close();
}    

}
