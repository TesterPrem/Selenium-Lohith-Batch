package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugges {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(5000);
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct']"));
		int count = ele.size();
		System.out.println(count);
		
		for(WebElement alllink:ele) {
			System.out.println(alllink.getText());
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}
