package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getallselected {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DRPK/OneDrive/Desktop/WEB%20TECHNOLOGY%2010%2030/SLV.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement slvlib = driver.findElement(By.id("slv"));
		Select s = new Select(slvlib);
		List<WebElement> allsel = s.getAllSelectedOptions();
		int tot = allsel.size();
		System.out.println(tot);
		System.out.println();
		
		for(WebElement disp : allsel) {
			
			System.out.println(disp.getText());
		}

	}

}
