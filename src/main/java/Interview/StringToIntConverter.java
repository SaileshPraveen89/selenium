package Interview;

import javax.swing.Spring;

public class StringToIntConverter 
{
	public static void main(String args[]) 
	{
		String teststring1 = "123456789";
		String teststring2 = "00123";
		String errorstring = "78787";
		System.out.println(" First Set");
		try {
			// using Integer.parse

			int int1 = Integer.parseInt(teststring1, 10);

			// default radix = 10

			int int2 = Integer.parseInt(teststring2);

			System.out.println("with ParseInt method, int1 = " + int1 + " and int2 = " + int2);

			// error situation

			int interror = Integer.parseInt(errorstring);

			System.out.println("with ParseInt method, interror =" + interror);

		} 
		
		catch (NumberFormatException ex) 
		{

			System.err.println("numberformatexception in ParseInt, " + ex.getMessage());

		}
		
		System.out.println(" Second Set");
		  try {
		 
		 // using Integer.valueof without radix
		 
		 int int1 = Integer.valueOf(teststring1);
		 
		 int int2 = Integer.valueOf(teststring2);
		 
		 System.out.println("with valueof method, int1 = " + int1 +
		  " and int2 = " + int2);
		 
		  // error situation
		 
		 int interror = Integer.valueOf(errorstring);
		 
		 System.out.println("with valueof method, interror =" + interror);
		  
		 } catch (NumberFormatException ex) {
		 
		  System.err.println("numberformatexception in valueof, " +
		  ex.getMessage());
		 
		 }
		
	}

}
