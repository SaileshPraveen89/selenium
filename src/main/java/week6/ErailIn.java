package week6;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailIn 
{
	public static void main(String args[])
	{
	
	//Load the driver
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();

	//Maximize the Window
	driver.manage().window().maximize();

	//load the URL
	String url = "https://erail.in/";
	driver.get(url);
	
	driver.findElementById("txtStationFrom").clear();
	driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
	driver.findElementById("txtStationTo").sendKeys("SBC",Keys.TAB);
	WebElement table=driver.findElementByXPath("//table[@class='DataTable TrainList']");
	
	List <WebElement> row=(List<WebElement>) table.findElement(By.tagName("tr"));
	System.out.println(row.size());
	System.out.println(row.get(0).findElements(By.tagName("td")).get(1).getText());
	
	
	List <String> item=new ArrayList<String>();
	item.add(row.get(0).findElements(By.tagName("td")).get(1).getText());
	item.add(row.get(1).findElements(By.tagName("td")).get(1).getText());
	item.add(row.get(2).findElements(By.tagName("td")).get(1).getText());
	item.add(row.get(3).findElements(By.tagName("td")).get(1).getText());
	
	
	}
}
