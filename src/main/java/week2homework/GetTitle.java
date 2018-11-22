package week2homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle 
{
	public static void main(String[] args)
	{
		String title;
		
		//Set Property of Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch Chrome Driver
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("http://testleaf.herokuapp.com/");
		
		//Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Get Title
		title=driver.getTitle();
		
		if(driver.getTitle().contains("TestLeaf"))
		{
			System.out.println("I confirm that title contains Test Leaf");
			
		}
		else
		{
			System.out.println("The title does not contains the word Test Leaf");
		}
			
		System.out.println("Title of testleaf herokuapp is" + title);
		
		//Close the browser
		//driver.close();
	}

}
