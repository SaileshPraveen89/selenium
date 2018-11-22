package week2;

import org.openqa.selenium.chrome.ChromeDriver;

public class getBrowserTitle 
{

	public static void main(String[] args) 
	{
		//Set Property of Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//Launch the Chrome Browser
		ChromeDriver driver=new ChromeDriver();

	}

}
