package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods {
	// Webdriver and WebElement declarations
	RemoteWebDriver driver = null;
	WebElement ele = null;
	// FileNumber variable for adding numbers to snapshots
	int fileNumber = 0;

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Browser " + browser + " Launched successfully");
		} catch (WebDriverException e) {
			System.err.println("Browser cannot be reached...Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
	}

	public void startApp(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
			System.out.println(driver + " browser is instantiated/opened successfully");
		} catch (WebDriverException e) {
			System.err.println("Browser cannot be reached...Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "name":
				ele = driver.findElementByName(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "linkText":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "partialLinkText":
				ele = driver.findElementByPartialLinkText(locValue);
				break;
			case "tagName":
				ele = driver.findElementByTagName(locValue);
				break;
			case "xpath":
				ele = driver.findElementByXPath(locValue);
				break;
			case "cssSelector":
				ele = driver.findElementByCssSelector(locValue);
				break;
			}
			System.out.println(locator + " -> with " + locValue
					+ "- operations are performed and returned as WebElement successfully");
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
		return ele;
	}

	public WebElement locateElement(String locValue) {
		try {
			ele = driver.findElementById(locValue);
			System.out.println("FindElementById is processed and returned as WebElement successfully");
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
		return ele;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("Given Value :" + data + " is entered successfully");
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("Element is Clicked Successfully");
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
	}

	public String getText(String string) {
		String text = "";
		try {
			text = string;
			System.out.println("Text -" + text + " is extracted from webelement successfully");
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
		return text;
	}

	/**
	 * This method will get the number of options in DropDown and helps to
	 * prevent an exception when sending values to dropdown
	 * 
	 * @author Muthu Kumar
	 * @param ele
	 *            - WebElement
	 */
	public int getSelectOptions(WebElement ele) {
		Select selDrp = null;
		List<WebElement> selDrpContainer = null;
		try {
			selDrp = new Select(ele);
			selDrpContainer = selDrp.getOptions();
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
		return selDrpContainer.size();
	}

	public void selectDropDownUsingText(WebElement ele, String value) {

		Select selDrp = null;
		try {
			selDrp = new Select(ele);
			selDrp.selectByVisibleText(value);
			System.out.println("DropDown with visible text " + value + " is selected successfully");
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select selDrp = null;
		try {
			selDrp = new Select(ele);
			selDrp.selectByIndex(index);
			System.out.println("DropDown with index - " + index + " is selected successfully");
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
	}

	public boolean verifyTitle(String expectedTitle) {
		String currentTitle = "";
		boolean result = false;
		try {
			currentTitle = driver.getTitle();
			if (currentTitle.equals(expectedTitle)) {
				System.out.println(currentTitle + " does not match with " + expectedTitle);
				result = true;
			} else {
				System.out.println(currentTitle + " does not match with " + expectedTitle);
				result = false;
			}
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
		if (result)
			return true;
		else
			return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String currentText = "";
		try {
			currentText = ele.getText();
			if (currentText.equalsIgnoreCase(expectedText)) {
				System.out.println(currentText + " matches " + expectedText);
			} else {
				System.out.println(currentText + " does NOT matches " + expectedText);
			}
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		String currentText = "";
		try {
			currentText = ele.getText();
			if (currentText.contains(expectedText)) {
				System.out.println(expectedText + " contains current returned text-> " + currentText);
			} else {
				System.out.println(expectedText + " does NOT contains current text-> " + currentText);
			}
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		String actualValue = "";
		try {
			actualValue = ele.getAttribute(attribute);
			if (actualValue.equals(value)) {
				System.out.println("Attribute value matches successfully");
			} else {
				System.out.println("Attribute does NOT match expected value-" + value);
			}
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String actualValue = "";
		try {
			actualValue = ele.getAttribute(attribute);
			if (actualValue.contains(value)) {
				System.out.println("Attribute contains value successfully");
			} else {
				System.out.println("Attribute does NOT contain expected value-" + value);
			}
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	public void verifySelected(WebElement ele) {
		try {
			if (ele.isSelected()) {
				System.out.println("Dropdown is selected successfully");
			} else {
				System.out.println("Dropdown is NOT selected");
			}
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	public void verifyDisplayed(WebElement ele) {
		try {
			if (ele.isDisplayed()) {
				System.out.println("Element is displayed successfully");
			} else {
				System.out.println("Element is NOT displayed");
			}
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException " + e.getMessage());
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	public void switchToWindow(int index) {
		Set<String> allWindowHandles = null;
		List<String> allHandles = null;
		try {
			allWindowHandles = driver.getWindowHandles();
			allHandles = new ArrayList<>();
			allHandles.addAll(allWindowHandles);
			driver.switchTo().window(allHandles.get(index));
			System.out.println("Window is switched to " + index + " successfully");
		} catch (NoSuchWindowException e) {
			System.err.println("NoSuchWindowException.. " + e.getMessage());
			throw new RuntimeException();
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException..  " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			System.out.println("Switched to frame successfully");
		} catch (NoSuchFrameException e) {
			System.err.println("NoSuchWindowException.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (StaleElementReferenceException e) {
			System.err.println("StaleElementReferenceException.. " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			System.err.println("NoSuchWindowException.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (UnhandledAlertException e) {
			System.err.println("UnhandledAlertException.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			System.err.println("NoSuchWindowException.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (UnhandledAlertException e) {
			System.err.println("UnhandledAlertException.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (WebDriverException e) {
			System.err.println("WebDriverException... Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	public String getAlertText() {
		String alertText = "";
		try {
			alertText = driver.switchTo().alert().getText();
			System.out.println("Alert text -> " + alertText + " is obtained successfully");
		} catch (NoAlertPresentException e) {
			System.err.println("NoAlertPresentException... Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (UnhandledAlertException e) {
			System.err.println("UnhandledAlertException... Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (WebDriverException e) {
			System.err.println("WebDriverException... Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception... Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
		return alertText;
	}

	public long takeSnap() {
		try {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./snaps/image" + fileNumber + ".jpg");
			FileUtils.copyFile(src, dest);
			fileNumber++;
		} catch (IOException e) {
			System.err.println("IO Exception.. Unable to take Snapshot.. Exiting the program " + e.getMessage());
		} catch (WebDriverException e) {
			System.err.println("WebDriver Exception.. Exiting the program " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception... Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
		return fileNumber;
	}

	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("Browser window closed successfully");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception... Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}

	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("All selenium browser windows closed successfully");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException.. Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("Exception... Exiting the program  " + e.getMessage());
			throw new RuntimeException();
		}
	}

	@Override
	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void  getlogin()
	
	{
		startApp("chrome","http://leaftaps.com/opentaps");
		type(locateElement("id", "username"), "DemoSalesManager");
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
	}
	
	}
