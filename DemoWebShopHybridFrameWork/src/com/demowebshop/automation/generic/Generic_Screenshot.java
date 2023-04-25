package com.demowebshop.automation.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_Screenshot implements Framework_Constants
{
	public static void getScreenshot(WebDriver driver)
	{
		Date d=new Date();
		String actual_date = d.toString().replace("/", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(SCREENSHOTPATH +actual_date+" .jpeg");
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
