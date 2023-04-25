package com.demowebshop.automation.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptScrollActions 
{
	public static void scrollIntoView(WebDriver driver,WebElement fiction)
	{
		UtilityJavaScriptExecutor.scrollScript(driver).executeScript("arguments[0].scrollIntoView();", fiction);
	}
	public static void scrollBy(WebDriver driver)
	{
	UtilityJavaScriptExecutor.scrollScript(driver).executeScript("arguments[0].scrollBy(0,300)");
	}
}
