package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.validateMeterCount;

public class TC_MetercountTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void verifyLogin() throws InterruptedException {
		
		ValidateMeterCount.Sendusername();
	//	logger.info("Entered Username");
		
		ValidateMeterCount.Sendpassword();
	//	logger.info("Entered password");
		
		ValidateMeterCount.ClickOnLogin();
	//	logger.info("Click on Sign In button");
		
	}
	
	@Test(priority = 1)
	public void validateTitle()
	{
		
		String title = ValidateMeterCount.getTitleOfPage();
		
	//	logger.info("Fetched the title of page");
		
		String expected = "Gram Power";
		
		boolean ispresent = title.contains(expected);
		
		Assert.assertEquals(ispresent, true);
		
	//	logger.info("Title of page has been validated");
		
	}
	
	@Test(priority = 2)
	public void HandlePopup() throws InterruptedException {
		
//	driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
//	    
//	dashBoardPage.
//	
//	Thread.sleep(5000);
//	     
//	WebElement frame=driver.findElement(By.xpath("//*[@id=\"retail_dashboard\"]/iframe"));
//	     
//	driver.switchTo().frame(frame);
//	     
//	driver.findElement(By.xpath("//h4[@id='div_live_site_count']")).click();
//	Thread.sleep(3000);
//	driver.switchTo().parentFrame();
		
		dashBoardPage.handlePopup();
		
	}
	
	
	@Test(priority = 3)
	public void verifyMeterCount(){
		
		ValidateMeterCount.compare_meter_count();
	//	logger.info("Meter count should be more than assigned count");
	
		
	}
	
	

}
