package week2homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl 
{

	public static void main(String[] args) 
	{
		String getCurrUrl;
		
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
		
		//Get Current Url
		getCurrUrl=driver.getCurrentUrl();
		
		System.out.println("Current Url of testleaf herokuapp is :" + getCurrUrl);
		
		//Close the browser
		driver.close();

	}

}
