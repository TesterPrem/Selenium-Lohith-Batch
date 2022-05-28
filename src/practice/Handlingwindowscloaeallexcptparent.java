package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindowscloaeallexcptparent {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String par = driver.getWindowHandle();
		driver.findElement(By.name("newbrowserwindow123")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("newbrowserwindow123")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("newbrowserwindow123")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("newbrowserwindow123")).click();
		Thread.sleep(3000);
		 Set<String> whs = driver.getWindowHandles();
		 int tot = whs.size();
		 System.out.println(tot);
		 
		 for(String all : whs) {
			 driver.switchTo().window(all);
			 			 
			 if(all.equals(par)) {
				 
			 }
			 else {
				 driver.close();
			 }
		 }
		

	}

}
