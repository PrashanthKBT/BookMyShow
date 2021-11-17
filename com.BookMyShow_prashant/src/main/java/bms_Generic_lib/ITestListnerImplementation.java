package bms_Generic_lib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
/***
 * 
 * @author Prashanth KB
 *
 */
public class ITestListnerImplementation implements  ITestListener{

	public void onTestStart(ITestResult result) {  
		// TODO Auto-generated method stub  
	}  

	public void onTestSuccess(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Success of test cases and its details are : "+result.getName());  
	}  

	public void onTestFailure(ITestResult result) {  
		TakesScreenshot screen=(TakesScreenshot) BaseClass.driver;
		File source = screen.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("./screenshots/ss1.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}  

	public void onTestSkipped(ITestResult result) {  
		// TODO Auto-generated method stub  
		System.out.println("Skip of test cases and its details are : "+result.getName());  
	}  

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {  

	}  

	public void onStart(ITestContext context) {  
		// TODO Auto-generated method stub  
	}  

	public void onFinish(ITestContext context) {  
		// TODO Auto-generated method stub  
	}  
}
