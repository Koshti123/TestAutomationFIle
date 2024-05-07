package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseCode1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		WebElement electro=driver.findElement(By.xpath("//*[text()='Fashion']"));
		Actions act=new Actions(driver);
		//act.moveToElement(electro).build().perform();
		Thread.sleep(3000);
		act.sendKeys(electro,Keys.ENTER).build().perform();




	}

}
