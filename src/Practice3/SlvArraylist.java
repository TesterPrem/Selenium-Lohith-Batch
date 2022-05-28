package Practice3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SlvArraylist {
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
		List<WebElement> allopt = s.getOptions();
		int tot = allopt.size();
		System.out.println(tot);
		
		ArrayList<String> a = new ArrayList<>();
		for(int i = 0; i < tot ; i++) {
			WebElement all = allopt.get(i);
			String txt = all.getText();
			a.add(txt);
			
		}
		Collections.sort(a);
		System.out.println(a);
	}

}
