package com.demowebshop.automation.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilitySelectClass
{
	public static Select selectDrop(WebElement drop)
	{
		Select sel=new Select( drop);
		return sel;
	}
}
