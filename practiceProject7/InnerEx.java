package practiceProject7;

public class InnerEx {
	
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.display();
		

	}

}
