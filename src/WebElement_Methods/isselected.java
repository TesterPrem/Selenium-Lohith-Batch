package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.skillrary.com/user/login");
		WebElement chkbox = driver.findElement(By.name("remember"));
		if(chkbox.isSelected()) {
			System.out.println("the checkbox is selected");
		}
		else {
			System.out.println("the check box is not selected");
		}
		driver.close();
	}

}
