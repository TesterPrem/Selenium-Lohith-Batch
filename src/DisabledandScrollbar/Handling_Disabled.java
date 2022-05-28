package DisabledandScrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Handling_Disabled {
	private static final String RemoteWebDriver = null;

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/DRPK/OneDrive/Desktop/WEB%20TECHNOLOGY%2010%2030/disabled.html");
		driver.findElement(By.id("d1")).sendKeys("Kalaivani Prem");
		RemoteWebDriver r = (RemoteWebDriver)driver;
		r.executeScript("document.getElementById(\'d2\').value=\'Dheepak Roshini\'");

	}

}
