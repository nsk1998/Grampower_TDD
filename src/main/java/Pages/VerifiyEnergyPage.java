package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifiyEnergyPage {

	//1. local driver initialization : 
	WebDriver ldriver;
	 Actions actions;
	
	
	//2. Construction Initialization with remote driver and PageFactory
	public VerifiyEnergyPage(WebDriver rdriver) {
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
	
	@FindBy (xpath="//*[@class='arrow-next']")
	private WebElement site_arrow_icon;
	
	@FindBy (xpath="//*[@style='text-align:right;margin-right:10px;margin-left:70px; padding-top:10px;z-index:10; height:100px; background-image:url(/hes/static/img/search.png); background-repeat:no-repeat;']")
	private WebElement arrow_button;
	
	@FindBy (xpath="//*[@style='width: 32px; height: 32px; user-select: none; border: 0px; padding: 0px; margin: 0px; max-width: none;']")
	private WebElement transformer_button;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//===============================================================================================================
			
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
	
	public void clickOnArrow1(){
		
		site_arrow_icon.click();
	
	}
	
	public void clickOnArrow2(){
		
		arrow_button.click();
	
	}
	
	public void doubleClickOnTransformer(){
		

		    // Perform a double click on the transformer_button element
		    actions.doubleClick(transformer_button).build().perform();
		}

	
	}

