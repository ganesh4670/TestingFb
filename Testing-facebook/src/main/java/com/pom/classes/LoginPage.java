package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath="//input[@id='email']" )
	private WebElement username;
	
	@FindBy (xpath="//input[@id='pass']" )
	private WebElement password;
	
	@FindBy (xpath="//button[@name='login']" )
	private WebElement login;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	public void Tosendusername(String data) {
		username.sendKeys(data);
	}
	
	public void Tosendpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void ClickonLogin() {
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
