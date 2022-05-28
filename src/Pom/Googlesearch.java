package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlesearch 
{	
	@FindBy(name = "q")
	private WebElement searchtxt;
	
	public Googlesearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void search(String text)
	{
		searchtxt.sendKeys(text);
	}

}
