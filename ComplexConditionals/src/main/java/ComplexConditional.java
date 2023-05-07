import java.util.*;
public class ComplexConditional {
    public static void main(String[] args){
        Scanner reader = new Scanner (System.in);
//        System.out.println("Enter a Text :  ");
        String input = reader.next();
        String sOne = "abc";
        String sTwo = "z";
        
        if(input.contains(sOne) && input.contains(sTwo)){
                System.out.println("TRUE");
                
        }
        else
        {
                System.out.println("FALSE");
        }
    }
    
}
