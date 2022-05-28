package Practice2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstselected {
	private static final String Duration = null;

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DRPK/OneDrive/Desktop/WEB%20TECHNOLOGY%2010%2030/SLV.html");
		Thread.sleep(5000);
		WebElement slvlis = driver.findElement(By.id("slv"));
		Select s = new Select(slvlis);
		Thread.sleep(5000);
		WebElement firsel = s.getFirstSelectedOption();
		String txt = firsel.getText();
		System.out.println(txt);
		

	}

}
