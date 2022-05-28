package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		Thread.sleep(5000);
		if (ele.isEnabled())
		{
		System.out.println("The Button is enebled");		
			}
		else
		{
			System.out.println("The button is not enbled");
		}
		driver.close();
	}

}
