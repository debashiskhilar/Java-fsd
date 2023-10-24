package practiceProject3;

public class MethodExe {
	//int value=100;
	int method(int value) {
		value= value+10;
		return value;
	}

	public static void main(String args[]) {
		MethodExe obj = new MethodExe();
		int v=obj.method(5);
		//System.out.println("Value is: "+obj.value);
		System.out.println(v);
	}
}
