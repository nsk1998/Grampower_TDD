package extentlisteners;

import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportGen {
	
	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator() {
	
	String file = System.getProperty("user.dir")+"//reports//Grampower.html";
	
	// In this method we will just define the look and feel of the report
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter(file);
	
	reporter.config().setTheme(Theme.STANDARD);

	reporter.config().setReportName("Automation Report");
	
	extent = new ExtentReports();
	
	extent.attachReporter(reporter);
	
	extent.setSystemInfo("Browser Used", "Chrome");
	
	extent.setSystemInfo("Executed by", "Automation User");
	
	extent.setSystemInfo("env", "SIT");
	
	return extent;
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
