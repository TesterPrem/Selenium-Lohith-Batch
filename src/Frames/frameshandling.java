package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frameshandling {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		driver.findElement(By.name("fname")).sendKeys("Pr");
		Thread.sleep(3000);
		driver.findElement(By.name("lname")).sendKeys("Ana");
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("onnpremkd@gmail.com");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.name("fname")).sendKeys("em");
		Thread.sleep(3000);
		driver.findElement(By.name("lname")).sendKeys("ndh");
		Thread.sleep(3000);
		

	}

}
