package practice;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printonlyduplicate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DRPK/OneDrive/Desktop/WEB%20TECHNOLOGY%2010%2030/MTR.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement mtrlib = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrlib);
		List<WebElement> allopt = s.getOptions();
		HashSet<String> h = new HashSet<>();
		
		for(WebElement opt : allopt) {
			String txt = opt.getText();
			  if(h.add(txt)==false) {
				  System.out.println(txt);
			  }
		}

	}

}
