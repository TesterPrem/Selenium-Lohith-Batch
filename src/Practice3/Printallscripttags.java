package Practice3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printallscripttags {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		List<WebElement> allscr = driver.findElements(By.tagName("a"));
		int tot = allscr.size();
		System.out.println(tot);
		
		for(int i = 0; i < tot ; i++) {
			WebElement lks = allscr.get(i);
			String txt = lks.getText();
			System.out.println(txt);
		}

	}

}
