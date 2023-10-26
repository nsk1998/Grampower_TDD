package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.LoginGramPower;
import extentlisteners.TestNGListeners;

public class TC_GrampowerLoginPageTest extends TestNGListeners{
	

	
	@Test(priority = 1)
	public void verifyLogin() throws InterruptedException {
		
		loginGramPower.Sendusername();
		//test.info("Entered Username");
		
		loginGramPower.Sendpassword();
		//test.info("Entered password");
		
		loginGramPower.ClickOnLogin();
		//test.info("Click on Sign In button");
		
	}
	
	@Test(priority = 1)
	public void validateTitle()
	{
		
		String title = loginGramPower.getTitleOfPage();
		
		//test.info("Fetched the title of page");
		
		String expected = "Gram Power";
		
		boolean ispresent = title.contains(expected);
		
		Assert.assertEquals(ispresent, true);
		
		//test.info("Title of page has been validated");
		
	}
	
}
