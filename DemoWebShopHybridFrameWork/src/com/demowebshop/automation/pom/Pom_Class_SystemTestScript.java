package com.demowebshop.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class_SystemTestScript
{
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement login_link;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement email_textfield;
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password_textfield;
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement login_button;
	@FindBy(xpath="//title[text()='Demo Web Shop']")
	private WebElement home_title;
	@FindBy(xpath="//img[@alt='Tricentis Demo Web Shop']/../../../following-sibling::div[1]/ul[1]/li[1]/a")
	private WebElement books_tab;
	@FindBy(xpath="//select[@name='products-orderby']")
	private WebElement sort_By_drop;
	@FindBy(xpath="//select[@name='products-pagesize']")
	private WebElement display_drop;
	@FindBy(xpath="//select[@name='products-viewmode']")
	private WebElement view_as_drop;
	@FindBy(xpath="//a[text()='Computing and Internet']/../following-sibling::div[3]/div[2]/input")
	private WebElement computing_cart;
	@FindBy(xpath="//a[text()='Fiction']/../following-sibling::div[3]/div[2]/input")
	private WebElement fiction_cart;
	@FindBy(xpath="//a[text()='Health Book']/../following-sibling::div[3]/div[2]/input")
	private WebElement healthbook_cart;
	@FindBy(xpath="//span[@title='Close']")
	private WebElement close_pop;
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shopping_cart;
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody/tr[3]/td[6]")
	private WebElement computing_price;
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody/tr[1]/td[6]")
	private WebElement fiction_Price;
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody/tr[2]/td[6]")
	private WebElement health_price;
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody[1]/tr[1]/td[1]")
	private WebElement fiction_Checkbox;
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody[1]/tr[2]/td[1]")
	private WebElement health_checkbox;
	@FindBy(xpath="//h1[text()='Shopping cart']/../following-sibling::div[1]/div/form/table/tbody[1]/tr[3]/td[1]")
	private WebElement computing_checkbox;
	@FindBy(xpath="//input[@value='Update shopping cart']")
	private WebElement update_cart;
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logout_link;
	
	public Pom_Class_SystemTestScript(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement loginLink()
	{
		return login_link;
	}
	public WebElement emailTextfield()
	{
		return email_textfield;
	}
	public WebElement passwordTextfield()
	{
		return password_textfield;
	}
	public WebElement loginButton()
	{
		return login_button;
	}
	public WebElement homeTitle()
	{
		return home_title;
	}
	public WebElement books()
	{
		return books_tab;
	}
	public WebElement sortByDrop()
	{
		return sort_By_drop;
	}
	public WebElement displayDrop()
	{
		return display_drop;
	}
	public WebElement viewAsDrop()
	{
		return view_as_drop;
	}
	public WebElement computingAddToCart()
	{
		return computing_cart;
	}
	public WebElement fictionAddToCart()
	{
		return fiction_cart;
	}
	
	public WebElement healthBookAddToCart()
	{
		return healthbook_cart;
	}
	public WebElement popUpClose()
	{
		return close_pop;
	}
	public WebElement shoppingCart()
	{
		return shopping_cart;
	}
	public WebElement computingPrice()
	{
		return computing_price;
	}
	public WebElement fictionPrice()
	{
		return fiction_Price;
	}
	public WebElement healthBookPrice()
	{
		return health_price;
	}
	public WebElement computingCheckBox()
	{
		return computing_checkbox;
	}
	public WebElement fictionCheckBox()
	{
		return fiction_Checkbox;
	}
	public WebElement healthCheckBox()
	{
		return health_checkbox;
	}
	public WebElement updateShoppingCart()
	{
		return update_cart;
	}
	public WebElement logoutLink()
	{
		return logout_link;
	}
	
}
