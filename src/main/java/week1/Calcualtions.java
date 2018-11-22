package week1;

import java.util.Scanner;

public class Calcualtions 

{
	public static void main(String[] args) {
		int number1,number2;
		String operation;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number1");
		number1=scan.nextInt();
		System.out.println("Enter the number2");
		number2=scan.nextInt();
		System.out.println("Enter the operation : Add/Subtract/Multiply/Divide");
		operation=scan.next();
		if(operation.equalsIgnoreCase("Add"))
		{
			System.out.println(number1+number2);
		}
		else if (operation.equalsIgnoreCase("Subtract")) {
			System.out.println(number1-number2 );
		}
		else if (operation.equalsIgnoreCase("Multiply")) {
			System.out.println(number1*number2);
		}
		else if (operation.equalsIgnoreCase("Divide")) {
			System.out.println(number1/number2);
		}
		else
			System.out.println("The operation is invalid");
		scan.close();
	}
}
