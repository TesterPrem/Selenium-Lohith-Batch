package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertswithtext {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(3000);
		
         Alert aler = driver.switchTo().alert();
         String txt = aler.getText();
         System.out.println(txt);
         Thread.sleep(3000);
         aler.sendKeys("Prem");
         Thread.sleep(3000);
         aler.accept();
         
         WebElement ele = driver.findElement(By.xpath("//p[@id='demo1']"));
          String txt1 = ele.getText();
          System.out.println(txt1);
         

	}

}
