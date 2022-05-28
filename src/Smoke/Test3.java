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

public class Test3 {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	
	@BeforeSuite(groups = "smoke")
	public void connect() 
	{
		Reporter.log("connect to the database", true);
	}
	@BeforeMethod(groups = "smoke")
	public void openurl() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");		
		Reporter.log("Open the website", true);		
	}
	@Test(groups = "smoke")
	public void run() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("trainee");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		Thread.sleep(3000);
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("Successfully Logged In", true);
	}
	@AfterMethod(groups = "smoke")
	public void close()
	{
		driver.close();
		Reporter.log("Closed window", true);
	}
	@AfterSuite(groups = "smoke")
	public void disconnect()
	{
		Reporter.log("Disconnect to the database", true);
	}
	

}
