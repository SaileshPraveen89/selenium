package scripts;
import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		// Variable Initialization
	      int i =0;
	      int num =0;
	      //Empty String
	      String  primeNumbers = "";
	      int inputNumber = 0;
	      
	      //Dynamic UserInput
	      
	      System.out.println("Enter the value of inputNumber:");
	      inputNumber = scanner.nextInt();
	      scanner.close();
	     
	      //Logic for Prime Number
	      for (i = 1; i <= inputNumber; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to "+ inputNumber + ":are:"+primeNumbers);
	     
	}
}	


