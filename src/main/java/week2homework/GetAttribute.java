package week2homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute 
{
	
	public static void main(String[] args)
	{
		String getAttr;
		
		//Set Property of Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch Chrome Driver
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		//Wait 30 seconds
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Get Attribute
	    getAttr=driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");	
	
		System.out.println(getAttr);
		
		//Close the browser
		driver.close();
	}

}
