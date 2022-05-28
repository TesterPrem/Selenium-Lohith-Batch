package Practice3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mtrprintall {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/DRPK/OneDrive/Desktop/WEB%20TECHNOLOGY%2010%2030/MTR.html");
		WebElement mtrlis = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlis);
		List<WebElement> allopt = s.getOptions();
		int tot = allopt.size();
		System.out.println(tot);
		System.out.println("In Order");
		
		for(int i = 0; i < tot ; i++) {
			WebElement opts = allopt.get(i);
			String txt = opts.getText();
			System.out.println(txt);
		}
		System.out.println("In Reverse Order");
		
		for(int j = tot-1 ; j >=0 ; j--) {
			WebElement opts1 = allopt.get(j);
			String txt1 = opts1.getText();
			System.out.println(txt1);
			
		}

	}

}
