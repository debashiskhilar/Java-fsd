package practiceProject3;

public class MethodExe2 {
	
	public void sum(int a,int b) {
		System.out.println("Sum of two nos is "+(a+b));
	}
	public void sum(double x,double y) {
		System.out.println("The sum of two double value is "+(x+y));
	}
	
	public static void main(String[] args) {
		MethodExe2 obj =new MethodExe2();
		obj.sum(10,15);
		obj.sum(10.5,20.2);
		

	}
}
