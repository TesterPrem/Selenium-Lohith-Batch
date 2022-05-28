package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		
		WebElement ele = driver.findElement(By.id("Click"));
				
		ele.click();
		String txt = ele.getText();
		System.out.println(txt);
		
		driver.switchTo().defaultContent();
						
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		WebElement fra2 = driver.findElement(By.name("frame2"));
		driver.switchTo().frame(fra2);
		
		WebElement ele2 = driver.findElement(By.id("Click1"));
		ele2.click();
		String txt2 = ele2.getText();
		System.out.println(txt2);
		
		driver.switchTo().defaultContent();
		

	}

}
