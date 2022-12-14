package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath="//a[@aria-label='Notifications']")
	private WebElement notification;
	
	@FindBy (xpath="//div[@aria-label='Account']")
	private WebElement account;
	
	@FindBy (xpath="(//span[@dir='auto'])[9]")
	private WebElement logout;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void Toclickonnotifications() {
		notification.click();
	}
 
	public void Toclickonaccount() {
		account.click();
	}
	
	public void ToclickonLogout() {
		logout.click();
	}
	
}
