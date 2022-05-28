package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=2,invocationCount = 3, enabled = false)
	public void call() {
		Reporter.log("Whatsapp call", true);
	}
	
	@Test(priority=3)
	public void msg() {
		Reporter.log("Whatsapp Message", true);
	}
	
	@Test(priority=1)
	public void pay() {
		Reporter.log("Whatsapp Payment", true);
	}

}
