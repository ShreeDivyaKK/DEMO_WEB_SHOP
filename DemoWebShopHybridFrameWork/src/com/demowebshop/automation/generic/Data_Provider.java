package com.demowebshop.automation.generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class Data_Provider implements Framework_Constants
{
	@DataProvider(name="TestData")
	public Object[][] getTestData() throws EncryptedDocumentException, IOException
	{
		Object[][] arr = FetchingDataFrom_Excel.getMultipleExcelData(SHEET_NAME);
		return arr;
	}
	
}
