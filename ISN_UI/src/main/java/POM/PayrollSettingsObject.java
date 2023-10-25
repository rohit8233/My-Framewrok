package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import genericUtils.AssertionUtility;
import genericUtils.CSVDataProvider;
import genericUtils.WebdriverUtility;

public class PayrollSettingsObject extends WebdriverUtility{
	

	public WebDriver driver;
	public PayrollSettingsObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//tr[@id=\"parent_tr_9\"]/td[3]")
	private WebElement btn_add;
	
	@FindBy(xpath="//a[@onclick=\"openPayrollPopup('split_payroll_calculation_9');\"]")
	private WebElement tab_splitpayrollcalculation;
	
	@FindBy(xpath="//a[@onclick=\"openPayrollPopup('fixed_payroll_calculation_9');\"]")
	private WebElement tab_fixedpayrollcalculation;
	
	@FindBy(xpath="//h4[text()=\"Add a Split Payroll Calculation Amount\"]")
	private WebElement title_splitpayrollcalculation;
	
	@FindBy(xpath="//h4[text()=\"Add a Fixed Payroll Amount\"]")
	private WebElement title_fixedpayrollcalculation;
	
	@FindBy(id="fixed_fee")
	private WebElement fixedappliesfee_dropdown;
	
	@FindBy(id="fixed_amount")
	private WebElement field_fixedamount;
	
	@FindBy(xpath="//button[@onclick=\"$('#add-fixed-payroll-calculation').submit();return false;\"]")
	private WebElement btn_fixedaddcalculation;
	
	@FindBy(xpath="//button[@onclick=\"$('#fixed-payroll-calculation').dialog('close');return false;\"]")
	private WebElement btn_fixedcancelcalculation;
	
	@FindBy(id="fixed_start_date")
	private WebElement field_fixedstartdate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//th[@class=\"next\"]")
	private WebElement btn_fixedfrwstartdate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//th[@class=\"prev\"]")
	private WebElement btn_fixedprevstartdate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//td[text()=\"12\"]")
	private WebElement btn_fixedparticularstartdate;
	
	@FindBy(id="add-edate-fixed")
	private WebElement btn_fixedaddenddate;
	
	@FindBy(id="remove-edate-fixed")
	private WebElement btn_fixedremoveenddate;
	
	@FindBy(id="fixed_end_date")
	private WebElement field_fixedenddate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//th[@class=\"next\"]")
	private WebElement btn_fixedfrwdenddate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//th[@class=\"prev\"]")
	private WebElement btn_fixedprevenddate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//td[text()=\"19\"]")
	private WebElement btn_fixedparticularenddate;
	
	@FindBy(name="split_fee")
	private WebElement splitfee_dropdown;
	
	@FindBy(name="split_amount")
	private WebElement splitamount_dropdown;
		
	@FindBy(name="split_deduction_amount")
	private WebElement splitdeductionamount_dropdown;
	
	@FindBy(name="split_requested_amount")
	private WebElement splitrequestedamount_dropdown;

	@FindBy(xpath="//button[@onclick=\"$('#add-split-payroll-calculation').submit();return false;\"]")
	private WebElement btn_splitaddcalculation;

	@FindBy(xpath="(//button[contains(text(),'Add')])[1]/../../..//span[text()='Show details']")
	private WebElement btn_firstshowdetails;
	
	@FindBy(id="split_fee-2")
	private WebElement option_splitinspectionfee;
	
	@FindBy(xpath="//select[@name=\"split_amount\"]/child::option[text()=\"2.0%\"]")
	private WebElement option_splitamount;
	
	@FindBy(id="split_deduction_amount")
	private WebElement field_deductionbeforesplit;
	
	@FindBy(xpath="//select[@name=\"split_requested_amount\"]/child::option[text()=\"3.0%\"]")
	private WebElement option_splitrequestedamount;
	
	@FindBy(xpath="//table[@class=\"tbl-class\"]/tbody/tr/td[2]")
	private WebElement numberofcalculationadded;
	
