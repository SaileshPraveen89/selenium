package scripts;
import java.util.Scanner;

public class SwitchCase
{
	public static void main(String[] args)
			{
				Scanner Scan=new Scanner(System.in);
				int userInput=Scan.nextInt();
				System.out.println("Enter the Day");
				String enterTheDay=Scan.next();
				
				switch(userInput)
				{
				case 1:					
				enterTheDay="Sunday";		
				System.out.println("1st Day of the Week");
				break;

				case 2:
				enterTheDay="Monday";		
				System.out.println("2nd Day of the Week");
				break;

				case 3:
				enterTheDay="Tuesday";			
				System.out.println("3rd Day of the Week");
				break;

				case 4:
				enterTheDay="Wednesday";			
				System.out.println("4th Day of the Week");
				break;

				case 5:
				enterTheDay="Thursday";			
				System.out.println("5th Day of the Week");
				break;

				case 6:
				enterTheDay="Friday";		
				System.out.println("6th Day of the Week");
				break;

				case 9:
				System.out.println("Invalid Day is Entered");
				break;
			
				}	
			}
}			

