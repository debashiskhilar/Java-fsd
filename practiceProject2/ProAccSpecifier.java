package practiceProject2;

class ProAccessSpecifier{
	protected void show() {
		System.out.println("This is a Protected Method");
	}
}

public class ProAccSpecifier {

	public static void main(String[] args) {
		System.out.println("Accessing protected method from another class");
		ProAccessSpecifier obj = new ProAccessSpecifier();
		obj.show();

	}

}
