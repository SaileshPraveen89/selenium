package week1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsCreateLeads 
{

	public static void main(String[] args) 
	{

		//Load the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Maximize the Window
		driver.manage().window().maximize();

		//load the URL
		String url = "http://leaftaps.com/opentaps/control/main";
		driver.get(url);


		//find user name and password value
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");

		//Login Button
		driver.findElementByClassName("decorativeSubmit").click();

		//Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		// Create Lead
		driver.findElementByLinkText("Create Lead").click();

		//companyName
		driver.findElementById("createLeadForm_companyName").sendKeys("Infosys");

		//firstName
		driver.findElementById("createLeadForm_firstName").sendKeys("Sailesh");

		//dataSourceId
		//driver.findElementsByClassName("createLeadForm_dataSourceId").

		//firstNameLocal
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Sailesh");


		//salutation
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Not Applicable");

		//title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Test Leaf Naganallur");

		//Annual Revenue
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("50000000");

		//Industry
		//driver.findElementByXPath(//*[@id=["('createLeadForm_industryEnumId')"]/option[4])
		driver.findElementByXPath("//*[@id='createLeadForm_industryEnumId']/option[5]").click();
		//Ownership

		//Description
		driver.findElementById("createLeadForm_description").sendKeys("Test Leaf is available since 2009");


		//Important Note
		driver.findElementById("createLeadForm_importantNote").sendKeys("Test Leaf only in Chennai. It's slowly constructing in Bangalore");

		//AreaCode
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("600105");

		//Extensions
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("TL");

		//Email Id
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("sailesh.singamchetty@gmail.com");

		//To Name
		driver.findElementById("createLeadForm_generalToName").sendKeys("Praveen");

		//Address
		driver.findElementByName("generalAddress1").sendKeys("Pattabiram");

		//City
		driver.findElementById("createLeadForm_generalCity").sendKeys("Hindu College");

		//Postal Code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600072");

		//Postal Code Extension
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("72");

		//Lastname
		driver.findElementById("createLeadForm_lastName").sendKeys("Praveen");

		//Market Compaign

		//Last Name Local
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Pravin");

		//Department
		driver.findElementById("createLeadForm_departmentName").sendKeys("Information Technology");

		//Prefered Currency

		//Number of Employee
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("5");

		//Ticker symbol
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("$");

		//Phone Number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("984020156489");

		//Person to Ask for
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Nandhini");

		//Web URL
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.testleaf.com");

		//Attention Name
		driver.findElementByName("generalAttnName").sendKeys("Praveen");

		//Address 2
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Gopalapuram Naganallur");

		//State
		driver.findElementById("createLeadForm_generalStateProvinceGeoId").sendKeys("Alabama");
		//Country

		//Submit Button
		driver.findElementByName("submitButton").click();

		//driver.close();
	}

}
