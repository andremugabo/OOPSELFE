import java.util.*;
public class ifStatementsB {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Input now: ");
        int input = reader.nextInt();
        
        if(input > 10){
            System.out.println("More");
        }else{
            System.out.println("Less");
        }
        
    }
}
