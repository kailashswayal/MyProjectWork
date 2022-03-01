package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Flib {
	
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException,IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb =WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh =wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String value = cell.getStringCellValue();
		return value;
	}
	public int getRowcount(String excelPath,String sheetName) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb =WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;	
}
	public void writeData(String excelPath, String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb =WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sh =wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		cell.setCellValue("xyz");
		
		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);
	}
	
	public String readProperty(String excelPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
