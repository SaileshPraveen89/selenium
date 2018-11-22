package testngTestCases;

import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class DeleteLeadTestng extends SeMethods 

{
	
	//@Test(dependsOnMethods="testCases.CreateLeadWdHomeWork.createLead")
	@Test(groups="sanity")
	public void DeleteLead() throws Exception 
	
	{	
		//Launch the browser
		startApp("chrome", "http://leaftaps.com/opentaps");

		//Enter the username
		type(locateElement("id", "username"), "DemoSalesManager");
		
		//Enter the password
		type(locateElement("id", "password"), "crmsfa");
		
		//Click Login
		click(locateElement("class", "decorativeSubmit"));
		
		Thread.sleep(3000);
		
		//Click crm/sfa link
		click(locateElement("linkText", "CRM/SFA"));
		
		//Click Leads link
		click(locateElement("linkText", "Leads"));
		
		//Click Find leads
		click(locateElement("linkText", "Find Leads"));
		
		//Click on Phone
		click(locateElement("xpath","//span[text()='Phone']"));
		
		//Enter phone number
		type(locateElement("xpath","(//input[@name='phoneNumber'])"),"1");
		
		//Click find leads button
		click(locateElement("xpath,","//button[text(),'Find Leads']"));
		
		
		//Capture lead ID of First Resulting lead
		String WebElementText=getText(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		System.out.println(WebElementText);
		
		//Click First Resulting lead
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		
		//Click Delete
		click(locateElement("xpath","//a[contains(text(),'Delete')]"));
		
		closeAllBrowsers();
		
		}
		
		//Close the browser (Do not log out)


	}
