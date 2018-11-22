package week5;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LearnRD {
	@Test
	public void readExcel() throws InvalidFormatException, IOException 
	{
		File excel = new File("./data/CreateLead.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount = sheet.getRow(0).getLastCellNum();
		for (int i = 1; i <= rowCount; i++) {

			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String text = cell.getStringCellValue();
				System.out.println(text);

			}

		}

	}

	
	

}
