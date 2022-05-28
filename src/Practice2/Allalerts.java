package Practice2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allalerts {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1 = driver.findElement(By.id("accept"));
		ele1.click();
		Thread.sleep(3000);
		Alert aler1 = driver.switchTo().alert();
		String txt1 = aler1.getText();
		System.out.println(txt1);
		Thread.sleep(3000);
		aler1.accept();
		
		WebElement ele2 = driver.findElement(By.id("confirm"));
		ele2.click();
		Thread.sleep(3000);
		Alert aler2 = driver.switchTo().alert();
		String txt2 = aler2.getText();
		System.out.println(txt2);
		Thread.sleep(3000);
		aler2.dismiss();
		
		WebElement ele3 = driver.findElement(By.id("prompt"));
		ele3.click();
		Thread.sleep(3000);
		Alert aler3 = driver.switchTo().alert();
		aler3.sendKeys("prem");
		Thread.sleep(3000);
		String txt3 = aler3.getText();
		System.out.println(txt3);
		Thread.sleep(3000);
		aler3.accept();
		
				

	}

}
