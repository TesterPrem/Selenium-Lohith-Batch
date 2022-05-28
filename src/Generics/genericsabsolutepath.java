package Generics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class genericsabsolutepath {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DRPK/OneDrive/Desktop/WEB%20TECHNOLOGY%2010%2030/fileupload.html");
		File f= new File("./data/INTERVIEW QUESTION.jpg");
		String abpath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(abpath);
		
	}

}
