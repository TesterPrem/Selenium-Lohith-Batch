package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_text {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8867330794");//xpath by attribute
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("Drpkforfb*1");// xpath by attribute
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Log In'] ")).click(); // xpath by text
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();// xpath by text
		Thread.sleep(5000);
		driver.close();

	}

}
