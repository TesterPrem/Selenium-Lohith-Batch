package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertsdismiss {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		
		Alert aler = driver.switchTo().alert();
		Thread.sleep(3000);
		aler.dismiss();
		
		WebElement ele = driver.findElement(By.xpath("//p[@id='demo']"));
		String txt = ele.getText();
		System.out.println(txt);

	}

}
