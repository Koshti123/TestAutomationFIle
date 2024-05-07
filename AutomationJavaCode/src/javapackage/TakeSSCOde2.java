package javapackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeSSCOde2 {
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
	
	@AfterMethod
	public void Tt(ITestResult result) throws IOException {
		
		if(ITestResult.FAILURE==result.getStatus()) {
			
			TakesScreenshot ss=(TakesScreenshot) driver;
			
			File source=ss.getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(source, new File("./Screenshots/"+result.getName()+".png"));
		}
		
	}

}
