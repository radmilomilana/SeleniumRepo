package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Reader {
	File file;
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	public Excel_Reader(String filePath) throws IOException {
		file = new File(filePath);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
	}
	public String getStringData(String sheetName, int rowNumber, int columnNumber) {
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNumber);
		cell = row.getCell(columnNumber);
		return cell.getStringCellValue();
	}
	public int getIntData(String sheetName, int rowNumber, int columnNumber) {
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNumber);
		cell = row.getCell(columnNumber);
		return (int)cell.getNumericCellValue();
	}

}
