package scripts;

public class MethodsWithParameters 
{
	public static void main(String[] args)
	{
		//string variables declaration in main 
		String str1="Test Leaf Java";
		String str2="Test Leaf Java";
		String str3=new String("Test Leaf Java");
		String str4=new String("test leaf java");
		
		// Method call. Perform below operations:
		//str1.equals(str2)
		//str1=str3
		//str1.equals(str3)
		//str1.equalsIgnoreCase(str4)
		stringEquals(str1,str2,str3,str4);
		
		//Method call. Perform operation str1=str2
		stringEqualsab(str1,str2);
		System.out.println(str1);
		System.out.println(str2);
	}

	public static String stringEqualsab(String a,String b)
	{
		//str1=str2
		String c;
		System.out.println("=======================");
		System.out.println("str1=str2");
		System.out.println("=======================");
		c=(a=b);
		return c;
	}


	public static String stringEquals(String a,String b,String c,String d)
	{

		//str1.equals(str2)
		System.out.println("=======================");
		System.out.println("str1.equals(str2)");
		System.out.println("=======================");
		a.equals(b);
		System.out.println(a);
		System.out.println(b);


		//str1=str3
		System.out.println("=======================");
		System.out.println("str1=str3");
		System.out.println("=======================");
		c=d;
		System.out.println(c);
		System.out.println(d);


		//str1.equals(str3)
		System.out.println("=======================");
		System.out.println("str1.equals(str3)");
		System.out.println("=======================");
		a.equals(c);
		System.out.println(a);
		System.out.println(c);


		//str1.equalsIgnoreCase(str4)
		System.out.println("============================");
		System.out.println("str1.equalsIgnoreCase(str4)");
		System.out.println("============================");
		a.equalsIgnoreCase(d);
		System.out.println(a);
		System.out.println(d);
		return d;

	}

}


