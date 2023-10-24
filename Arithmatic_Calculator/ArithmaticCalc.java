package Arithmatic_Calculator;

import java.util.Scanner;

public class ArithmaticCalc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArithCalMethod obj = new ArithCalMethod();
		
		while(true) {
			System.out.println("***** ARITHMATIC CALCULATOR *****");
			System.out.println("1.Addition +");
			System.out.println("2.Substraction -");
			System.out.println("3.Multiplication *");
			System.out.println("4.Division /");
			System.out.println("5.Modulus %");
			System.out.println("6.Exit ");
			System.out.println("-----------------------------------");
			System.out.println("Enter Which operation do you want: ");
			int choice = sc.nextInt();
			
			System.out.println("Enter Value for num1 and num2: ");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			obj.num1=num1;
			obj.num2=num2;
			
			
			if(choice == 1) {
				obj.add(num1,num2);
			}
			else if(choice == 2) {
				obj.sub(num1,num2);
			}
			else if(choice == 3) {
				obj.multi(num1,num2);
			}
			else if(choice == 4) {
				obj.div(num1,num2);
			}
			else if(choice == 5) {
				obj.mod(num1,num2);
			}
			else if(choice == 6) {
				System.out.println("You performed a exit operation");
				break;
			}
			else {
				System.out.println("You entered a wrong choice");
				System.out.println("Please enter between [1,2,3,4,5,6]");
			}
		}
		

	}

}
