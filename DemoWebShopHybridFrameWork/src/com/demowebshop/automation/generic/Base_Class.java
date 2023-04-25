package com.demowebshop.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Test;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@Listeners(ListenerClass.class)
public class Base_Class extends ListenerClass implements Framework_Constants
{
	
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public ExtentHtmlReporter report;
	@BeforeClass
	public void extantReport() 
	{
		ExtentHtmlReporter report=new ExtentHtmlReporter(EXTENTREPORTPATH);
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(report);
		test=reports.createTest("Extent Report");
	}
	@Parameters({"browser"})
	@BeforeMethod
	public void openApp(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(URL);
			test.log(Status.PASS,APPLAUNCHED);
			driver.manage().window().maximize();
		}
		else
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(URL);
			test.log(Status.PASS,APPLAUNCHED);
			driver.manage().window().maximize();
		}	
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
	/*@AfterClass
	public void closeReport()
	{
		report.flush();
	}*/
}
