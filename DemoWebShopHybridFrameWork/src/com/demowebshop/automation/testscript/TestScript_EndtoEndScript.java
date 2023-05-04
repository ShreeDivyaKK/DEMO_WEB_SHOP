package com.demowebshop.automation.testscript;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.demowebshop.automation.generic.Base_Class;
import com.demowebshop.automation.generic.GenericDataTypeConverter;
import com.demowebshop.automation.generic.JavaScriptScrollActions;
import com.demowebshop.automation.generic.SelectDropdown;
import com.demowebshop.automation.pom.Pom_Class_SystemTestScript;
import com.relevantcodes.extentreports.LogStatus;

public class TestScript_EndtoEndScript extends Base_Class
{
	@Test
	public void systemScript(/*String userdata, String passdata*/) throws InterruptedException
	{
	Pom_Class_SystemTestScript pcm=new Pom_Class_SystemTestScript(driver);
	pcm.loginLink().click();
	pcm.emailTextfield().sendKeys(USERNAME);
	pcm.passwordTextfield().sendKeys(PASSWORD);
	pcm.loginButton().click();
	WebElement title = pcm.homeTitle();
	if(title.equals(HOMEPAGETITLE))
	{
		test.log(LogStatus.PASS, "Home page is displayed");
	}
	/*else
	{
		test.log(LogStatus.FAIL, "Home page is not displayed");
	}*/
	pcm.books().click();
	WebElement sortBy = pcm.sortByDrop();
	SelectDropdown.selByVisibleText(sortBy,DROP1);
	WebElement display = pcm.displayDrop();
	SelectDropdown.selByVisibleText(display, DROP2);
	WebElement viewas = pcm.viewAsDrop();
	SelectDropdown.selByVisibleText(viewas, DROP3);
	pcm.computingAddToCart().click();
	pcm.popUpClose().click();
	Thread.sleep(3000);
	WebElement fiction = pcm.fictionAddToCart();
	JavaScriptScrollActions.scrollIntoView(driver,fiction );
	Thread.sleep(3000);
	fiction.click();
	pcm.popUpClose().click();
	Thread.sleep(3000);
	pcm.healthBookAddToCart().click();
	pcm.popUpClose().click();
	Thread.sleep(3000);
	WebElement shop_cart = pcm.shoppingCart();
	JavaScriptScrollActions.scrollIntoView(driver, shop_cart);
	Thread.sleep(1500);
	shop_cart.click();
	String computingbook = pcm.computingPrice().getText();
	double actual_Cprice = GenericDataTypeConverter.convertIntoDouble(computingbook);
	String fictionbook = pcm.fictionPrice().getText();
	double actual_Fprice = GenericDataTypeConverter.convertIntoDouble(fictionbook);
	String healthbook = pcm.healthBookPrice().getText();
	double actual_Hprice = GenericDataTypeConverter.convertIntoDouble(healthbook);
	if(actual_Cprice>actual_Fprice && actual_Cprice>actual_Hprice)
	{
		pcm.computingCheckBox().click();
		Thread.sleep(2000);
		JavaScriptScrollActions.scrollIntoView(driver, pcm.updateShoppingCart());
		Thread.sleep(2000);
		pcm.updateShoppingCart();
	}
	else if(actual_Fprice>actual_Cprice && actual_Fprice>actual_Hprice)
	{
		pcm.fictionCheckBox().click();
		Thread.sleep(2000);
		JavaScriptScrollActions.scrollIntoView(driver, pcm.updateShoppingCart());
		Thread.sleep(2000);
		pcm.updateShoppingCart().click();
	}
	else
	{
		pcm.healthCheckBox().click();
		Thread.sleep(2000);
		JavaScriptScrollActions.scrollIntoView(driver, pcm.updateShoppingCart());
		Thread.sleep(2000);
		pcm.updateShoppingCart().click();
	}
	pcm.logoutLink().click();
	//https://github.com/ShreeDivyaKK/DEMO_WEB_SHOP.git
	}
}
