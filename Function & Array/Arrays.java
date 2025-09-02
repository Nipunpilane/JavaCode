public class Arrays {
    public static void main(String args[]){
        //Defining an array in java
        //type[]arrayName =new type[size];
        // int marks[]={97,98,99};   This is also write statement not required line 8 To 12
        int[] marks =new int [3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=99;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks);
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);    
        }
    }   
}
