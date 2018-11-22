package scripts;
import java.util.Scanner;
public class Mutiplication 
{
	public static void main(String[] args)
	{
	// Get user input dynamically.
	Scanner scan=new Scanner(System.in);

	// Variable Initialization
	int initialInputNumber=1;
	int multiplicationResult;
	int userInputNumber=scan.nextInt();
	
	System.out.println("Multiplication Table for" + userInputNumber );
	// Multiplication of userInputNumber
	for(initialInputNumber=1;initialInputNumber <=10; initialInputNumber++)
	{
	multiplicationResult=userInputNumber*initialInputNumber;
	System.out.println(userInputNumber + "*" + initialInputNumber
	+ "=" + multiplicationResult);
	}
	
	}
}
