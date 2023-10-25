package genericUtils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;



	
	/**
	 * This class will provide implimentation to the retryanalyser interface of testNG
	 * @author User
	 *
	 */
	public class RetryAnalyzer implements IRetryAnalyzer
	{
		private int maxRetries = 3; // Set the maximum number of retries here
	    private int retryCount = 0;

	    @Override
	    public boolean retry(ITestResult result) {
	        if (retryCount < maxRetries) {
	            retryCount++;
	            return true; // Retry the test
	        }
	        return false; // Don't retry the test
	    }
	}

