package listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxselection 
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/DRPK/OneDrive/Desktop/WEB%20TECHNOLOGY%2010%2030/MTR.html");
        WebElement lstbox = driver.findElement(By.id("mtr"));
        Select s = new Select(lstbox);
        s.selectByIndex(1);
        Thread.sleep(3000);
        s.selectByValue("po");
        Thread.sleep(3000);
        s.selectByVisibleText("kesaribath");
        Thread.sleep(3000);
        
        if(s.isMultiple()==true) {
            Thread.sleep(3000);
            s.deselectByVisibleText("kesaribath");
            Thread.sleep(3000);
            s.deselectByValue("po");
            Thread.sleep(3000);
            s.deselectByIndex(1);
            Thread.sleep(3000);
            
            driver.close();
        }
		

	}

}
