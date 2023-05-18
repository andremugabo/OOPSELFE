
public class TwoDimenssion {

	public static void main(String args[]) {
		int[] arr = {1,2,3,4,1,23,24};// One dimensional array
		int sum = 0;
		
		int[][] twoDArr = {{1,2,3},{4,5,6},{2,2,3}};
		
		for(int i =0;i<arr.length;i++) {
			System.out.println("The elements of array are "+arr[i]);
			sum = sum+arr[i];
		}
		
		System.out.println("The of all element is :"+sum);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(twoDArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
