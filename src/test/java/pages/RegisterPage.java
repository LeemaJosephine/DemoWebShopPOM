package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.ProjectSepcificationMethods;

public class RegisterPage extends ProjectSepcificationMethods{
	
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public RegisterPage gender() {
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		return this;
	}
	
	public RegisterPage firstName() {
		
		driver.findElement(By.id("FirstName")).sendKeys("Leema");
		return this;
	}
	
	public RegisterPage lastName() {
		
		driver.findElement(By.id("LastName")).sendKeys("Josephine");
		return this;
	}
	
	public RegisterPage emailId() {
		
		driver.findElement(By.id("Email")).sendKeys("leema0318@gmail.com");
		return this;
	}
	
	public RegisterPage pass() {
		
		driver.findElement(By.id("Password")).sendKeys("leema.123");
		return this;
	}
	
	
	public RegisterPage conPass() {
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("leema.123");
		return this;
	}
	
	public RegisterResult registerButton() {
		
		driver.findElement(By.id("register-button")).click();
		return new RegisterResult(driver);
	}
	
	
	
	
}
