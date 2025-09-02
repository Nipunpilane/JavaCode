import java.util.*;
public class Switch {
    public static void main(String args[]){
        System.out.println("Enter Number Between 1 to 3");
        Scanner sc =new Scanner(System.in);
        int abc =sc.nextInt();
       switch(abc){
        case 1:
        System.out.println("First");
        break;
        case 2:
        System.out.println("second");
        break;
        case 3:
        System.out.println("Three");
        break;
        default:
        System.out.println("Enter in Between ! to 3");
        
         sc.close();
       }
        }
        
    }