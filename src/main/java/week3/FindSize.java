package week3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.list.LazyList;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindSize 
{

	public static void main(String[] args) 
	{

		
		//Load the driver
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Google
				
		String url = "http://www.google.com/";
		
		driver.get(url);
		
		//Maximize the Window
		driver.manage().window().maximize();
				
		//Time Out
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		
		
		//UserInput
		String userInput="Praveen";
		driver.findElementById("lst-ib").sendKeys(userInput,Keys.ENTER);
		
		List <WebElement> queueList=driver.findElementsByPartialLinkText(userInput);
		System.out.println(queueList.size());
		int counter=0;
		List <WebElement> listOfAnchor= driver.findElementsByTagName("a");
		for(WebElement anchor:listOfAnchor){
			String textFromLink=anchor.getText();
			if(textFromLink.toLowerCase().contains(userInput.toLowerCase())){
				counter++;
			}
		}
		
		System.out.println(counter);
		
	}		
}