	@FindBy(id="add-edate-split")
	private WebElement btn_splitaddenddate;
	
	@FindBy(id="split_end_date")
	private WebElement field_splitenddate;
	
	@FindBy(id="remove-edate-split")
	private WebElement btn_removeenddate;
	
	@FindBy(xpath="//form[@id=\"add-split-payroll-calculation\"]//button[@class=\"cncl-btn\"]")
	private WebElement btn_splitcancel;
	
	@FindBy(xpath="(//span[text()=\"Delete Calculation\"])[1]")
	private WebElement btn_splitdeletecalculation;
	
	@FindBy(xpath="(//span[text()=\"Split amount\"])[1]")
	private WebElement text_splitamount;
	
	@FindBy(xpath="(//button[contains(text(),\"Add\")])[1]/../../..//span[text()=\"Hide details\"]")
	private WebElement btn_firsthidedetails;
	
	@FindBy(xpath="//span[text()=\"Hide details\"]")
	private WebElement text_hidedetails;
	
	@FindBy(xpath="//input[@id=\"split_start_date\"]")
	private WebElement field_splitstartdate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//th[@class=\"prev\"]")
	private WebElement btn_prevstartdate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//th[@class=\"next\"]")
	private WebElement btn_frwdstartdate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//th[@class=\"next\"]")
	private WebElement btn_frwdenddate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//th[@class=\"prev\"]")
	private WebElement btn_prevenddate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//td[text()=\"14\"]")
	private WebElement btn_particularenddate;
	
	@FindBy(xpath="//div[@class=\"datepicker-days\"]//th[@class=\"datepicker-switch\"]")
	private WebElement text_startmonthyear;
	
	@FindBy(xpath="(//span[text()=\"Fixed amount\"])[1]")
	private WebElement text_fixedamount;
	
	@FindBy(xpath="(//span[text()=\"Delete Calculation\"])[1]")
	private WebElement btn_fixeddeletecalculation;
	
	
	

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBtn_add() {
		return btn_add;
	}

	public WebElement getTab_splitpayrollcalculation() {
		return tab_splitpayrollcalculation;
	}

	public WebElement getTab_fixedpayrollcalculation() {
		return tab_fixedpayrollcalculation;
	}

	public WebElement getTitle_splitpayrollcalculation() {
		return title_splitpayrollcalculation;
	}

	public WebElement getTitle_fixedpayrollcalculation() {
		return title_fixedpayrollcalculation;
	}

	public WebElement getFixedAppliesfee_dropdown() {
		return fixedappliesfee_dropdown;
	}

	public WebElement getField_fixedamount() {
		return field_fixedamount;
	}

	public WebElement getBtn_fixedaddcalculation() {
		return btn_fixedaddcalculation;
	}

	public WebElement getBtn_fixedcancelcalculation() {
		return btn_fixedcancelcalculation;
	}

	public WebElement getField_fixedstartdate() {
		return field_fixedstartdate;
	}

	public WebElement getBtn_fixedfrwstartdate() {
		return btn_fixedfrwstartdate;
	}

	public WebElement getBtn_fixedprevstartdate() {
		return btn_fixedprevstartdate;
	}

	public WebElement getBtn_fixedparticularstartdate() {
		return btn_fixedparticularstartdate;
	}

	public WebElement getBtn_fixedaddenddate() {
		return btn_fixedaddenddate;
	}

	public WebElement getBtn_fixedremoveenddate() {
		return btn_fixedremoveenddate;
	}

	public WebElement getField_fixedenddate() {
		return field_fixedenddate;
	}

	public WebElement getBtn_fixedfrwdenddate() {
		return btn_fixedfrwdenddate;
	}

	public WebElement getBtn_fixedprevenddate() {
		return btn_fixedprevenddate;
	}

	public WebElement getBtn_fixedparticularenddate() {
		return btn_fixedparticularenddate;
	}

	public WebElement getSplitfee_dropdown() {
		return splitfee_dropdown;
	}

