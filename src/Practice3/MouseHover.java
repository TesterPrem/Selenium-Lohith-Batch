package Practice3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//span[@class='text-wrap'])[2]"));
		Thread.sleep(3000);
		a.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='text-wrap'])[3]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement ele2 = driver.findElement(By.name("newbrowsertab453"));
		a.contextClick(ele2).perform();
		
		
		

	}

}
