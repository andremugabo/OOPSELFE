/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class fact {
    public static void main(String[] args){
        
        for(int i = 1; i<=100; i++)
        {
            int facto = 1;
            
            for(int j=1 ; j<i ; j++)
            { 
              
               facto*=j;
              
              
                             
                
            }
            
             System.out.println("Factorial of  : "+i+" is "+facto);
             if((facto + 1)%i==0)
             {
                 System.out.println(i+"  is prime");
             }
        }
    }
}
