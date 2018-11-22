package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import wdMethods.SeMethods;

public class CreateLeadWD extends SeMethods{

	@Test
	public void createLead() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");		
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		
		/*
		 * driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementByClassName("inputBox").sendKeys("Test Leaf");

		//Find Element
		driver.findElementById("createLeadForm_firstName").sendKeys("Sailesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("Praveen");
		driver.findElementByName("submitButton").click();

		 */
		click(locateElement("linkText", "CRM/SFA"));
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("class", "inputBox"), "Test Leaf");
		type(locateElement("id", "createLeadForm_firstName"), "Sailesh");
		type(locateElement("id", "createLeadForm_lastName"), "Praveen");
		click(locateElement("Name", "submitButton"));
		
		/*
		 * // 2. Market Compaign: Select using Visible Text
		
		WebElement SelectDropItem=driver.findElementById("createLeadForm_marketingCampaignId");
		Select dr=new Select(SelectDropItem);
		dr.selectByVisibleText("Automobile");
		Thread.sleep(300);
		 */
		click(locateElement("name", "submitButton"));
		
		closeAllBrowsers();
	

	}

}
