package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import wdMethods.SeMethods;

public class ProjectManager extends SeMethods
{
	@BeforeMethod
	@Parameters({"URL","uName","uPassword"})
	public void login(String URL,String uName,String uPassword)
	{
		startApp("chrome", URL);
		type(locateElement("id", "username"), uName);
		type(locateElement("id", "password"), uPassword);
		click(locateElement("class", "decorativeSubmit"));
	}
	
	public void logout()
	{
		closeAllBrowsers();
	}


	
}
