package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSepcificationMethods;
import pages.HomePage;

public class TC_001_RegisterTest extends ProjectSepcificationMethods{

	@BeforeTest
	public void setup() throws IOException {
		
		readFromPropFile("LoginTestData");
		testName="RegisterTest";
		testDescription="Testing the register functionality with data hard code";
		testAuthor="Leema Josephine";
		testCategory="Regression Testing";
	}
	
	@Test
	public void registerTest() {
		// TODO Auto-generated method stub

		HomePage obj = new HomePage(driver);
		obj.registerClick()
		.gender()
		.firstName()
		.lastName()
		.emailId()
		.pass()
		.conPass()
		.registerButton()
		.validateRegister();
		
	}

}
