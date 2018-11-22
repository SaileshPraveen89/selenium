package week1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectValue 
{

	public static void main(String[] args) throws InterruptedException 
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
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");

		//Login Button
		driver.findElementByClassName("decorativeSubmit").click();

		//Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		// Create Lead
		driver.findElementByLinkText("Create Lead").click();

		//Select Options from the drop down
		
		// 1. Source: Select Last Value using Index
		
		WebElement SelectElement=driver.findElementById("createLeadForm_dataSourceId");
		Select dd=new Select(SelectElement);
		dd.selectByIndex(10);
		Thread.sleep(3000);
		
		// 2. Market Compaign: Select using Visible Text
		
		WebElement SelectDropItem=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dr=new Select(SelectDropItem);
		dr.selectByVisibleText("Automobile");
		Thread.sleep(300);
		
		// Country: Select Any Country using Value		
		WebElement SelectDrop=driver.findElementById("createLeadForm_generalCountryGeoId");
		Select ds=new Select(SelectDrop);
		ds.selectByValue("DZA");
		
		//Submit Button
		driver.findElementByName("submitButton").click();

	}

}
