package week5;
import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class SampleReports
{
	@Test
	public void sampleReport(){
		ExtentReports report= new ExtentReports("./report/Results.html", false);
		report.loadConfig(new File("./ExtenReport.xml"));
		
		ExtentTest test=report.startTest("CreateLead", "Create new lead");
		test.assignAuthor("Praveen");
		test.assignCategory("Smoke");
		test.log(LogStatus.PASS, "Launch browser", "Chrome browser is launched");
		report.endTest(test);
		report.flush();
		
		
	}

}
