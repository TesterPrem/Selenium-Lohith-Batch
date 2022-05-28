package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_locator 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8867330794");
		Thread.sleep(5000);
		driver.findElement(By.id("pass")).sendKeys("Drpkforfb*1");
		Thread.sleep(5000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(5000);
        driver.close();

	}

}
