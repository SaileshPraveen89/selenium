package testCases;

import org.junit.Test;

public class DuplicateLeadFromRan extends ProjectManager
{		
	private static final String userEmail = "sailesh.singamchetty@gmail.com";

	@Test
	public void DuplicateLead() 
	{
		//1-5. Login and take to 'My Home | opentaps CRM' page
		//will be taken care of by Project Methods
		getlogin();

		//Click crm/sfa link
		click(locateElement("linkText", "CRM/SFA"));

		// Click on Leads in next page
		click(locateElement("linkText", "Leads"));
		//Click on Find Leads
		click(locateElement("linkText", "Find Leads"));

		closeAllBrowsers();

		/**
		//If find leads is the header, continue the flow.
		if(getText(locateElement("id", "sectionHeaderTitle_leads")).equals("Find Leads")){
			//Click on Email tab
			click(locateElement("xpath", "//span[text()='Email']"));

			//Enter Email
			type(locateElement("name", "emailAddress"), userEmail);
			//Click find leads button
			click(locateElement("xpath", "//button[text()='Find Leads']"));

	**/

		

	}
}
