package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuptabs {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.partialLinkText("actiTIME Inc.")).click();
		Set<String> whs = driver.getWindowHandles();
		int tot = whs.size();
		System.out.println(tot);
		for(String all : whs) {
			driver.switchTo().window(all);
			String tit = driver.getTitle();
			System.out.println(tit);
		}
				

	}

}
