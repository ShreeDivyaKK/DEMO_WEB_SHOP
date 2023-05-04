package com.demowebshop.automation.generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



@Listeners(ListenerClass.class)
public class Base_Class extends ListenerClass implements Framework_Constants
{
	
	public WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	
	/*@BeforeSuite
	public void dataBaseConnector() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/rasa15";
		String username="root";
		String password="root";
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement state = conn.createStatement();
		ResultSet res = state.executeQuery("select * from credentials where username='Swapna';");
		res.next();
		String userdata = res.getString("username");
		String passdata=res.getString("password");
		System.out.println(userdata+" "+passdata);
	}*/
	@BeforeClass
	public void extantReport() 
	{
		 report=new ExtentReports("./reports/ex.html");
		 test = report.startTest("Testcase1");
		
		
		/*ExtentHtmlReporter report=new ExtentHtmlReporter(EXTENTREPORTPATH);
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(report);
		test=reports.startTest("Extent Report");*/
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
			test.log(LogStatus.PASS, APPLAUNCHED);
			driver.manage().window().maximize();
		}
		else
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(URL);
			test.log(LogStatus.PASS, APPLAUNCHED);
			driver.manage().window().maximize();
		}	
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
	@AfterClass
	public void closeReport()
	{
		report.flush();
	}
}
