package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSepcificationMethods;
import pages.HomePage;

public class TC_003_InvalidLoginTest extends ProjectSepcificationMethods{

	
	@BeforeTest
	public void setup() throws IOException {
		
		readFromPropFile("LoginTestData");
		testName="InvalidLoginTest";
		testDescription="Testing the login functionality with negative cases using prop file";
		testAuthor="Leema Josephine";
		testCategory="Smoke Testing";
	}
	
	@Test
	public void invalidLogin(){
		// TODO Auto-generated method stub
		HomePage obj = new HomePage(driver);
		obj.loginClick()
		.mail(prop.getProperty("invalidEmail"))
		.password(prop.getProperty("validpassword"))
		.loginButton()
		.validateLogin(prop.getProperty("InvalidTestCaseName"),prop.getProperty("InvalidExpectedMessage"));
	}

}
