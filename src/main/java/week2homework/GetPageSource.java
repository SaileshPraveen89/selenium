package week2homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource 
{

	public static void main(String[] args) 
	{
		String getPageSource;
		
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
		
		//Get Page Source
		getPageSource=driver.getPageSource();
		
		System.out.println("Page Source of testleaf herokuapp is :" + getPageSource);
		
		//Close the browser
		driver.close();

	}

}
