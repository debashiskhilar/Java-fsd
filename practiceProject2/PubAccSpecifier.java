package practiceProject2;

class PuAccessSpecifier{
	public void show() {
		System.out.println("This is public method");
	}
}
public class PubAccSpecifier {

	public static void main(String[] args) {
		System.out.println("Accessing Public method from another class");
		PuAccessSpecifier obj = new PuAccessSpecifier();
		obj.show();

	}

}
