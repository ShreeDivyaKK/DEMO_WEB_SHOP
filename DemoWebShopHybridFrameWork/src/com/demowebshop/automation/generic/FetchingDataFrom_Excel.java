package com.demowebshop.automation.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFrom_Excel implements Framework_Constants
{
	public static Object[][] getMultipleExcelData(String sheet) throws EncryptedDocumentException, IOException
	{
	FileInputStream fis=new FileInputStream(EXCEL);
	Sheet sh = WorkbookFactory.create(fis).getSheet(sheet);
	int actual_row = sh.getPhysicalNumberOfRows();
	int actual_cell = sh.getRow(0).getPhysicalNumberOfCells();
	Object[][]arr=new Object[actual_row-1][actual_cell];
	for(int i=0;i<actual_row-1;i++)
	{
		for(int j=0;j<actual_cell;j++)
		{
			arr[i][j]=sh.getRow(i+1).getCell(j);
		}
	}
	return arr;
	}
	/*public void getSingleExcelData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(EXCEL);
		Cell cl = WorkbookFactory.create(fis).getSheet(sheet).getRow(row).getCell(cell);
		String value = cl.toString();
		System.out.println(value);
	}*/
}
