package genericUtils;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import POM.DashboardPageObject;

public class AssertionUtility {

	/**
	 * Assertion to verify if the Login Actions has been successfully
	 * @param driver
	 * @param dashboard
	 * @param userName
	 */
	public static void assertLoginSuccess(WebDriver driver,
			DashboardPageObject dashboard) {
		Reporter.log("Verifying Login Successfully");
		String Title=driver.getTitle();
		Assert.assertEquals(Title, CSVDataProvider.getCSVData(0, 2), "Title doesn't match the expected title");
	}
	
	public static void assertElementExists(WebElement element, String elementText) {
		Assert.assertTrue(element.isDisplayed(), elementText +" :Dose Not Exist On Page");
		Assert.assertTrue(element.getText().contains(elementText), elementText +" :Dose Not Exist On Page");

	}

	public static void assertElementNotExists(WebElement element, String elementText) {
		Assert.assertFalse(element.getText().equals(elementText), elementText +"Dose Not Exist On Page");
		Assert.assertFalse(element.getText().contains(elementText), elementText +"Dose Not Exist On Page");

	}

	public static void assertElementExists(WebElement element) {
		
		Assert.assertTrue(element.isDisplayed(),"Element Dose Not Exist On Page");

	}

	public static void assertElementNotExists(WebDriver driver, WebElement element) {
		Assert.assertFalse(WebdriverUtility.waitforElementDisplayed(driver, element));

	}

	public static void assertTextEquals(String actualText, String expectedText) {
		Assert.assertEquals(actualText, expectedText, expectedText +"Expected text is not Matched with Actual");

	}
	
	public static void assertValueEquals(int value1, int value2) {
		Assert.assertEquals(value1, value2);
	}

	public static void assertCheckboxisChecked(WebElement element) {
		Assert.assertTrue(element.isSelected(), "Checkbox is Not Selected");

	}

	public static void assertListEquals(List<String> listSubsSuper, List<String> listDefaultSuper) {
		Assert.assertEquals(listSubsSuper, listDefaultSuper, "List Item Mismatched");

	}
	
	public static void assertListNotEquals(List<String> listSubsSuper, List<String> listDefaultSuper) {
		Assert.assertNotEquals(listSubsSuper, listDefaultSuper, "List Item Matched");

	}
}
