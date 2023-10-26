package testclass;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Pages.DashBoardPage;
import Pages.LoginGramPower;
import Pages.VerifiyEnergyPage;
import Pages.validateMeterCount;
//import Pages.ProductPage;
import utility.ConfigReader;


public class BaseTest {

	public static WebDriver driver;
	public LoginGramPower loginGramPower;
	public ExtentReports extent;
	public ExtentTest test;
	
//	public static Logger logger;
	public DashBoardPage dashBoardPage;
	public validateMeterCount ValidateMeterCount;
	public VerifiyEnergyPage verifiyEnergyPage;
	public  Actions actions;
	
	// Logging
	
	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		
		
		ConfigReader cr = new ConfigReader();
		
		String browsername = cr.readConfig("browser");
		if(browsername.equals("Chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(browsername.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		
		
		 String url = cr.readConfig("testsiteurl");
		
		driver.get(url);
		
	}
	
	
	
	
	
	@BeforeClass
	public void createObject()
	{
		loginGramPower = new LoginGramPower(driver);
		dashBoardPage = new DashBoardPage(driver);
		ValidateMeterCount = new validateMeterCount(driver);
		verifiyEnergyPage = new VerifiyEnergyPage(driver);
		  actions = new Actions(driver);
//		logger = LogManager.getLogger("driver");
	
		
	}
	
    @BeforeTest
    public void setup() {
        extent = new ExtentReports();
        test = extent.createTest("TC_GrampowerLoginPageTest");
    
        
    }
	
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}

