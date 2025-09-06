import java.util.Scanner;
public class FindNumberArray {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To Create Array Box In memory:-");
        int size =sc.nextInt();
        int num[]= new int[size];
        //Input For Loop 
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
       System.out.println("Enter Your Value to Find:-");
       int x =sc.nextInt();
       //Output
       for(int i=0;i<=num.length;i++){
       if(num[i]==x){
        System.err.println(" Your Value Found at index:-"+ i);
       }      
       }   
    }
}
