package scripts;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		//Get a number and print Factorial

		//1. Get a number inputNum from the user through Scanner class and nextInt()
		System.out.println("Enter the number to find factorial of the Number. ");
		Scanner scan=new Scanner(System.in);
		int inputNum=scan.nextInt();

		//2. Declare a number factorial = 1 where factorial will be stored
		int factorial = 1;

		//3. If input number <0
		if(inputNum<0)
		{
		factorial=0;
		}

		//4. Iterate till inputNum through decrement and store data in factorial

		for(int num=inputNum;num>0;num--)
		{ 
		// num 	    5  	4	3	2	 1		0(End)

		factorial*=num;			   
		// factorial = 1*5=5 5*4=20 20*3=60	60*2=120 120*1=120		

		}

		//5. Print factorial in the console
		System.out.println("The factorial of "+inputNum+" is "+factorial);

	}

}
