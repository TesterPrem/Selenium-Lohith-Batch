package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	
	public void demo()
	{
		System.out.println("hi");
		
		Reporter.log("Hello", true);
		Reporter.log("Welcome", false);

		
	}

}
