package TestNg_Practice;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GettingwindowHandles 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		
	}
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void connect()
	{
		Reporter.log("connect to the site", true);
	}
	@Parameters({"browsername"})
	@BeforeMethod
	public void openurl(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://www.leafground.com/pages/Window.html");
		
	}
	@Test
	public void Hanwind() throws InterruptedException
	{
		WebElement homwin = driver.findElement(By.xpath("//button[@onclick='openWin();']"));
		homwin.click();
		String hom = driver.getWindowHandle();
		Reporter.log(hom, true);
		List<WebElement> twowin = driver.findElements(By.xpath("//button[@onclick='openWindows()']"));
		
		WebElement dontclose = driver.findElement(By.id("color"));
		dontclose.click();
		Set<String> mulwin = driver.getWindowHandles();
		int tot = mulwin.size();
		System.out.println(tot);
		Reporter.log("Successfully clicked" , true);
		
		for(String all : mulwin) {
			driver.switchTo().window(all);
			String tit = driver.getTitle();
			Reporter.log(tit, true);
		}
		
		
	}
	@AfterMethod
	public void closeurl()
	{
		
		driver.quit();
		Reporter.log("Close the site" , true);
	}
	
	@AfterSuite
	public void disconnect()
	{
		Reporter.log("Disconnected to the site" , true);
		
	}

}
