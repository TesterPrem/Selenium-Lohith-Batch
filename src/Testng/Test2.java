package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void call() {
		Reporter.log("Whatsapp call", true);
	}
	
	@Test
	public void msg() {
		Reporter.log("Whatsapp msg", true);
	}
	
	@Test
	public void pay() {
		Reporter.log("Whatsapp payment", true);
	}

}
