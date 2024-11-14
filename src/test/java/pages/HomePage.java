package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.ProjectSepcificationMethods;

public class HomePage extends ProjectSepcificationMethods{

	public HomePage(WebDriver driver) {
		
		this.driver=driver;	
		
	}
	
	public RegisterPage registerClick() {
		
		driver.findElement(By.className("ico-register")).click();
		return new RegisterPage(driver);
		
	}
	
	public LoginPage loginClick() {
		
		driver.findElement(By.className("ico-login")).click();
		return new LoginPage(driver);
	}
	
	public HomePage validateLogin(String testCase, String expected) {
		
		if(testCase.equals("ValidEmailAndValidPassword")) {
		
		WebElement mailid = driver.findElement(By.className("account"));
		
		String actualId = mailid.getText();
		
		Assert.assertEquals(actualId, expected);
		
		} else if(testCase.equals("InvalidEmailAndValidPassword")) {
			
			String actual = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful')]")).getText();	
			
			SoftAssert assertObj = new SoftAssert();
			assertObj.assertEquals(actual, expected);
			assertObj.assertAll();
		}
		return this;
	}
	
}
