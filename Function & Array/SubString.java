import java.util.*;

public class SubString {
    public static void main(String args[]){
        String sentence ="My name is Nipun";
        //SubString(begin index , end index)
        
        String name =sentence.substring(11,sentence.length());
        System.out.println(name);

          String name1 =sentence.substring(0,7);
        System.out.println(name1);
        

          String name2 =sentence.substring(3);
        System.out.println(name2);

        
    }
}
