package extentlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclass.BaseTest;
import utility.Screenshots;

public class TestNGListeners extends BaseTest implements ITestListener{
	
	/* Listeners in TestNG :- These are the on which get execute a
	 * specific method based on the pass/ failed/ skipped of the testcase.
	 * 
	 * If a test case gets pass then automatically a specific method related to pass event gets trigger.
	 * 
	 * To impliment listeners logic we have to use ITestListeners 
	 * interface and inside it we have multiple methods that we have to implement
	 */

	ExtentReports extent = extentReportGen.extentReportGenerator();
	
	public static ExtentTest test; // static we have given because we dont want to destroy our object.
	
	public void onTestStart(ITestResult result) {
		
		System.out.println("Test case started " + result.getName());
		
		 test = extent.createTest(result.getName());
	}

	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test case passed " + result.getName());
		
		test.log(Status.PASS, "Test case passed");
		
		
	}

	
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case failed " + result.getName());
		
		test.fail(result.getThrowable());
	
		Screenshots sc = new Screenshots();
				
		try {
			
			test.addScreenCaptureFromPath(sc.captureScreenshot(driver, result.getName()));
			
			
		} catch (IOException e) {
			System.out.println("Exception arrived while taking screenshot");
		}		
	
	}

	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test case skipped " + result.getName());
		
		test.log(Status.SKIP, "Test case got skipped");
	}


	
	public void onStart(ITestContext context) {
		
		System.out.println("Test tag started " + context.getName());
	}

	
	public void onFinish(ITestContext context) {
		
		System.out.println("Test tag finished " + context.getName());
		
		extent.flush(); // using for generating extent report.
		
	}

}
