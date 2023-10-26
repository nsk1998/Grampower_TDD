package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;


public class DashBoardPage {
	
	//1. local driver initialization : 
	WebDriver ldriver;
	
	
	//2. Construction Initialization with remote driver and PageFactory
	public DashBoardPage(WebDriver rdriver) {
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	//3. WebElements Initializations : 
	
	

	//Identifying Elements
	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//*[@value='LOG IN']")
	private WebElement login;
	
	@FindBy(xpath = "//*[text()='Later']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//*[@id=\"retail_dashboard\"]/iframe")
	private WebElement retailDashBoard;
	
	@FindBy(xpath = "//h4[@id='div_live_site_count']")
	private WebElement live_site_count;
	
	@FindBy(xpath = "//*[text()='Recently Assigned']")
	private WebElement assignedCount;
	
	@FindBy(xpath = "//*[@id='ul_assigned_list']")
	private WebElement allAssignedCount;
	
	//*[text()="Recently Assigned"]
	
	
	//4. Method Creation According to relative action of webElements
	
	//Actions to Methods =>
	public void Sendusername() {
		username.click();
		
		username.sendKeys("automationuser");
		
		password.click();

	}
	
	public void Sendpassword() {
		
		password.click();
		
		password.sendKeys("grampower");
		
		password.click();
		
	}
	
	public void ClickOnLogin(){
		
		login.click();
	
	}

	public String getTitleOfPage()
	{
		String titleofpage = ldriver.getTitle();
		
		return titleofpage;
	}

	
	public void handlePopup() throws InterruptedException {
		
		//ldriver.manage().deleteAllCookies();
		
		//alert_popup.click();
		
		cancelButton.click();
		
		Thread.sleep(5000);
		
		ldriver.switchTo().frame(retailDashBoard);
		
		live_site_count.click();
		
		Thread.sleep(3000);
		
     	ldriver.switchTo().parentFrame();
	

	}

	public void recentlyAssignedUsers() throws InterruptedException {
		
		Thread.sleep(1000);
		    
		WebElement ulElement1 = assignedCount; // This should be the ul element

		// Assuming allAssignedCount contains the list of li elements
		List<WebElement> listElements1 = ldriver.findElements(By.xpath("//*[@id='ul_assigned_list']"));
 
		// Loop through the list elements and get their text
		for (WebElement listElement : listElements1) {
		    String text = listElement.getText();
		    System.out.println(text);
		}
		
	
	}
}
		
		







