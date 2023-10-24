package practiceProject1;
//Example of Implicit and Explicit Type casting
public class TypeCasting {

	public static void main(String[] args) {

		//Declaring a character variable
		char ch = 'D';
		System.out.println("Implicit Type casting");
		System.out.println("Value of ch1 is "+ch);
		
		int i = ch;
		System.out.println("Value of i is "+i);
		float f = ch;
		System.out.println("Value of f is "+f);
		long l = ch;
		System.out.println("Value of l is "+l);
		double d = ch;
		System.out.println("Value of d is "+d);
		
		System.out.println("\nExplicit Type Casting");
		double val = 55.2;
		int a = (int)val;
		System.out.println("Value of val is "+val);
		System.out.println("Value of a is "+a);
		
		float b = (float)val;
		System.out.println("Value of b is "+b);
		
	}

}