	public WebElement getSplitamount_dropdown() {
		return splitamount_dropdown;
	}

	public WebElement getSplitdeductionamount_dropdown() {
		return splitdeductionamount_dropdown;
	}

	public WebElement getSplitrequestedamount_dropdown() {
		return splitrequestedamount_dropdown;
	}

	public WebElement getBtn_splitaddcalculation() {
		return btn_splitaddcalculation;
	}

	public WebElement getBtn_firstshowdetails() {
		return btn_firstshowdetails;
	}

	public WebElement getOption_splitinspectionfee() {
		return option_splitinspectionfee;
	}

	public WebElement getOption_splitamount() {
		return option_splitamount;
	}

	public WebElement getField_deductionbeforesplit() {
		return field_deductionbeforesplit;
	}

	public WebElement getOption_splitrequestedamount() {
		return option_splitrequestedamount;
	}

	public WebElement getNumberofcalculationadded() {
		return numberofcalculationadded;
	}

	public WebElement getBtn_addenddate() {
		return btn_splitaddenddate;
	}

	public WebElement getField_enddate() {
		return field_splitenddate;
	}

	public WebElement getBtn_removeenddate() {
		return btn_removeenddate;
	}

	public WebElement getBtn_splitcancel() {
		return btn_splitcancel;
	}

	public WebElement getBtn_splitdeletecalculation() {
		return btn_splitdeletecalculation;
	}

	public WebElement getText_splitamount() {
		return text_splitamount;
	}

	public WebElement getBtn_firsthidedetails() {
		return btn_firsthidedetails;
	}

	public WebElement getText_hidedetails() {
		return text_hidedetails;
	}

	public WebElement getField_splitstartdate() {
		return field_splitstartdate;
	}

	public WebElement getBtn_prevstartdate() {
		return btn_prevstartdate;
	}

	public WebElement getBtn_frwdstartdate() {
		return btn_frwdstartdate;
	}

	public WebElement getBtn_frwdenddate() {
		return btn_frwdenddate;
	}

	public WebElement getBtn_prevenddate() {
		return btn_prevenddate;
	}

	public WebElement getBtn_particularenddate() {
		return btn_particularenddate;
	}

	public WebElement getText_startmonthyear() {
		return text_startmonthyear;
	}

	public WebElement getText_fixedamount() {
		return text_fixedamount;
	}
	
	public WebElement getBtn_fixeddeletecalculation() {
		return btn_fixeddeletecalculation;
	}

	public void navigateToPayrollSettingsPage() {
		DashboardPageObject dashboardpageobject=new DashboardPageObject(driver);
		OfficeSettingsObject officesettingsobject=new OfficeSettingsObject(driver);	
		dashboardpageobject.clickTabSettings();
		dashboardpageobject.clickTabOfficeSettings();
		officesettingsobject.clickPayrollSettings();
	}
	
	public void methodToAddSplitPayrollCalculation() {
		WebdriverUtility.waitforElementClick(driver, getBtn_add());
		WebdriverUtility.waitforElementClick(driver, getTab_splitpayrollcalculation());
		WebdriverUtility.switchToWindowWithDesiredTitle(driver, getTitle_splitpayrollcalculation().getText());
		waitforElementPresent(driver,getTitle_splitpayrollcalculation());
		AssertionUtility.assertTextEquals(getTitle_splitpayrollcalculation().getText(),CSVDataProvider.getCSVData(1,0));
		handleDropDownbyText(driver,getSplitfee_dropdown(),CSVDataProvider.getCSVData(2,0));
		handleDropDownbyText(driver,getSplitamount_dropdown(),CSVDataProvider.getCSVData(2,1));
		getField_deductionbeforesplit().clear();
		getField_deductionbeforesplit().sendKeys(CSVDataProvider.getCSVData(2,2));
		handleDropDownbyText(driver,getSplitrequestedamount_dropdown(),CSVDataProvider.getCSVData(2,3));
		WebdriverUtility.waitforElementClick(driver,getBtn_splitaddcalculation());
	}
	public void addSplitPayrollCalculation() {
		
		navigateToPayrollSettingsPage();
		String intialtext=getNumberofcalculationadded().getText();
		int initialcount=Integer.parseInt(intialtext);
		methodToAddSplitPayrollCalculation();
		String finaltext=getNumberofcalculationadded().getText();
		int finalcount=Integer.parseInt(finaltext);
		AssertionUtility.assertValueEquals(initialcount+1, finalcount);		
	}
	
