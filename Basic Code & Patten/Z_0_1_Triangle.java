public class Z_0_1_Triangle {
    public static void main(String args[]){
        int z_1 =5;
        for(int i=1;i<=z_1;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if((sum%2==0)){
                    System.out.print("1 ");
                    
                }
                else{
                    System.out.print("0 ");
                }

            }
            System.out.println();
            
        }
    }
}
