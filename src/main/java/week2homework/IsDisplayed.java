package week2homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed 
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
		
		//IsDisplayed
		System.out.println(driver.findElementById("color").isDisplayed());
		System.out.println(driver.findElementById("color1").isDisplayed());
		
		//Close the browser
		driver.close();

	}

}
