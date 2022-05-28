package WebElement_Methods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/");
		WebElement ele = driver.findElement(By.xpath("(//a[@title='Courses'])[1]"));
		String txt1 = ele.getText();
		System.out.println("The Text is =="+txt1);
		String txt2 = "Explore Workspace";
		if(txt1.equals(txt2))
		{
		System.out.println("The Displayed text is correct");	
		}
		else
		{
			System.out.println("The Displayed text is not correct");
		}
		driver.close();
		
	}

}
