import java.util.*;


public class Sum3Number{
    public static void main(String args[]){
        int num1,num2,num3;
        float  avg = 0,sum=0;
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the first Number:");
        num1 =  read.nextInt();
        System.out .println("Enter the second Number :");
        num2 = read.nextInt();
        System.out.println("Enter the third Number:");
        num3 = read.nextInt(); 

        sum = num1 + num2 + num3;
        avg = sum/3;

        System.out.println("The Sum is given by:"+sum);
        System.out.println("The average is given by:"+avg);
        

    }
}
