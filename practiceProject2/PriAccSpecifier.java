package practiceProject2;

class PrAccessSpecifier{
	private void show() {
		System.out.println("This is Private Method");
	}
}
public class PriAccSpecifier {

	public static void main(String[] args) {
		System.out.println("Accessing private method from another class");
		PrAccessSpecifier obj = new PrAccessSpecifier();
		//obj.show();
		//We are trying to access a private method of another class. Which is not posssible.
	}
	
}
