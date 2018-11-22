package week6;

import java.util.HashMap;
import java.util.Map;

public class JavaCollectionsMaps 
{
	   static int i,c=0,res;
	    static int wordcount(String s)
	    {
	        char ch[]= new char[s.length()];      
	        //in string especially we have to mention the () after length
	        for(i=0;i<s.length();i++)
	        {
	            ch[i]= s.charAt(i);
	            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
	            c++;
	        }
	        return c;
	    }

	public static void main(String[] args) 
	{
		Map <Integer,String> empRecord=new HashMap <Integer,String>();
		empRecord.put(1000, "Sailesh");
		empRecord.put(1001, "Praveen");
		empRecord.put(1002, "Venkat");
		empRecord.put(1003, "Raju");
		
		System.out.println(empRecord.keySet());
		System.out.println(empRecord.containsKey("1001"));
		
		empRecord.put(1011, "Cognizant");
		System.out.println(empRecord.containsValue("Cognizant"));
		
		 res=JavaCollectionsMaps.wordcount("   manchester united is also known as red devil ");
	        //string is always passed in double quotes
	        
	        System.out.println("The number of words in the String are :  "+res);

	}

}
