package scripts;
import java.util.Scanner;

public class ToFindPrimeNumberAsperInput 
{
	public static void main(String[] args)
	{
		Scanner Scan=new Scanner(System.in);
		
		//Variable Initialization
		int inputNumber;
		int i,loopCount=0;
		String primeNumbers ="";
		int num;
		
		System.out.println("Enter the inputNumbers");
		
		//Dynamic Input
		for(i=1;i<10;i++)
		{
			inputNumber=Scan.nextInt();
			loopCount=loopCount+1;
		}
		
		System.out.println("Total inputNumbers entered are:" +loopCount);
	
		//Logic for primeNumbers
			
		inputNumber = Scan.nextInt();
	      Scan.close();
	     
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
