package scripts;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) 
	{
		//Scanner is used to get user input dynamically.
		Scanner Scan=new Scanner(System.in);
		
		// TODO Auto-generated method stub
		// Varaible Initialization
		int quotient;
		int reminder;
		int inputNumber=Scan.nextInt();
		int sumOfDigit=0;
		
		//Spilt the Input Number
		while(inputNumber > 0)
		{
			quotient= inputNumber/10;
			reminder= inputNumber%10;
			inputNumber=quotient;
		//Sum of Digit of Input Number	
			sumOfDigit=sumOfDigit + reminder;
		}
		System.out.println("Sum of Digit of given inputNumber:" 
				+ sumOfDigit);
	}

}
