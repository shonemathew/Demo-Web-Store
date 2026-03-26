package Utilities;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

	public class ListenerUtils implements ITestListener {

	    // You need a way to access driver (explained below)
	    public static WebDriver driver;

	    @Override
	    public void onStart(ITestContext context) {
	        System.out.println("=== Test Execution Started ===");
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("=== Test Execution Finished ===");
	    }

	    @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("STARTED: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("PASSED: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("FAILED: " + result.getName());

	        // Take Screenshot
	        takeScreenshot(result.getName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("SKIPPED: " + result.getName());
	    }

	    private void takeScreenshot(String testName) {
	        try {
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            File src = ts.getScreenshotAs(OutputType.FILE);

	            String path = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";
	            File dest = new File(path);

	            FileUtils.copyFile(src, dest);

	            System.out.println("Screenshot saved: " + path);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

