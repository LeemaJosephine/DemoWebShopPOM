package test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class AttributesSample {

	@Test(priority = 1, dependsOnMethods ="signinTest", alwaysRun = true)
	public void loginTest() {
		
		System.out.println("Login test");
	}
	
	
	@Test(priority = 0, invocationCount = 3, threadPoolSize = 2, invocationTimeOut = 10)
	public void signinTest() {
		
		System.out.println("Signin Test");
	}
	
	@Test(enabled = false)
	public void searchTest() {
		
		System.out.println("Search test");
	}
	
	@Ignore
	@Test
	public void checkoutTest() {
		
		System.out.println("Checkout Test");
	}
	
}
