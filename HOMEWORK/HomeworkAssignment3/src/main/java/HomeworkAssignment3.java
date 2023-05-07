//Homework Assignment #3

public class HomeworkAssignment3 {
    public static void main(String[] args){
        int count;
        
        for( int i = 1; i <=100 ; i++)
        { 
            count=0;
                       
            
            for(int j = 1; j<=i ;j++)
            {
               if(i%j ==0)
               {
                   count++;
               }
            }
           
           if(count==2)
           {
               System.out.println(i+" is prime");
           }
           else if((i % 3 == 0) && (i % 5 == 0))
            {
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}