	public void visibilityOfShowDetailsButton(String option) {
		
		String text=getNumberofcalculationadded().getText();
		int count=Integer.parseInt(text);
	try {
		if(count==0 && option.equalsIgnoreCase("Split")) {
			System.out.println("Adding Split Payroll Calculation");
			methodToAddSplitPayrollCalculation();
		}
		else if(count==0 && option.equalsIgnoreCase("Fixed")){
			
			System.out.println("Adding Fixed Payroll Calculation");
			methodToAddFixedPayrollCalculation();			
		}		
		else {
			System.out.println("Payroll Calculation is greater than 0");
			}
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
		
		}
		
	
	public void clickAddAndRemoveSplitEndDatebutton() {
		
		navigateToPayrollSettingsPage();
		WebdriverUtility.waitforElementClick(driver, getBtn_add());
		WebdriverUtility.waitforElementClick(driver, getTab_splitpayrollcalculation());
		WebdriverUtility.switchToWindowWithDesiredTitle(driver, getTitle_splitpayrollcalculation().getText());
		waitforElementPresent(driver,getTitle_splitpayrollcalculation());
		AssertionUtility.assertTextEquals(getTitle_splitpayrollcalculation().getText(),CSVDataProvider.getCSVData(1,0));
		WebdriverUtility.waitforElementClick(driver, getBtn_addenddate());
		AssertionUtility.assertElementExists(getField_enddate());
		WebdriverUtility.waitforElementClick(driver, getBtn_removeenddate());
		WebdriverUtility.isElementPresent(driver, getField_enddate());
		WebdriverUtility.waitforElementClick(driver,getBtn_splitcancel());

	}
	
	public void deleteSplitPayrollCalculation() {
		navigateToPayrollSettingsPage();
		visibilityOfShowDetailsButton("split");
		WebdriverUtility.waitforElementClick(driver, getBtn_firstshowdetails());
		AssertionUtility.assertTextEquals(getBtn_firsthidedetails().getText(),CSVDataProvider.getCSVData(1,2));	
		String intialtext=getNumberofcalculationadded().getText();
		int initialcount=Integer.parseInt(intialtext);
		waitforElementPresent(driver,getText_splitamount());
		AssertionUtility.assertTextEquals(getText_splitamount().getText(),CSVDataProvider.getCSVData(1,3));
		WebdriverUtility.waitforElementClick(driver, getBtn_splitdeletecalculation());
		String finaltext=getNumberofcalculationadded().getText();
		int finalcount=Integer.parseInt(finaltext);
		AssertionUtility.assertValueEquals(initialcount-1, finalcount);			
		
}
	

	
	public void methodToSelectStartDate() {
		navigateToPayrollSettingsPage();
		String []date=CSVDataProvider.getCSVData(2,4).split(" ");
		WebdriverUtility.waitforElementClick(driver, getBtn_add());
		WebdriverUtility.waitforElementClick(driver, getTab_splitpayrollcalculation());
		WebdriverUtility.switchToWindowWithDesiredTitle(driver, getTitle_splitpayrollcalculation().getText());
		waitforElementPresent(driver,getTitle_splitpayrollcalculation());
		AssertionUtility.assertTextEquals(getTitle_splitpayrollcalculation().getText(),CSVDataProvider.getCSVData(1,0));
		WebdriverUtility.waitforElementClick(driver, getField_splitstartdate());
		String monthyearvalue=getText_startmonthyear().getText();
		while (!(getMonthYear(monthyearvalue)[0].equalsIgnoreCase(date[1]) && getMonthYear(monthyearvalue)[1].equalsIgnoreCase(date[2])))				       
			 {				
			WebdriverUtility.waitforElementClick(driver,getBtn_prevstartdate());
			 monthyearvalue=getText_startmonthyear().getText().trim();
			}
		WebElement selecteddate=driver.findElement(By.xpath("//div[@class=\"datepicker-days\"]//td[text()=\""+date[0]+"\"]"));
		WebdriverUtility.waitforElementClick(driver, selecteddate);
		WebdriverUtility.waitforElementClick(driver, getTitle_splitpayrollcalculation());
		String dateselected=getField_splitstartdate().getAttribute("value");
		String []getdate=dateselected.split("/");			
		int date1=removeLeadingZeros(getdate[1]);
		System.out.println("Split Selected StartDate is: "+dateselected);
		AssertionUtility.assertTextEquals(CSVDataProvider.getCSVData(2,4),date1+" "+getMonthNumber(getdate[0])+" "+getdate[2]);
		WebdriverUtility.waitforElementClick(driver, getBtn_splitcancel());
		
	}
	
public void methodToSelectSplitStartEndDate() {
		
	    navigateToPayrollSettingsPage();
		String []date=CSVDataProvider.getCSVData(2,5).split(" ");
		WebdriverUtility.waitforElementClick(driver, getBtn_add());
		WebdriverUtility.waitforElementClick(driver, getTab_splitpayrollcalculation());
		WebdriverUtility.switchToWindowWithDesiredTitle(driver, getTitle_splitpayrollcalculation().getText());
		waitforElementPresent(driver,getTitle_splitpayrollcalculation());
		AssertionUtility.assertTextEquals(getTitle_splitpayrollcalculation().getText(),CSVDataProvider.getCSVData(1,0));
		WebdriverUtility.waitforElementClick(driver, getBtn_addenddate());
		WebdriverUtility.waitforElementClick(driver, getField_enddate());
		String monthyearvalue=getText_startmonthyear().getText();
		while (!(getMonthYear(monthyearvalue)[0].equalsIgnoreCase(date[1]) && getMonthYear(monthyearvalue)[1].equalsIgnoreCase(date[2])))				       
			 {				
			WebdriverUtility.waitforElementClick(driver,getBtn_prevstartdate());
			 monthyearvalue=getText_startmonthyear().getText().trim();
			}
		WebElement selecteddate=driver.findElement(By.xpath("//div[@class=\"datepicker-days\"]//td[text()=\""+date[0]+"\"]"));
		WebdriverUtility.waitforElementClick(driver, selecteddate);
		WebdriverUtility.waitforElementClick(driver, getTitle_splitpayrollcalculation());
		String dateselected=getField_enddate().getAttribute("value");
		String []getdate=dateselected.split("/");			
		int date1=removeLeadingZeros(getdate[1]);
		System.out.println("Split Selected EndDate is: "+dateselected);
		AssertionUtility.assertTextEquals(CSVDataProvider.getCSVData(2,5),date1+" "+getMonthNumber(getdate[0])+" "+getdate[2]);
		WebdriverUtility.waitforElementClick(driver, getBtn_splitcancel());
		
	}
	
	
       public void addandchecksplitAmountDetails() {		
	    navigateToPayrollSettingsPage();
	    methodToAddSplitPayrollCalculation();
		String text=getNumberofcalculationadded().getText();
		int count=Integer.parseInt(text);
		int countminusone=count-1;
		System.out.println("Total Record: "+count);
		visibilityOfShowDetailsButton("split");	
		WebdriverUtility.waitforElementClick(driver, getBtn_firstshowdetails());
		AssertionUtility.assertTextEquals(getBtn_firsthidedetails().getText(),CSVDataProvider.getCSVData(1,2));	
		WebElement ele1=driver.findElement(By.xpath("(//span[text()='Applies to Fee:']/../..//select)["+count+"]/option[@selected]"));
		System.out.println("Applies to fees: "+ele1.getText());
		AssertionUtility.assertTextEquals(ele1.getText(),CSVDataProvider.getCSVData(2,0));		
		WebElement ele2=driver.findElement(By.xpath("(//span[text()=\"Split Amount per Charged Fee:\"]/../..//select)["+countminusone+"]/option[@selected]"));
		System.out.println("Split amount per charged fee: "+ele2.getText());
		AssertionUtility.assertTextEquals(ele2.getText(),CSVDataProvider.getCSVData(2,1));
		String ele3=driver.findElement(By.xpath("(//span[text()=\"Deduction $ Amount before Split:\"]/../..//input)["+countminusone+"]")).getAttribute("value");
		System.out.println("Deduction $ amount before split: "+ele3);
		AssertionUtility.assertTextEquals(ele3,CSVDataProvider.getCSVData(2,2));
		WebElement ele4=driver.findElement(By.xpath("(//span[text()=\"Split if inspector is requested:\"]/../..//select)["+countminusone+"]/option[@selected]"));
		System.out.println("Split if requested: "+ele4.getText());
		AssertionUtility.assertTextEquals(ele4.getText(),CSVDataProvider.getCSVData(2,3));
	
}	
       public void toCheckShowDetailsbutton() {
   	    navigateToPayrollSettingsPage();
		visibilityOfShowDetailsButton("split");
		WebdriverUtility.waitforElementClick(driver, getBtn_firstshowdetails());
		AssertionUtility.assertTextEquals(getBtn_firsthidedetails().getText(),CSVDataProvider.getCSVData(1,2));	
		String text=getNumberofcalculationadded().getText();
		int count=Integer.parseInt(text);
		while(count>0) {
			
          	waitforElementPresent(driver,getText_splitamount());
			AssertionUtility.assertTextEquals(getBtn_firsthidedetails().getText(),CSVDataProvider.getCSVData(1,2));
			WebdriverUtility.waitforElementClick(driver, getBtn_splitdeletecalculation());
			try {
				WebdriverUtility.waitforElementClick(driver, getBtn_firstshowdetails());
			}
			catch(Exception e){
				e.printStackTrace();
				Reporter.log("Show Details Button is not Present For This Record", true);
			}
			count--;
		}
		
       }
       
       public void methodToAddFixedPayrollCalculation() {
   		WebdriverUtility.waitforElementClick(driver, getBtn_add());
   		WebdriverUtility.waitforElementClick(driver, getTab_fixedpayrollcalculation());
   		WebdriverUtility.switchToWindowWithDesiredTitle(driver, getTitle_fixedpayrollcalculation().getText());
   		waitforElementPresent(driver,getTitle_fixedpayrollcalculation());
   		AssertionUtility.assertTextEquals(getTitle_fixedpayrollcalculation().getText(),CSVDataProvider.getCSVData(3,0));
   		handleDropDownbyText(driver,getFixedAppliesfee_dropdown(),CSVDataProvider.getCSVData(3,1));
   		getField_fixedamount().clear();
   		getField_fixedamount().sendKeys(CSVDataProvider.getCSVData(3,2));
   		WebdriverUtility.waitforElementClick(driver,getBtn_fixedaddcalculation());
   	}
       
       public void addFixedPayrollCalculation() {
   		
   		navigateToPayrollSettingsPage();
   		String intialtext=getNumberofcalculationadded().getText();
   		int initialcount=Integer.parseInt(intialtext);
   		methodToAddFixedPayrollCalculation();
   		String finaltext=getNumberofcalculationadded().getText();
   		int finalcount=Integer.parseInt(finaltext);
   		AssertionUtility.assertValueEquals(initialcount+1, finalcount);		
   	}
       public void clickAddAndRemoveFixedEndDatebutton() {
   		
   		navigateToPayrollSettingsPage();
   		WebdriverUtility.waitforElementClick(driver, getBtn_add());
   		WebdriverUtility.waitforElementClick(driver, getTab_fixedpayrollcalculation());
   		WebdriverUtility.switchToWindowWithDesiredTitle(driver,getTitle_fixedpayrollcalculation().getText());
   		waitforElementPresent(driver,getTitle_fixedpayrollcalculation());
   		AssertionUtility.assertTextEquals(getTitle_fixedpayrollcalculation().getText(),CSVDataProvider.getCSVData(3,0));
   		WebdriverUtility.waitforElementClick(driver, getBtn_fixedaddenddate());
   		AssertionUtility.assertElementExists(getField_fixedenddate());
   		WebdriverUtility.waitforElementClick(driver, getBtn_fixedremoveenddate());
   		WebdriverUtility.isElementPresent(driver,getField_fixedenddate());
		WebdriverUtility.waitforElementClick(driver,getBtn_fixedcancelcalculation());

   	}
       
       public void deleteFixedPayrollCalculation() {
   		navigateToPayrollSettingsPage();  		
   		visibilityOfShowDetailsButton("fixed");
   		String intialtext=getNumberofcalculationadded().getText();
   		int initialcount=Integer.parseInt(intialtext);
   		Reporter.log("initialcount is "+intialtext,true);
   		WebdriverUtility.waitforElementClick(driver, getBtn_firstshowdetails());
		AssertionUtility.assertTextEquals(getBtn_firsthidedetails().getText(),CSVDataProvider.getCSVData(1,2));	
   		waitforElementPresent(driver,getText_fixedamount());
   		AssertionUtility.assertTextEquals(getText_fixedamount().getText(),CSVDataProvider.getCSVData(3,3));
   		WebdriverUtility.waitforElementClick(driver, getBtn_fixeddeletecalculation());
   		String finaltext=getNumberofcalculationadded().getText();
   		int finalcount=Integer.parseInt(finaltext);
   		AssertionUtility.assertValueEquals(initialcount-1, finalcount);			
   		
   }
       
       public void methodToSelectFixedStartDate() {
   		navigateToPayrollSettingsPage();
   		String []date=CSVDataProvider.getCSVData(3,4).split(" ");
   		WebdriverUtility.waitforElementClick(driver, getBtn_add());
   		WebdriverUtility.waitforElementClick(driver, getTab_fixedpayrollcalculation());
   		WebdriverUtility.switchToWindowWithDesiredTitle(driver,getTitle_fixedpayrollcalculation().getText());
   		waitforElementPresent(driver,getTitle_fixedpayrollcalculation());
   		AssertionUtility.assertTextEquals(getTitle_fixedpayrollcalculation().getText(),CSVDataProvider.getCSVData(3,0));
   		WebdriverUtility.waitforElementClick(driver,getField_fixedstartdate());
   		String monthyearvalue=getText_startmonthyear().getText();
   		while (!(getMonthYear(monthyearvalue)[0].equalsIgnoreCase(date[1]) && getMonthYear(monthyearvalue)[1].equalsIgnoreCase(date[2])))				       
   			 {				
   			WebdriverUtility.waitforElementClick(driver,getBtn_prevstartdate());
   			 monthyearvalue=getText_startmonthyear().getText().trim();
   			}
   		WebElement selecteddate=driver.findElement(By.xpath("//div[@class=\"datepicker-days\"]//td[text()=\""+date[0]+"\"]"));
   		WebdriverUtility.waitforElementClick(driver, selecteddate);
   		WebdriverUtility.waitforElementClick(driver, getTitle_fixedpayrollcalculation());
   		String dateselected=getField_fixedstartdate().getAttribute("value");
   		String []getdate=dateselected.split("/");			
   		int date1=removeLeadingZeros(getdate[1]);
   		System.out.println("Fixed Selected StartDate is: "+dateselected);
   		AssertionUtility.assertTextEquals(CSVDataProvider.getCSVData(3,4),date1+" "+getMonthNumber(getdate[0])+" "+getdate[2]);
   		WebdriverUtility.waitforElementClick(driver,getBtn_fixedcancelcalculation() );
   		
   	}
		
       }
