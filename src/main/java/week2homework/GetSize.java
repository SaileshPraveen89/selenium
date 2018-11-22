package week2homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize 

{

	public static void main(String[] args) 
	{

		
		//Set Property of Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch Chrome Driver
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		//Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Get Size
		System.out.println("GetSize");
		System.out.println(driver.findElementById("color").getSize().getHeight());
		System.out.println(driver.findElementById("color").getSize().getWidth());
		System.out.println(driver.findElementById("color").getSize());
		
		//Get TagName
		System.out.println("Get TagName");
		System.out.println(driver.findElementById("color").getTagName());
		
		//Close the browser
		driver.close();

	}

}
