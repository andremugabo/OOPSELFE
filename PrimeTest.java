public class PrimeTest {
    public static void main(String arg[]){

        int count,i,half;
        
        for(i = 1; i<= 100; i++){
            count =0;
            half= i/2;
            for(int j = 2; j<=half; j++){
                if (i%j == 0) {
                    count=count+1;
                    break;
                    // System.out.println(" for i ="+ i +" j = "+j);
                }
            }
            if(count == 0 && i!=1 ){
            System.out.println(i+" is a prime number");
            }
            // System.out.println(i);
        }

        
        
    }
}
