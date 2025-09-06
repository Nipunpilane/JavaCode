import java.util.Scanner;
public class DisplayArrayElement {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To Create Array Box In memory:-");
        
        int size =sc.nextInt();
        int num[]= new int[size];
        //Input For Loop 
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Your Array  Value:-");
        //Output For Loop 
        
        for(int i=0;i<=size;i++){
            System.out.println(num[i]);
        }
        System.out.println();
        
    }
}
