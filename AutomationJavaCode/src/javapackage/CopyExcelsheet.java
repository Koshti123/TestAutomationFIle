package javapackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CopyExcelsheet {

	public static void main(String[] args) throws IOException {
		 // Load the workbook
        File src = new File("C:\\Users\\abhis\\OneDrive\\Desktop\\Testing Course.xlsx");
        FileInputStream fis = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook(fis);

        // Get the source sheet
        XSSFSheet sourceSheet = wb.getSheet("Automation");

        // Clone the source sheet
        XSSFSheet targetSheet = wb.cloneSheet(wb.getSheetIndex(sourceSheet));
        targetSheet = wb.getSheetAt(wb.getSheetIndex(sourceSheet) + 1); // Renaming the cloned sheet
        wb.setSheetName(wb.getSheetIndex(targetSheet), "ClonedAutomation"); // Change the name as per requirement

        // Write the changes back to the workbook
        FileOutputStream fos = new FileOutputStream(src);
        wb.write(fos);

        // Close resources
        fos.close();
        fis.close();
        wb.close();
	}

}
