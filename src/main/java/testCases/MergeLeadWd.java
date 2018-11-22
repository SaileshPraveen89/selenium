package testCases;


import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class MergeLeadWd extends ProjectManager 
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

		// Click on Leads in next page
		click(locateElement("linkText", "Leads"));
		// Click on Merge Leads in next page
		click(locateElement("linkText", "Merge Leads"));

		// Click on From Leads icon in next page
		click(locateElement("xpath", "//table[@class='twoColumnForm']/tbody/tr[1]/td[2]/a"));
		switchToWindow(1);
		type(locateElement("name", "id"), str_From_LeadID_UserInput);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		
		str_From_LeadID_FormFirstLead = getText(
				locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		switchToWindow(0);

		// Click on To Leads icon in next page
		click(locateElement("xpath", "//table[@class='twoColumnForm']/tbody/tr[2]/td[2]/a"));
		switchToWindow(1);
		type(locateElement("name", "id"), str_To_LeadID_UserInput);
		click(locateElement("xpath", "//button[text()='Find Leads']"));
		str_To_LeadID_FormFirstLead = getText(
				locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		click(locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
		switchToWindow(0);

		System.out.println(str_From_LeadID_FormFirstLead + " - " + str_To_LeadID_FormFirstLead);
		// Click on Merge button
		click(locateElement("class", "buttonDangerous"));

		// Accept Alert
		acceptAlert();

		// Click Find Leads
		click(locateElement("linkText", "Find Leads"));
		type(locateElement("name", "id"), str_From_LeadID_FormFirstLead);
		click(locateElement("xpath", "//button[text()='Find Leads']"));

		String str_Current_ErrorText=getText(locateElement("class", "x-paging-info"));

		if(str_Current_ErrorText.equals(str_Expected_ErrorText)){
			System.out.println("****************************************************************************************************************************");
			System.out.println("PASS.. The element "+str_From_LeadID_FormFirstLead+ " is merged with "+str_To_LeadID_FormFirstLead);
			System.out.println("The error message from webpage is "+str_Current_ErrorText);
			System.out.println("****************************************************************************************************************************");
		}else{
			System.out.println("****************************************************************************************************************************");
			System.out.println("FAIL.. The element "+str_From_LeadID_FormFirstLead+ " is not yet merged..");
			System.out.println("****************************************************************************************************************************");
		}

		//Closing browser shall be taken care of by Project Methods 
		closeAllBrowsers();
	}
}
