package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileCOde {

	public static void main(String[] args) throws Exception {

		File src1=new File("C:\\Users\\abhis\\eclipse-workspace\\AutomationJavaCode\\Repository\\config.properties");
		File src2=new File("C:\\Users\\abhis\\eclipse-workspace\\AutomationJavaCode\\Repository\\locators.properties");
		File src3=new File("C:\\Users\\abhis\\eclipse-workspace\\AutomationJavaCode\\Repository\\testdata.properties");

		FileInputStream fis1=new FileInputStream(src1);
		FileInputStream fis2=new FileInputStream(src2);
		FileInputStream fis3=new FileInputStream(src3);

		Properties pro1=new Properties();
		pro1.load(fis1);
		Properties pro2=new Properties();
		pro2.load(fis2);
		Properties pro3=new Properties();
		pro3.load(fis3);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("URL"));

		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
	}

}
