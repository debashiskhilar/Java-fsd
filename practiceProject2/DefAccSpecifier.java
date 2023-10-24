package practiceProject2;

class AccessSpecifier {
	
	//show method with default access specifier
	void show() {
		System.out.println("This is Default Access Specifier Method");
	}
}
public class DefAccSpecifier{
	public static void main(String[] args) {
		System.out.println("Accessing default method from another class");
		AccessSpecifier obj = new AccessSpecifier();
		obj.show();
		
		
	}

}
