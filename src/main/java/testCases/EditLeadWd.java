package testCases;


import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import wdMethods.SeMethods;

public class EditLeadWd extends ProjectManager
{

	@Test
	public void editLead() throws InterruptedException
	{
		getlogin();
	
	//Click crm/sfa link
	click(locateElement("linkText", "CRM/SFA"));
	
	//Click Leads link
	click(locateElement("linkText", "Leads"));
	
	//Click Find leads
	click(locateElement("linkText", "Find Leads"));
	

	//Enter the first Name
	type(locateElement("xpath", "(//input[@name= 'firstName'])[3]"),"Nandhini");
	
	//Click Find leads button
	click(locateElement("xpath", "//button[text() = 'Find Leads']"));
	Thread.sleep(3000);
	
	//Click on first resulting lead
	click(locateElement("xpath", "(//tbody//a[(@class='linktext')])[1]"));
	
	//Verify title of the page
	verifyTitle("View Lead | opentaps CRM");
	
	//Click Edit
	click(locateElement("link", "Edit"));
	
	//Change the company name
	type(locateElement("id", "updateLeadForm_companyName"), "Infosys");
	
	//Click Update
	click(locateElement("class", "smallSubmit"));	
	
	//	Confirm the changed name appears and	Close the browser (Do not log out)
	verifyPartialText(locateElement("id", "viewLead_companyName_sp"), "Infosys");
	//logout();
	
	closeAllBrowsers();
	}

}
