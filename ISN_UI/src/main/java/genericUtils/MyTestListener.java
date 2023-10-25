package genericUtils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyTestListener implements ITestListener
{
	
	ExtentReports report;//making it global so we can use inside multiple methods
	ExtentTest test;
	
	public void onTestStart(ITestResult result)
	{
		 String methodName = result.getMethod().getMethodName();
		 test=report.createTest(methodName); //used to create a new test entry in your Extent Report 
		 test.log(Status.INFO, "Execution Started-"+methodName); 
		 
		 
	}

	public void onTestSuccess(ITestResult result) 
	{
		 String methodName = result.getMethod().getMethodName();
		 test.log(Status.PASS, "Test Script Passed-"+methodName);
	}

	
	public void onTestFailure(ITestResult result)
	{
		 JavaUtility jUtil=new JavaUtility();
		 WebdriverUtility wUtil=new WebdriverUtility();
		 String methodName = result.getMethod().getMethodName();
		 test.log(Status.FAIL, "Test Script Failed-"+methodName);
		 test.log(Status.FAIL, result.getThrowable()); //This line logs a failure status (typically indicated in red in the report).
		 String screenShotName = methodName+"-"+jUtil.getSystemDateInFormat();
		 
		 try {
			String path = wUtil.takeScreenshot(Baseclass.sdriver, screenShotName);
			test.addScreenCaptureFromPath(path); //it will attach screenshot to the path
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		 String methodName = result.getMethod().getMethodName();
		 test.log(Status.SKIP, "Test Script Skipped-"+methodName);
		 test.log(Status.SKIP,result.getThrowable());// It will give the reason what exception it throws for skipped
		 
	}


	public void onStart(ITestContext context) //this interface gives status of suite
	{
		System.out.println("----Suite Execution Started------");
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\ExtentReports\\Report"+new JavaUtility().getSystemDateInFormat()+".html");
		htmlReport.config().setDocumentTitle("ISN Execution Report");
		htmlReport.config().setReportName("ISN ExecutionReport");
		htmlReport.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Base URL", "https://qa.inspectionsupport.com/ux-test/welcome");
		report.setSystemInfo("Base Browser", "Chrome");
		report.setSystemInfo("Base Os", "Windows");
		report.setSystemInfo("Reporter name","Rohit");
	}

	public void onFinish(ITestContext context) 
	{
		System.out.println("-------Suite Execution finished-------"); 
		report.flush();//it will tell extentReports that execution is complete generate the report
	}

}