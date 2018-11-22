package dailyCodeChallenge;

import java.util.Scanner;

public class SwapofString 
{

	public static void main(String[] args) 
	{
	
		Scanner Scan=new Scanner(System.in);
		
		//Get String Inputs
		String firststring=Scan.next();
		String secondstring=Scan.next();
		
		//Swapping of Strings
		firststring = firststring + secondstring;
		secondstring = firststring.substring(0, firststring.length()  - secondstring.length());
        firststring = firststring.substring(secondstring.length(), firststring.length());

        //Display Swapped Result
        System.out.println(firststring + " " + secondstring);
		
	}

}
