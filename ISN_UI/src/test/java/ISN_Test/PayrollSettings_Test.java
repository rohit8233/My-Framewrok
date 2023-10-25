package ISN_Test;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import POM.PayrollSettingsObject;
import genericUtils.AssertionUtility;
import genericUtils.Baseclass;
import genericUtils.CSVDataProvider;
import genericUtils.MyTestListener;
import genericUtils.WebdriverUtility;


@Listeners(MyTestListener.class)

public class PayrollSettings_Test extends Baseclass{

	@Test
	public void verifyAddSplitPayrollCalculation_Test(){
		
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.addSplitPayrollCalculation();
	}
	
	@Test
	public void verifySplitEndDateFunctionality_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.clickAddAndRemoveSplitEndDatebutton();

	}
	
	@Test
	public void verifyDeleteSplitPayrollCalculation_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.deleteSplitPayrollCalculation();
	}
	
	@Test
	public void verifyHideDetailsFunctionality_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.navigateToPayrollSettingsPage();
		payrollsettings.visibilityOfShowDetailsButton("split");
		WebdriverUtility.waitforElementClick(driver,payrollsettings.getBtn_firstshowdetails());
		AssertionUtility.assertTextEquals(payrollsettings.getBtn_firsthidedetails().getText(),CSVDataProvider.getCSVData(1,2));	
		WebdriverUtility.waitforElementClick(driver, payrollsettings.getBtn_firsthidedetails());	
		WebdriverUtility.isElementPresent(driver, payrollsettings.getBtn_firsthidedetails());
		
	}

	@Test
	public void verifyStartDateSelectedInSplitPayrollCalculation_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.methodToSelectStartDate();
	}
	
	@Test
	public void verifyEndDateSelectedInSplitPayrollCalculation_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.methodToSelectSplitStartEndDate();
	}
	
	@Test
	public void verifyAddSplitPayrollCalculationDetails_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.addandchecksplitAmountDetails();

	}
	
	@Test
	public void verifyShowDetailsFunctionality_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.toCheckShowDetailsbutton();
	}
	
	@Test
	
	public void verifyAddFixedPayrollCalculation_Test() {
		
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.addFixedPayrollCalculation();
	}
	
	@Test
	public void verifyFixedEndDateFunctionality_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.clickAddAndRemoveFixedEndDatebutton();
	}
	@Test
	public void verifyDeleteFixedPayrollCalculation_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.deleteFixedPayrollCalculation();
	}
	
	@Test
	public void verifyFixedHideDetailsFunctionality_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.navigateToPayrollSettingsPage();
		payrollsettings.visibilityOfShowDetailsButton("fixed");
		WebdriverUtility.waitforElementClick(driver,payrollsettings.getBtn_firstshowdetails());
		AssertionUtility.assertTextEquals(payrollsettings.getBtn_firsthidedetails().getText(),CSVDataProvider.getCSVData(1,2));	
		WebdriverUtility.waitforElementClick(driver, payrollsettings.getBtn_firsthidedetails());	
		WebdriverUtility.isElementPresent(driver, payrollsettings.getBtn_firsthidedetails());
		
	}
	
	@Test
	public void verifyStartDateSelectedInFixedPayrollCalculation_Test() {
		PayrollSettingsObject payrollsettings=new PayrollSettingsObject(driver);
		payrollsettings.methodToSelectFixedStartDate();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
