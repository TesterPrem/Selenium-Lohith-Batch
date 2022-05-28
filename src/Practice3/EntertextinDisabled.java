package Practice3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EntertextinDisabled {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/edit");
		WebElement ele = driver.findElement(By.id("noEdit"));
		if(ele.isEnabled()==true) {
			System.out.println("box enabled");
		}
		else
		{
			System.out.println("box disabled");
		}
		RemoteWebDriver r = (RemoteWebDriver)driver;
		r.executeScript("document.getElementById('noEdit').value='Kalaivani'");
		
			
		

	}

}
