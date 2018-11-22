package week2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow 
{

	public static void main(String[] args) 
	{
		
		//Load the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//IRCTC
		
		String url = "https://www.irctc.co.in/eticketing/pageUnderConstruction.jsf";
		driver.get(url);
		
		//Time Out
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Contact Us").click();
		Set <String> allWindows=driver.getWindowHandles();
		allWindows.size();
		System.out.println(allWindows.size());
		for(String eachWindow:allWindows)
		{
			System.out.println(eachWindow);
			driver.switchTo().window(eachWindow);
		}
		
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		

	
		

	}

}
