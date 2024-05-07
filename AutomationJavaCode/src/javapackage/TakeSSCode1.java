package javapackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeSSCode1 {

	WebDriver driver;

	@Test
	public void captureScreenshot() throws Exception
	{
	driver=new ChromeDriver();

	// Maximize the browser
	driver.manage().window().maximize();

	// Pass application url
	driver.get("http://www.facebook.com");

	// Here we are forcefully passing wrong id so that it will fail our testcase
	driver.findElement(By.xpath(".//*[@id='emailasdasdas']")).sendKeys("Learn Automation");


	}

	// It will execute after every test execution 
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{
	if(ITestResult.FAILURE==result.getStatus())
	{
	// Create refernce of TakesScreenshot
	TakesScreenshot ts=(TakesScreenshot)driver;

	// Call method to capture screenshot
	File source=ts.getScreenshotAs(OutputType.FILE);

	// Copy method  specific location here it will save all screenshot in our project home directory and
	// result.getName() will return name of test case so that screenshot name will be same
	
	FileHandler.copy(source, new File("./Screenshots/"+result.getName()+".png"));
	System.out.println("Screenshot taken");
	
	// close application
	driver.quit();
	}
}
}


