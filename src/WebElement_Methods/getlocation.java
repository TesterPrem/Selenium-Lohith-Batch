package WebElement_Methods;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.skillrary.com/user/login");
		
		WebElement ele1 = driver.findElement(By.id("email"));
		Point loc1 = ele1.getLocation();
		int x1 = loc1.getX();
		int y1 = loc1.getY();
		System.out.println("The X co-ordinate is =="+x1);
		System.out.println("The Y co-ordinate is =="+y1);
		
		WebElement ele2 = driver.findElement(By.name("password"));
		Point loc2 = ele2.getLocation();
		int x2 = loc2.getX();
		int y2 = loc2.getY();
		System.out.println();
		System.out.println("The X co-ordinate is =="+x2);
		System.out.println("The Y co-ordinate is =="+y2);
		System.out.println();
		
		if(x1==x2)
		{
			System.out.println("The X axis for email and password textbox match");
		}
		else
		{
			System.out.println("The X axis for email and password textbox does not match");
		}

		driver.close();

	}

}
