package dailyCodeChallenge;

public class CharArray {

	public static void main(String[] args) 
	{
		//Text=ABBCDDAAEERAAH

		//1. Find the count of the TextInput
		String textInput="ABBCDDAAEERAAH";
		int lengthCount;
		lengthCount=textInput.length();
		System.out.println("Array Length");
		System.out.println(lengthCount);
		
		//2. Find the position of A characters in the variable "TextInput"
		System.out.println("Index Position of A");
		char[] aChar=textInput.toCharArray();
		for(int i=0;i< aChar.length;i++)
		{
		int arrayAPosition=textInput.indexOf("A");
		System.out.println(arrayAPosition);
		}
		
		//3. Split the textInput in Array
		System.out.println("TextInput in ArrayList");
		char[] eachChar=textInput.toCharArray();
		
		for(int i=0;i< eachChar.length;i++)
		{
			
			System.out.println(eachChar[i]);
		
		}
				//3. Count the number of position of A character using Array.
				//4. Divide the count of position of A by 2
				//5. Get the result of Divide count of position A
				//6. Using the result; navigate to the particular index & print the middle value. 

	}

}
