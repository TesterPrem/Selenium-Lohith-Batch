package practice;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver1/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/");
				
		File src = driver.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		File dest = new File("./images/1.jpg");
		Thread.sleep(3000);
		FileHandler(src,dest);
		

	}
	
	}


