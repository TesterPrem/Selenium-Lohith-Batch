package Practice3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Slvallselected {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/DRPK/OneDrive/Desktop/WEB%20TECHNOLOGY%2010%2030/SLV.html");
		WebElement slvlis = driver.findElement(By.id("slv"));
		Select s = new Select(slvlis);
		List<WebElement> allsel = s.getAllSelectedOptions();
		int tot = allsel.size();
		System.out.println(tot);
		
		for(WebElement all : allsel) {
			String txt = all.getText();
			System.out.println(txt);
		}

	}

}
