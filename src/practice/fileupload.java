package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/DRPK/OneDrive/Desktop/WEB%20TECHNOLOGY%2010%2030/fileupload.html");
		driver.findElement(By.id("cv")).sendKeys("E:\\SELENIUM FROM 12 04 2022    LOHITH CHETHAN\\SELENIUM NOTES LOHITH SIR CLASS UPTO 29 04 2022.pdf");

	}

}
