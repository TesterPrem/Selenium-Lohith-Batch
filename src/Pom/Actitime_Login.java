package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_Login 
{
	// 1.Declaration
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(name = "pwd")
	private WebElement password;
	
	@FindBy(id = "loginButton")
	private WebElement loginbutton; 
	
	// 2. Initialization
	public Actitime_Login(WebDriver driver) 
	{
		PageFactory.initElements(driver, this );
	}
	
	//3.Utilization
	public void un(String user)
	{
		username.sendKeys(user);
	}
	public void pw( String pass)
	{
		password.sendKeys(pass);
	}
	public void log()
	{
		loginbutton.click();
	}
	

}
