package Practice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printalllinks1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int tot = ele.size();
		System.out.println(tot);
		
		for(WebElement all : ele) {
			String txt = all.getText();
			System.out.println(txt);
			
		}
		
		

	}

}
