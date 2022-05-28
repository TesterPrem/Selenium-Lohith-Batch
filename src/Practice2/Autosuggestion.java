package Practice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("q")).sendKeys("prem");
		Thread.sleep(3000);
		List<WebElement> autsug = driver.findElements(By.xpath("//li[@class='sbct sbre']"));
		int tot = autsug.size();
		System.out.println(tot);
		
		for(int i = 0; i<tot; i++) {
			WebElement link = autsug.get(i);
			String txt = link.getText();
			System.out.println(txt);
			
			
		}

	}

}
