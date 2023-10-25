package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtils.WebdriverUtility;

public class LoginPageObject extends WebdriverUtility{

	public WebDriver driver;
	public LoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(id="username")
	private WebElement text_username;
	
	public WebElement getText_username() {
		return text_username;
	}

	@FindBy(id="password")
	private WebElement text_password;
	
	public WebElement getText_password() {
		return text_password;
	}
	
	@FindBy(xpath="//span[text()=\"Log In\"]")
	private WebElement btn_login;
	
	public WebElement getBtn_login() {
		return btn_login;
	}
	
	public void Login(String user, String pass) {
		text_username.sendKeys(user);
		text_password.sendKeys(pass);
		waitforElementClick(driver,btn_login);
	}
	
	public boolean isUsernameFieldEmpty() {
        String usernameText = getText_username().getAttribute("value");
        return usernameText.isEmpty();
    }
	
	public void enterPassword(String password) {
        getText_password().sendKeys(password);
		waitforElementClick(driver,btn_login);
    }

}
