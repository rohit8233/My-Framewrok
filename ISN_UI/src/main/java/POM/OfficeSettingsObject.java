package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtils.WebdriverUtility;

public class OfficeSettingsObject extends WebdriverUtility{

	public WebDriver driver;
	public OfficeSettingsObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[@href=\"/ux-test/payrollsettings\"]")
	private WebElement tab_payrollsettings;
	
	public WebElement getTab_payrollsettings() {
		return tab_payrollsettings;
	}
	
	public void clickPayrollSettings() {
		WebdriverUtility.waitforElementClick(driver, getTab_payrollsettings());
		
	}
}
