package testCases;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;

import wdMethods.SeMethods;


public class CreateLeadWdHomeWork extends SeMethods

{

	@Test
	public void createLead() throws Exception 
	{

	//Login http://leaftaps.com/opentaps using username & Password
		getlogin();
		
		click(locateElement("linkText", "CRM/SFA"));
		click(locateElement("linkText", "Create Lead"));
		
		type(locateElement("id", "createLeadForm_companyName"), "TestLeaf");
		type(locateElement("id", "createLeadForm_firstName"), "Sailesh");
		type(locateElement("id", "createLeadForm_lastName"), "Praveen");

		selectDropDownUsingText(locateElement("id", "createLeadForm_dataSourceId"), "Cold Call");
		
		//SelectDropDownUsingIndex(locateElement("id","createLeadForm_dataSourceId"),3);
		selectDropDownUsingText(locateElement("id", "createLeadForm_marketingCampaignId"), "Automobile");

		type(locateElement("id", "createLeadForm_firstNameLocal"), "Sailesh");
		type(locateElement("id", "createLeadForm_lastNameLocal"), "Praveen");
		type(locateElement("id", "createLeadForm_personalTitle"), "Mr");
		type(locateElement("id", "createLeadForm_departmentName"), "IT");
		type(locateElement("id", "createLeadForm_annualRevenue"), "500000");

		selectDropDownUsingText(locateElement("id", "createLeadForm_industryEnumId"), "Computer Hardware");
		selectDropDownUsingText(locateElement("id", "createLeadForm_ownershipEnumId"), "Sole Proprietorship");

		type(locateElement("id", "createLeadForm_numberEmployees"), "50");
		type(locateElement("id", "createLeadForm_sicCode"), "5123");
		type(locateElement("id", "createLeadForm_tickerSymbol"), "Symbol");
		type(locateElement("id", "createLeadForm_description"), "Automation Test");
		type(locateElement("id", "createLeadForm_importantNote"), "Class Notes");
		type(locateElement("id", "createLeadForm_primaryPhoneCountryCode"), "91");
		type(locateElement("id", "createLeadForm_primaryPhoneAreaCode"), "044");
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), "9962677796");
		type(locateElement("id", "createLeadForm_primaryPhoneExtension"), "12");
		type(locateElement("id", "createLeadForm_primaryPhoneAskForName"), "Praveen");
		type(locateElement("id", "createLeadForm_primaryEmail"), "vijayachithraa@gmail.com");
		type(locateElement("id", "createLeadForm_primaryWebUrl"), "www.gmail.com");
		type(locateElement("id", "createLeadForm_generalToName"), "Chithra");
		type(locateElement("id", "createLeadForm_generalAttnName"), "VijayaChithra");
		type(locateElement("id", "createLeadForm_generalAddress1"), "Thiruvanmiyur");
		type(locateElement("id", "createLeadForm_generalAddress2"), "RTO");
		type(locateElement("id", "createLeadForm_generalCity"), "CHENNAI");

		selectDropDownUsingText(locateElement("id", "createLeadForm_generalCountryGeoId"), "India");

		Thread.sleep(5000);

		selectDropDownUsingText(locateElement("id", "createLeadForm_generalStateProvinceGeoId"), "TAMILNADU");
		type(locateElement("id", "createLeadForm_generalPostalCode"), "600041");
		type(locateElement("id", "createLeadForm_generalPostalCodeExt"), "600041");

		click(locateElement("name", "submitButton"));
		closeAllBrowsers();

}
}
