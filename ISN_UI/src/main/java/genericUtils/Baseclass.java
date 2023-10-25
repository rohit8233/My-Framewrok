package genericUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import POM.DashboardPageObject;
import POM.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver sdriver;//for screenshot in listeners
	public WebDriver driver=null;
	PropertyfileUtility propertyfile=new PropertyfileUtility();
	@BeforeClass
	
	public void LaunchBrowser() {
		
		
		String Browser=CSVDataProvider.getCSVData(0, 0);			
		String URL=CSVDataProvider.getCSVData(0, 1);
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			sdriver=driver;//for screenshot in listeners
			System.out.println("===="+Browser+" Launch Successful====");
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			sdriver=driver;//for screenshot in listeners
			System.out.println("===="+Browser+" Launch Successful====");
		}
		else
		{
			System.out.println("invalid browser");
		}	
		
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	
	@BeforeMethod
	
	public void LoginToApplication() {
		
		LoginPageObject loginpage=new LoginPageObject(driver);
		DashboardPageObject dashboard=new DashboardPageObject(driver);
		if(loginpage.isUsernameFieldEmpty()) {
			loginpage.Login(CSVDataProvider.getCSVData(0, 3), CSVDataProvider.getCSVData(0, 4));
		}
		else {
			loginpage.enterPassword(CSVDataProvider.getCSVData(0, 4));
		}
		
		AssertionUtility.assertLoginSuccess(driver, dashboard);
	}
	
	
	@AfterMethod
	
	public void LogoutToApplication() throws InterruptedException {
		DashboardPageObject dashboardpage=new DashboardPageObject(driver);
		dashboardpage.logout();	
	}
	
	@AfterClass
	public void CloseBrowser() {
		
		driver.quit();
		}
	}
