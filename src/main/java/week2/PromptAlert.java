

package week2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert 
{

	public static void main(String[] args) 
	{

		//Load the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Maximize the Window
		driver.manage().window().maximize();

		//load the URL
		String url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		driver.get(url);
		String input="W3Schools Prompt Alert";
		
		driver.switchTo().frame(driver.findElementById("iframeResult"));
		driver.findElementByXPath("//button[@onclick='myFunction()']").click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(input);
		alert.accept();
		String output=driver.findElementById("demo").getText();
		if(output.contains(input))
		{
			System.out.println("eExcat match");
		}
		else{
			System.out.println("false");
		}
	
		
		
		
		
		
	}	
}