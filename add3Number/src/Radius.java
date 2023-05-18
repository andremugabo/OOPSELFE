// QUESTION 1
import java.util.*;
public class Radius {
	public static void main(String[] args) {
		double radius,pi,area;
		pi = 3.14;
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the value of the Radius");
		radius = read.nextDouble();
		
		area = radius*radius*pi;
		
		System.out.println("The area of the Circle having a Radius: "+radius+" is :"+area);
		
	}
}
