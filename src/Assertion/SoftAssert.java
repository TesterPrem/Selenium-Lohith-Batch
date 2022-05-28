package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SoftAssert 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void connect() 
	{
		Reporter.log("connect to the database", true);
	}
	@BeforeMethod
	public void openurl() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");		
		Reporter.log("Open the website", true);		
	}
	@Test
	public void run() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("trainee");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("Successfully Logged In", true);
		String tit = driver.getTitle();
		org.testng.asserts.SoftAssert  a = new org.testng.asserts.SoftAssert();
		a.assertEquals(tit, "actitime");
		Reporter.log(tit, true);
				
	}
	
	@AfterMethod
	public void close()
	{
		driver.close();
		Reporter.log("Closed window", true);
	}
	@AfterSuite
	public void disconnect()
	{
		Reporter.log("Disconnect to the database", true);
	}
	

}
