package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSepcificationMethods;

public class LoginPage extends ProjectSepcificationMethods{

	@FindBy(id="Email")
	WebElement mailId;
	
	@FindBy(id="Password")
	WebElement passWord;
	
	@FindBy(xpath = "//input[contains(@class,'login-button')]")
	WebElement login;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage mail(String emailId) {
		
		sendKeysMethod(mailId, emailId);
		return this;
	}
	
	public LoginPage password(String pass) {
		
		sendKeysMethod(passWord,pass);
		return this;
	}
	
	public HomePage loginButton() {
		
		login.click();
		return new HomePage(driver);
	}
}
