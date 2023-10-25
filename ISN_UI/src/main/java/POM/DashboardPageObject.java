package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtils.WebdriverUtility;

public class DashboardPageObject extends WebdriverUtility{

	public WebDriver driver;
	public DashboardPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id="isn_logout")
	private WebElement logout_menu;	
	
	@FindBy(xpath="//button[text()=\"Logout\"]")
	private WebElement btn_logout;
	
	@FindBy(xpath="//p[text()=\"Update Payment Information\"]")
	private WebElement text_label;
	
	@FindBy(xpath="//span[text()=\"Settings\"]")
	private WebElement tab_settings;
	
	@FindBy(xpath="//a[@href=\"/ux-test/settings/office\"]")
	private WebElement tab_officeSettings;
	
	public WebElement getTab_officeSettings() {
		return tab_officeSettings;
	}

	public WebElement getLogout_menu() {
		return logout_menu;
	}
	
	public WebElement getBtn_logout() {
		return btn_logout;
	}
	
	public WebElement getText_label() {
		return text_label;
	}
	
	public WebElement getTab_settings() {
		return tab_settings;
	}

	public void logout() {
		waitforElementClick(driver, logout_menu);
		waitforElementClick(driver, btn_logout);
			
	}
	
	public void clickTabSettings() {
		WebdriverUtility.waitforElementClick(driver, getTab_settings());
	}
	
	public void clickTabOfficeSettings() {
		WebdriverUtility.waitforElementClick(driver, getTab_officeSettings());
	}
}
