package javapackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlepopup {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		driver.findElement(By.id("tabButton")).click();

		Set<String> allWindow=driver.getWindowHandles();
		System.out.println(allWindow);

		Iterator<String> abc=allWindow.iterator();
		String wins1=abc.next();
		String wins2=abc.next();

		System.out.println(wins1);
		System.out.println(wins2);

		driver.switchTo().window(wins2);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}


}
