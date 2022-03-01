package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis = new FileInputStream("./data/testdata1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("City");
		int rowCount = sh.getLastRowNum();
		System.out.println(rowCount);
		
		for(int i=0;i<=rowCount;i++)
		{
			Row row = sh.getRow(i);
			Cell cell = row.getCell(0);
			String value = cell.getStringCellValue(); 
			System.out.println(value);
		}

	}

}

