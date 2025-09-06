import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value:-");
        
        int rows =sc.nextInt();
        int cols=sc.nextInt();
        int [][] num =new int[rows][cols];
//Input:-
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
        num[i][j]=sc.nextInt();
    }
}  
System.out.println("Your  2D Array Output:-");
//Output:-
for(int i=0;i<rows;i++){
    for(int j=0;j<cols;j++){
      System.out.print(num[i][j]+" ");
      
    }
    System.out.println();
}  
sc.close();
}   
}
