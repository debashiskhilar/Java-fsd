package practiceProject7;

public class Outer{
	private int a = 10;
	class Inner{
		public void display() {
			System.out.println("This is inner class. and we are accessing the private value outside of the class");
			System.out.println("The value of a is "+ a);
		}
	}
}
