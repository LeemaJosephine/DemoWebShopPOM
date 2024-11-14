package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ProjectSepcificationMethods;

public class RegisterResult extends ProjectSepcificationMethods{

	public RegisterResult(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public RegisterResult validateRegister() {
		
		
		String expectedId="leema0318@gmail.com";
		WebElement mailid = driver.findElement(By.className("account"));
		
		visibilityOfElement(mailid);
		
		 String actualId = mailid.getText();
		
		if(expectedId.equalsIgnoreCase(actualId)) {
			
			System.out.println("Registration successful");
		} else {
			
			System.out.println("Registration failed");
		}
		
		return this;
	}
}
