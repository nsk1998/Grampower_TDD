package testclass;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginGramPower;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.grampower.utilities.ReadExcelFile;

public class TC_DashboardPageTest extends BaseTest{
	

	@Test(priority = 1)
	public void dashLogin() throws InterruptedException
	{
		dashBoardPage.Sendusername();
		
		//logger.info("Entered Username");
		
		dashBoardPage.Sendpassword();
		
		//logger.info("Entered password");
		
		dashBoardPage.ClickOnLogin();
		
		//logger.info("Click on Sign In button");
		
	}
	
//	@Test(priority = 2)
//	public void HandlePopup() throws InterruptedException {

		//	    // Create a WebDriverWait instance with a specific timeout
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	    // Locate the popup element using its locator
//	    By popupLocator = By.xpath("//*[text()='Later']"); // Replace with the actual locator of the popup element
//
//	    // Wait for the popup to become clickable (you can use other conditions as needed)
//	    WebElement popupElement = wait.until(ExpectedConditions.elementToBeClickable(popupLocator));
//	    
//		WebElement hoverelement = driver.findElement(By.xpath("//*[text()='Later']"));
//		
//		
//		WebElement hoverelement = driver.findElement(By.xpath("//*[text()='Later']"));
//		
//		act.click(hoverelement).build().perform();
//		
//		WebElement element = driver.findElement(By.id("onesignal-slidedown-cancel-button"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		element.click();
//		
//	    driver.findElement(By.xpath("//*[text()='Later']")).click();
//	    
//	     Thread.sleep(5000);
//	     
//	     WebElement frame=driver.findElement(By.xpath("//*[@id=\"retail_dashboard\"]/iframe"));
//	     
//	     driver.switchTo().frame(frame);
//	     
//	      driver.findElement(By.xpath("//h4[@id='div_live_site_count']")).click();
//	      Thread.sleep(3000);
//	      driver.switchTo().parentFrame();
//		
//	      // Now you can interact with the popup or perform actions that depend on it
//	      dashBoardPage.handlePopup();
		
	   // logger.info("Popup window handled properly.");
		
		
//		WebElement element = driver.findElement(By.id("onesignal-slidedown-cancel-button"));

//		WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		element.click();
//	}
	
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
	public void recentlyAssigned() throws InterruptedException
	{
		
		dashBoardPage.recentlyAssignedUsers();
		
		//logger.info("Total recently assigned user count");
		
	}
}

	
	
	
