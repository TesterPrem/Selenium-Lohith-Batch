package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Handling_disabled {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/edit");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		RemoteWebDriver r = (RemoteWebDriver)driver;
		r.executeScript("document.getElementById('noEdit').value='Kalaivani'");

	}

}
