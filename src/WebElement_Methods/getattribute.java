package WebElement_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/");
		WebElement ele = driver.findElement(By.xpath("(//a[@routerlink='/test'])[1]"));
		String att = ele.getAttribute("class");
		String att1 = ele.getAttribute("id");
		
		System.out.println(att);
		System.out.println(att1);

	}

}
