package practiceProject3;
//example of method calling
public class VolumeOfBoxMain {

	public static void main(String[] args) {
		VolumeOfBox obj = new VolumeOfBox();
		//calling the method from another class
		double volume = obj.display(10,15,12);
		System.out.println("Volume of box is "+volume);

	}
}
