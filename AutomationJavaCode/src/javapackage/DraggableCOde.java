package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableCOde {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable");

		driver.switchTo().frame(0);

		WebElement drag=driver.findElement(By.id("draggable"));

		WebElement drop=driver.findElement(By.id("droppable"));

		Thread.sleep(3000);
		Actions aw=new Actions(driver) ;
			aw.dragAndDrop(drag, drop).build().perform();


			Thread.sleep(5000);
			driver.get("https://jqueryui.com/draggable/");

			driver.switchTo().frame(0);



			WebElement drop1=driver.findElement(By.id("draggable"));

			Thread.sleep(3000);
			Actions aw1=new Actions(driver) ;
				//aw1.dragAndDropBy(drop1,100,60).build().perform();

				Thread.sleep(3000);
				aw1.clickAndHold(drop1).dragAndDropBy(drop1, 100, 60).build().perform();


	}

}
