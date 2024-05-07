package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriverSetup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhis\\eclipse-workspace\\AutomationJavaCode\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

	/*	driver.get("http://www.google.com/");

		Thread.sleep(5000); // Let the user actually see something!

		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("ChromeDriver");

		searchBox.submit();

		Thread.sleep(5000); // Let the user actually see something!

		driver.quit();*/




		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();

		/*1st way
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//input[@value='-1']")).click();*/


		/*2nd way
		Thread.sleep(3000);
		List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radio.size());
		Thread.sleep(3000);
		radio.get(0).click();
		Thread.sleep(3000);
		System.out.println(radio.get(0).isDisplayed());
		System.out.println(radio.get(0).isEnabled());
		System.out.println(radio.get(0).isSelected());*/

		List<WebElement> radio1=driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println(radio1.size());
		String expResult="Female";
		for (WebElement element : radio1) {
			if(element.getText().equalsIgnoreCase(expResult)) {
				element.click();
				break;
			}
		}

	}

}
