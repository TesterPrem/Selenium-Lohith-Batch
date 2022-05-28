package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hiddenpopups {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("1234546789");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='DOB']")).click();
		WebElement monlis = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
		Select s = new Select(monlis);
		s.selectByValue("6");
		Thread.sleep(3000);
		WebElement yrlis = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
		Select s1= new Select(yrlis);
		s1.selectByVisibleText("1985");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='28']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("alternative_number")).sendKeys("8695044808");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("renew_policy_submit"));
        String txt = ele.getText();
        System.out.println(txt);
		Thread.sleep(3000);
		driver.close();
		

	}

}
