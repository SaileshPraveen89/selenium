package week1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcFormSubmission {

	public static void main(String[] args) throws InterruptedException 
	{
		//Load the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Maximize the Window
		driver.manage().window().maximize();

		//load the URL
		String url = "https://www.irctc.co.in/eticketing/loginHome.jsf";
		driver.get(url);


		//find user name and password value
		driver.findElementById("usernameId").sendKeys("db4chat");
		driver.findElementByClassName("loginPassword").sendKeys("04426852178");
		driver.findElementByLinkText("Sign up").click();
		
		//User Id
		driver.findElementById("userRegistrationForm:userName").sendKeys("sp4chat");
		
		//Password
		driver.findElementById("userRegistrationForm:password").sendKeys("04426852178");
		
		//Confirm Password
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("04426852178");
		
		//Security Question
		driver.findElementByXPath("//*[@id='userRegistrationForm:securityQ']/option[6]").click();
		
		//Security Answer
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Sudhakar");
		
		//Personal Details
		
		//First Name
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Sailesh");
		
		//Last Name
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Praveen");
		
		//Gender
		driver.findElementByName("userRegistrationForm:gender").click();
		
		//Martial Status
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		//Date of Birth
		//Day
		WebElement SelectDay=driver.findElementById("userRegistrationForm:dobDay");
		Select dd=new Select(SelectDay);
		dd.selectByIndex(2);
		Thread.sleep(3000);
		
		//Month
		WebElement SelectMonth=driver.findElementById("userRegistrationForm:dobMonth");
		Select mm=new Select(SelectMonth);
		mm.selectByIndex(6);
		Thread.sleep(3000);
		
		//Year
		WebElement SelectYears=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select yy=new Select(SelectYears);
		yy.selectByIndex(10);
		Thread.sleep(3000);
		
		//Occupation
		WebElement SelectOccup=driver.findElementById("userRegistrationForm:occupation");
		Select occ=new Select(SelectOccup);
		occ.selectByIndex(2);
		
		
		//Aadhaar Number
		driver.findElementById("userRegistrationForm:uidno").sendKeys("123456789");
		
		//PAN
		driver.findElementById("userRegistrationForm:idno").sendKeys("EGDFSDFSF");
		
		//country
		WebElement SelectCtry=driver.findElementById("userRegistrationForm:countries");
		Select cty=new Select(SelectCtry);
		cty.selectByIndex(1);
		
		
		//Email
		driver.findElementById("userRegistrationForm:email").sendKeys("sailesh.singamchetty@gmail.com");
		
		//ISD-Mobile
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9962301806");
		
		//Nationality
		WebElement SelectNationality=driver.findElementById("userRegistrationForm:nationalityId");
		Select nat=new Select(SelectNationality);
		nat.selectByValue("5");
		
		//Door Number
		driver.findElementById("userRegistrationForm:address").sendKeys("New NO 85");
		
		//Street Number
		driver.findElementById("userRegistrationForm:street").sendKeys("Gopalapuram");
		
		//Locality
		driver.findElementById("userRegistrationForm:area").sendKeys("Chennai");
		
		//Pin Code
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600001",Keys.TAB);
		
		
		//City
		WebElement SelectCity=driver.findElementById("userRegistrationForm:cityName");
		Select City=new Select(SelectCity);
		City.selectByIndex(1);
		Thread.sleep(300);
		
		//PostOffice
		WebElement SelectPoffice=driver.findElementById("userRegistrationForm:postofficeName");
		Select po=new Select(SelectPoffice);
		po.selectByIndex(2);
		Thread.sleep(300);
		
		//Phone
		driver.findElementById("userRegistrationForm:landline").sendKeys("8546123");
		
		driver.close();
		
		
		
	}

}
