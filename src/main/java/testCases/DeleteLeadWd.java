package testCases;

import org.junit.Test;
import org.openqa.selenium.WebElement;


import wdMethods.SeMethods;


public class DeleteLeadWd extends SeMethods 

{
	@Test
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
		
		/**
		//Click Find leads
		click(locateElement("xpath","//a[contains(text(),'Find Leads')]"));
		
		//Enter captured lead ID
		type(locateElement("xpath","//input[@name='id']"),WebElementText);
		
		
		//Click find leads button
		click(locateElement("xpath","//button[contains(text(),'Find Leads')]"));
		
		///Verify error 
		String WebElementTx=getText(locateElement("xpath","//div[contains(text(),'No records to display')]"));
		if(WebElementTx.contains("No records to display"))
		{
		System.out.println(WebElementTx);
		}
		**/
		
		closeAllBrowsers();
		
		}
		
		//Close the browser (Do not log out)
	

	}


