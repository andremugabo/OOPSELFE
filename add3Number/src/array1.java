import java.util.*;

public class array1 {
	public static void main(String args[]) {
		int[] arr;// Array declaration
		arr = new int[5];// Giving the size an array
		int[] array_e = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		arr[0]=10;
		arr[1]=25;
		arr[2]=22;
		arr[3]=30;
		arr[4]=26;
		
		
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println("Element at index "+ i +" is "+arr[i]);
		}
		System.out.println("Enter element of array_e:");
		for(int j=0;j<array_e.length;j++) {
			array_e[j]= sc.nextInt();
		}
		
		
		for(int k = 0;k<array_e.length;k++) {
			System.out.println("Element at index "+k+" is "+array_e[k]);
		}
		
 	}
}
