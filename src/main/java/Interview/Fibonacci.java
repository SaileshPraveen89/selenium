package Interview;

public class Fibonacci 
{
	public static void main(String args[])
	{
		int x=0;
		int[] input ={1,2,3,4,5,6,7};
		System.out.println("Fibonacci Series");
		for(int i=0;i<input.length;i++)
		{
			x=x+input[i];
			System.out.println(x);
		}
	}

}
