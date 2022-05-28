package practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printalllinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		List<WebElement> lin = driver.findElements(By.xpath("//div"));
		Thread.sleep(5000);
		int count = lin.size();
		System.out.println(count);
		
		for(int i = 0;i < count; i++) {
			WebElement numb = lin.get(i);
			String txt = numb.getText();
			System.out.println(txt);
		}
		Thread.sleep(10000);
		

	}

}
