package datadriven;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivn {
	@Test
	public void data() throws IOException {
	XSSFWorkbook book=new XSSFWorkbook("D:\\excel\\morning.xlsx");
	XSSFSheet sheet=book.getSheetAt(0);
	int rowcount=sheet.getLastRowNum();   //27
	int colCount=sheet.getRow(1).getFirstCellNum();  //256
	for(int i=1;i<=rowcount;i++)    //i=1;1<=27
	{
	XSSFRow row=sheet.getRow(i);
	for(int j=0;j<colCount;j++) 
	{

	String cellvalue="";
	cellvalue=row.getCell(j).getStringCellValue();
	System.out.println(cellvalue);


	}

	}
	}
}
