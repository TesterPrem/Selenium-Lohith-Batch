package Mouse_Hover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		String tit1 = driver.getTitle();
		System.out.println(tit1);
		WebElement ele1 = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Selenium Training")).click();
		String tit2 = driver.getTitle();
		System.out.println(tit2);
		
		Thread.sleep(5000);
		WebElement ele2 = driver.findElement(By.id("add"));
		a.doubleClick(ele2).perform();

	}

}
