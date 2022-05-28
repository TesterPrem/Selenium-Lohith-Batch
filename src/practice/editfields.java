package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class editfields {
	static {
		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement ema = driver.findElement(By.id("email"));
		ema.sendKeys("onnpremkd@gmail.com");
		Thread.sleep(3000);
		ema.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.name("username"));
	    String txt1 = ele.getText();
	    System.out.println(txt1);
	    
	    Thread.sleep(3000);
	    WebElement clr = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
	    clr.clear();
	    Thread.sleep(3000);
	    
	    WebElement ele1 = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	    if(ele1.isEnabled()) {
	    	System.out.println("it is enabled");
	    }
	    else {
	    	System.out.println("disabled");
	    }
	    
	    
	    
	    

	}

}
