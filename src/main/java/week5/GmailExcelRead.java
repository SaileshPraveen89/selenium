package week5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testCases.ProjectManager;
import wdMethods.SeMethods;

//@Test(groups="smoke")
	//@Test (dataProvider="fetchdata")
public class GmailExcelRead extends ProjectManager
{
	
		public void createLead(String cname,String cfname,String clname) throws Exception 
		{

			//Login http://leaftaps.com/opentaps using username & Password

			click(locateElement("linkText", "CRM/SFA"));
			click(locateElement("linkText", "Create Lead"));

			type(locateElement("id", "createLeadForm_companyName"), cname);
			type(locateElement("id", "createLeadForm_firstName"), cfname);
			type(locateElement("id", "createLeadForm_lastName"), clname);

			
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
			type(locateElement("id", "createLeadForm_primaryEmail"), "abcedfghij@gmail.com");
			type(locateElement("id", "createLeadForm_primaryWebUrl"), "www.gmail.com");
			type(locateElement("id", "createLeadForm_generalToName"), "Tikshan");
			type(locateElement("id", "createLeadForm_generalAttnName"), "Tikshan");
			type(locateElement("id", "createLeadForm_generalAddress1"), "Pattabiram Hero");
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

		/**
		@DataProvider(name="fetchdata")
		public Object[][] getData()
		{
			Object[][] data=new Object[2][3];
			data[0][0]="test leaf";
			data[0][1]="Tikshan";
			data[0][2]="Sai";
			
			data[1][0]="test leaf";
			data[1][1]="Tikshan";
			data[1][2]="Praveen";
			return data;
		}
		**/
	}






