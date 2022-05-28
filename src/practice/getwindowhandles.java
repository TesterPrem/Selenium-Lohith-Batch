package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		Thread.sleep(3000);
		driver.findElement(By.id("button1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		Set<String> whs = driver.getWindowHandles();
		int tot = whs.size();
		System.out.println(tot);
		String tit = driver.getTitle();
		System.out.println(tit);
		
		for(String all : whs) {
			driver.switchTo().window(all);
			String tita = driver.getTitle();
			System.out.println(tita);
		}
		driver.quit();
		
	}

}
