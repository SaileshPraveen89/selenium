package week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class KeurigDotCom 
{

	public static void main(String[] args) 
	{
	
		//Load the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//KEURIG
				
		String url = "http://www.keurig.com/";
		driver.get(url);
				
		//Time Out
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		//Maximize the Window
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//span[@class='ch-close']").click();
		
		
		driver.findElementByLinkText("Sign In").click();
		
		driver.findElementById("register.firstName").sendKeys("Sai");
		
		driver.findElementById("register.lastName").sendKeys("Praveen");
		
		driver.findElementById("register.email").sendKeys("sailesh.singamchetty@gmail.com");
		
		driver.findElementById("password").sendKeys("default@123");
		
		driver.findElementByXPath("//button[contains(text(),'Create an Account')]").click();
		

	}

}
