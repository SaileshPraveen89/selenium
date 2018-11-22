package testngTestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testCases.ProjectManager;
import wdMethods.SeMethods;

public class DuplicateLeadTestng 
{


	public class DuplicateLeadWd extends ProjectManager
	{		
		private static final String userEmail = "sailesh.singamchetty@gmail.com";

		@Test
		public void DuplicateLead() 
		{
			//1-5. Login and take to 'My Home | opentaps CRM' page
			//will be taken care of by Project Methods
			

			//Click crm/sfa link
			click(locateElement("linkText", "CRM/SFA"));

			// Click on Leads in next page
			click(locateElement("linkText", "Leads"));
			//Click on Find Leads
			click(locateElement("linkText", "Find Leads"));

			//If find leads is the header, continue the flow.
			if(getText(locateElement("id", "sectionHeaderTitle_leads")).equals("Find Leads")){
				//Click on Email tab
				click(locateElement("xpath", "//span[text()='Email']"));

				//Enter Email
				type(locateElement("name", "emailAddress"), userEmail);
				//Click find leads button
				click(locateElement("xpath", "//button[text()='Find Leads']"));

				//closeAllBrowsers();

				//Capture name of First Resulting lead
				String firstResultingName = getText(locateElement("xpath", "(//table/tbody/tr/td[3]/div/a)[1]"));
				//Click First Resulting lead
				click(locateElement("xpath", "(//table/tbody/tr/td[3]/div/a)[1]"));
				//Click Duplicate Lead
				click(locateElement("linkText", "Duplicate Lead"));

				//Verify the title as 'Duplicate Lead'
				if(getText(locateElement("id", "sectionHeaderTitle_leads")).equals("Duplicate Lead")){
					//Click Create Lead
					click(locateElement("name", "submitButton"));
					//Confirm the duplicated lead name is same as captured name
					String viewLead_FirstName=getText(locateElement("id", "viewLead_firstName_sp"));
					if(viewLead_FirstName.equals(firstResultingName)){
						System.out.println("****************************************************************************************************************************");
						System.out.println("PASS.. The element "+firstResultingName+ " is duplicated successfully ");
						System.out.println("****************************************************************************************************************************");
					}else{
						System.out.println("****************************************************************************************************************************");
						System.out.println("FAIL.. The element "+firstResultingName+ " is not duplicated..");
						System.out.println("****************************************************************************************************************************");
					}
				}else{
					System.out.println("Application loads too slow...Rerun test with good internet connection");
				}
				//Close Browser
				//Closing browser shall be taken care of by Project Methods

			}else{
				System.out.println("Application loads too slow...Rerun test with good internet connection");
			}

			closeAllBrowsers();
		}



	}


}
