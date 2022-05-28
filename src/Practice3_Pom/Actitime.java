package Practice3_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime {
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "pwd")
	private WebElement password;
	
	@FindBy(id = "loginButton")
	private WebElement login;
	
	public Actitime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void un(String u)
	{
		username.sendKeys(u);
	}
	public void pw(String p)
	{
		password.sendKeys(p);

	}
	public void log()
	{
		login.click();
	}

}
