package practiceProject9;

import java.util.Scanner;

public class ArrayImp {

	public static void main(String[] args) {
		
		//Different types of array object creation
		int a[]={10,11,12,13};
		int[] b=new int[]{20,21,22,23};
		int c[]=new int[4];
		c[0]=70;
		c[1]=80;
		c[2]=90;
		c[3]=100;

		System.out.println("First array..");
		for (int i=0;i<4;i++)
			System.out.println(a[i]);

		System.out.println("\nSecond array..");
		for(int i=0;i<4;i++)
			System.out.println(b[i]);

		System.out.println("\nThird array..");
		for(int val:c)
			System.out.println(val);
		//make an user input for array element by scanner class
		Scanner sc=new Scanner(System.in);
		int d[]=new int[4];
		System.out.println("Enter values...");
		for(int i=0;i<4;i++)
		{
			int x=sc.nextInt();
			d[i]=x;
		}
		System.out.println("\nFourth array..");
		for(int val:d)
			System.out.println(val);

	}

}
