package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptionsusingforloop {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement creacc = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]"));
		creacc.click();
		
		WebElement monli = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s = new Select(monli);
		List<WebElement> allop = s.getOptions();
		int tot = allop.size();
		System.out.println(tot);
		
		System.out.println("In Order");
		for(int i = 0; i<tot; i++) {
			WebElement ord = allop.get(i);
			String txt = ord.getText();
			System.out.println(txt);
			
		}
		System.out.println("In reverse order");
		for(int j = tot-1; j>=0; j--) {
			WebElement revord = allop.get(j);
			String txt1 = revord.getText();
			System.out.println(txt1);
		}

	}

}
