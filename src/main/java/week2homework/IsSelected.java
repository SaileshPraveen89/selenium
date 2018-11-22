package week2homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected 
{

	public static void main(String[] args) 
	{
				//Set Property of Browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				//Launch Chrome Driver
				ChromeDriver driver=new ChromeDriver();
				
				//Load URL
				driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
				
				//Wait 30 seconds
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
				//Maximize window
				driver.manage().window().maximize();
				
				//IsSelected
				System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/input[1]").isSelected());
				
				
				//Close the browser
				driver.close();


	}

}
