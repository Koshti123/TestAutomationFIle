package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcelfile {

	public static void main(String[] args) throws IOException, InterruptedException {

		File src=new File("C:\\Users\\abhis\\OneDrive\\Desktop\\Testing Course.xlsx");

		FileInputStream fis=new FileInputStream(src);

		XSSFWorkbook wb=new XSSFWorkbook(fis);

		XSSFSheet sh=wb.getSheet("Automation");

		System.out.println(sh.getSheetName());

		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());



		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		String abc=sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(abc);




	}

}
