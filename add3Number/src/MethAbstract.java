abstract class MethAbstract {
	abstract void add(int a ,int b);
	abstract void add(double a,double b);
}
 

//QUESTION 2
class Addnum extends MethAbstract{
	public void add(int a,int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void add(double a,double b) {
		double d = a+b;
		System.out.println(d);
	}
	
}

class Main{
	public static void main(String[] args) {
		Addnum obj = new Addnum();
		obj.add(2, 4);
		obj.add(3.5, 8.14);
	}
}