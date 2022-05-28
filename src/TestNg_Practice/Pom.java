package TestNg_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom 
{
	@FindBy(name = "username")
	private WebElement user;
	
	@FindBy(name = "pwd")
	private WebElement pass;
	
	@FindBy(id = "loginButton")
	private WebElement login;
	
	
	public Pom(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void un(String u)
	{
		user.sendKeys(u);
	}
	public void pw(String p)
	{
		pass.sendKeys(p);
	}
	public void log()
	{
		login.click();
	}
	

}
