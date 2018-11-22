package scripts;
import java.util.Scanner;
public class Palindrome 
{

	public static void main(String[] args) 
	{
		//Scanner is used to get user input dynamically.
		Scanner scan=new Scanner(System.in);
		
		int originalInput=scan.nextInt();
		int orignalInputMove=originalInput;
		// Variable Initialization
		int reversalInput=0;
		int quotient;
		int reminder;
		
		// Convert the Negative Number to Positive Number
	while(originalInput < -1)
	{
	originalInput=originalInput* -1;
	}
	
	orignalInputMove=originalInput;
	
		// logic to check the input number is an palindrome
	while(originalInput > 0)
	{
	quotient=originalInput / 10;
	reminder=originalInput % 10;
	reversalInput=reversalInput*10+ reminder;
	originalInput=quotient;
	}
	
		//compare reversalInput & originalInput
	if(reversalInput == orignalInputMove)
	{
	System.out.println("The inputNumber is an Palindrome" + originalInput);
	}
	else
	{
	System.out.println("The inputNumber is not an Palindrome" + originalInput);
	} 


	}

}
