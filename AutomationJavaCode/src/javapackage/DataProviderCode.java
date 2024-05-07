package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderCode {
	
	WebDriver driver;
	
	@BeforeClass
	public void env() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@DataProvider
	public Object[][] dataset() throws Exception{
		File src1=new File("C:\\Users\\abhis\\eclipse-workspace\\AutomationJavaCode\\Repository\\testdata.properties");
		FileInputStream fis1=new FileInputStream(src1);
		Properties pro1=new Properties();
		pro1.load(fis1);
		
		Object ar[][]=new Object[1][2];
		ar[0][0]=pro1.getProperty("TestData1");
		ar[0][1]=pro1.getProperty("TestData2");
		
		
		return ar;
	}
	
@Test(dataProvider = "dataset")
public void setdata(String name, String pass) throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.id("email")).sendKeys(name);
	Thread.sleep(3000);
	driver.findElement(By.id("pass")).sendKeys(pass);
}

}
