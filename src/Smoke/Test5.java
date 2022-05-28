package Smoke;

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

public class Test5 
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
	public void openurl() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");	
		Thread.sleep(5000);
		Reporter.log("Open the website", true);		
	}
	@Test
	public void run() throws InterruptedException
	{
		driver.findElement(By.name("user")).sendKeys("64564654646");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("64646546546546");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("Successfully Logged In", true);
	}
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		Reporter.log("Closed window", true);
	}
	@AfterSuite
	public void disconnect()
	{
		Reporter.log("Disconnect to the database", true);
	}
	

}
