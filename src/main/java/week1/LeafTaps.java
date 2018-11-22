package week1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps 
{

	public static void main(String[] args) 
	{

		//Load the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Maximize the Window
		driver.manage().window().maximize();

		//load the URL
		String url = "http://leaftaps.com/opentaps/control/main";
		driver.get(url);

		//find user name and password value
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");

		//Find Element
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByClassName("inputBox").sendKeys("Test Leaf");

		//Find Element
		driver.findElementById("createLeadForm_firstName").sendKeys("Sailesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("Praveen");
		driver.findElementByName("submitButton").click();



	}

}
