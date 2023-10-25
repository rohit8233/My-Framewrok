package genericUtils;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class WebdriverUtility {

	
	
	public static void waitforElementClick(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	public static boolean waitforElementDisplayed(WebDriver driver, WebElement element) {
		return element.isDisplayed();
	}
	
	public static void waitforElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout, you can adjust it as needed
        wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void isElementPresent(WebDriver driver, WebElement element) {
		try {
			if(WebdriverUtility.waitforElementDisplayed(driver, element)) {
				System.out.println("Element exists on the Page");
			}
		}
		catch(NoSuchElementException e) {
			System.out.println("Element is not present on the Page");
		}
	}
	
	
	public static void switchToFrame(WebDriver driver, String text) {
		Alert alert=driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), text);
	}
	
	public String takeScreenshot(WebDriver driver ,String screenShotName) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot) driver;	//Up-casting
		File src = ts.getScreenshotAs(OutputType.FILE); 
		File dest=new File(".\\ScreenShots\\"+screenShotName+".png");
		FileUtils.copyFile(src, dest); 
		
		return dest.getAbsolutePath(); // It returns the absolute path of the destination file where the screenshot is saved
	
	}
	
	/**
	 * This method will wait until a particular element becomes visible
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver , WebElement element)
	{	
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method will handle drop down by using index
	 * @param element
	 * @param index
	 */
	public void handleDropDownbyIndex(WebElement element , int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index); 
	}
	/**
	 * This method will handle drop down by using value
	 * @param element
	 * @param value
	 */
	public void handleDropDownbyValue(WebElement element, String value) 
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	/**
	 * This method will handle drop down by using text
	 * @param element
	 * @param text
	 */
	public void handleDropDownbyText(WebDriver driver, WebElement element, String text)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}	
	/**
	 * This method will perform mouse Hover action on a specified element
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver , WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();            
		
	}
	/**
	 * This method will double click anywhere on web page
	 * @param driver
	 */
	public void doubleClicAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	/**
	 * This method will double click on a specified element on web page
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver , WebElement element)
	{
		Actions act =new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * This method will right click anywhere on web page
	 * @param driver
	 */
	 public void rightClickAction(WebDriver driver)
	 {
		 Actions act =new Actions(driver);
		 act.contextClick().perform();
	 }
	 /**
	  * This method will right click on specified element on web page
	  * @param driver
	  * @param element
	  */
	 public void rightClickAction(WebDriver driver , WebElement element)
	 {
		 Actions act=new Actions(driver);
		 act.contextClick(element).perform();
	 }
	  /**
	   * This method will drag and drop a element from source to destination
	   * @param driver
	   * @param src
	   * @param dest
	   */
	 public void dragAndDropAction(WebDriver driver , WebElement src , WebElement dest)
	 {
		 Actions act = new Actions(driver);
		 act.dragAndDrop(src, dest).perform();
	 }
	 
	 public static String getParentWindow(WebDriver driver) {
	       String parentWindowHandle = driver.getWindowHandle();
           return parentWindowHandle;
	 }
	 
	 public static void switchToWindowWithDesiredTitle(WebDriver driver, String desiredtitle) {
		 
       Set<String> windowHandles = driver.getWindowHandles();
       for (String windowHandle : windowHandles) {
           driver.switchTo().window(windowHandle);
           String windowTitle = driver.getTitle();
           
           if (windowTitle.equals(desiredtitle)) {
               // You've switched to the desired child window
               return;
           }
       }
	 }
	 
	 public static void switchToParentWindow(WebDriver driver) {
		 
	       String parentWindowHandle = getParentWindow(driver);
	       driver.switchTo().window(parentWindowHandle);  
	 }
	 
	 public static String[] getMonthYear(String monthyearvalue) {
		 return monthyearvalue.split(" ");
	 }
	 
	 public static String getMonthNumber(String monthName) {
	        switch (monthName) {
	        case "01":
                return "January";
            case "02":
                return "February";
            case "03":
                return "March";
            case "04":
                return "April";
            case "05":
                return "May";
            case "06":
                return "June";
            case "07":
                return "July";
            case "08":
                return "August";
            case "09":
                return "September";
            case "10":
                return "October";
            case "11":
                return "November";
            case "12":
                return "December";
	            default:
	                throw new IllegalArgumentException("Invalid month name: " + monthName);
	        }
	 
	 }
	 
	 public static int removeLeadingZeros(String numericString) {
		    // Use regular expressions to remove leading zeros
		    String cleanedString = numericString.replaceFirst("^0+", "");		    
		    // Parse the cleaned string as an integer
		    int result = Integer.parseInt(cleanedString);	    
		    return result;
		}
}
