package vtiger.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.rowset.internal.Row;

public class Excelutility
{
	
// read data from Excel
	
public String readexceldata(String Sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new FileInputStream("C:\\Users\\SP KANNAN\\Desktop\\Selenium\\Maven\\folder1\\Excel.xlsx");
	Workbook wb=WorkbookFactory.create(fs);
	String data=wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	return data;
}

//read last row from excel

public int readlastrow(String Sheetname, int num) throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new FileInputStream("C:\\Users\\SP KANNAN\\Desktop\\Selenium\\Maven\\folder1\\Excel.xlsx");
	Workbook wb=WorkbookFactory.create(fs);
	int data=wb.getSheet(Sheetname).getLastRowNum();
	return data;	
}

//write data in excel

public void writeexceldata(String Sheetname, int rownum, int cellnum) throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new FileInputStream("C:\\Users\\SP KANNAN\\Desktop\\Selenium\\Maven\\folder1\\Excel.xlsx");
	Workbook wb=WorkbookFactory.create(fs);
	String data=wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	FileOutputStream fout=new FileOutputStream("C:\\Users\\SP KANNAN\\Desktop\\Selenium\\Maven\\folder1\\Excel.xlsx");
	wb.write(fout);

}	
	
}




