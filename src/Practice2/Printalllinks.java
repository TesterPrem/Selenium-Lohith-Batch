package Practice2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printalllinks {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> mmtlinks = driver.findElements(By.tagName("a"));
		int tot = mmtlinks.size();
		System.out.println(tot);
		
		for(WebElement alllin : mmtlinks) {
			String txt = alllin.getText();
			System.out.println(txt);
		}

	}

}
