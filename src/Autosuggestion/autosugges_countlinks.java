package Autosuggestion;

import java.awt.List;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugges_countlinks 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("selenium");
        Thread.sleep(10000);
        java.util.List<WebElement> lin = driver.findElements(By.xpath("//li[@class='sbct']"));
        int l1 = lin.size();
        System.out.println(l1);
       
        
        for(WebElement alllin:lin) {
        	System.out.println(alllin.getText());
        }
        driver.close();
        
	}

}
