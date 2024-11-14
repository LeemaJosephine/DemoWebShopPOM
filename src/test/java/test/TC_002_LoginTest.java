package test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSepcificationMethods;
import pages.HomePage;

public class TC_002_LoginTest extends ProjectSepcificationMethods{

	@BeforeTest
	public void setup() throws IOException {
		
		readFromPropFile("LoginTestData");
		sheetName ="LoginTestData";
		testName="LoginTest";
		testDescription="Testing the login functionality with positive and negative cases";
		testAuthor="Leema Josephine";
		testCategory="Smoke Testing";
	}
	
	@Test(dataProvider = "excelRead")
	public void loginTest(String email, String password, String type, String message){
		// TODO Auto-generated method stub
		
		HomePage obj = new HomePage(driver);
		obj.loginClick()
		.mail(email)
		.password(password)
		.loginButton()
		.validateLogin(type,message);
	}

}
