package testngTestCases;


import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testCases.ProjectManager;
import wdMethods.SeMethods;


public class MergeLeadTestng extends ProjectManager
{

	// Credentials
	public String userName = "DemoSalesManager";
	public String password = "crmsfa";

	public static String str_From_LeadID_FormFirstLead = "";
	public static String str_To_LeadID_FormFirstLead = "";

	public static String str_From_LeadID_UserInput = "11";
	public static String str_To_LeadID_UserInput = "12";

	// Error Text
	public static String str_Expected_ErrorText = 
			"No records to display";

	@Test
	public void mergeLead()  throws InterruptedException
	{
		//Authentication and clicking on CRM/SFA 
		//will be taken care of by Project methods


		//Click crm/sfa link
		click(locateElement("linkText", "CRM/SFA"));
		// Click on Leads in next page
		click(locateElement("linkText", "Leads"));
		//Click on Find Leads
		click(locateElement("linkText", "Find Leads"));


		closeAllBrowsers();

	}



}
