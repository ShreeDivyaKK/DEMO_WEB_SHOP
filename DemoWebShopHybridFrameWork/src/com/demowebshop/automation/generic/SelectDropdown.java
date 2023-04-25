package com.demowebshop.automation.generic;

import org.openqa.selenium.WebElement;

public class SelectDropdown implements Framework_Constants
{
	public static void selByIndex(WebElement drop,int index)
	{
		UtilitySelectClass.selectDrop(drop).selectByIndex(index);
	}
	public static void selByValue(WebElement drop, String value)
	{
		UtilitySelectClass.selectDrop(drop).selectByValue(value);
	}
	public static void selByVisibleText(WebElement drop,String value)
	{
		UtilitySelectClass.selectDrop(drop).selectByVisibleText(value);
	}
}
