package com.test.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.classes.HomePage;
import com.pom.classes.LoginPage;

public class Validatethefunctionality {
	private WebDriver driver;
	private LoginPage loginpage;
	private HomePage homepage;
	
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("launch the browser and enter url");
//		Map<String,Object> prefs = new HashMap<String,Object>();
//		     prefs.put("pofile.default_content_setting_values.notifications", 2);
//		  ChromeOptions options = new ChromeOptions();
//		      options.setExperimentalOption("prefs", prefs);
	System.setProperty("webdriver.chrome.driver","E:\\software testing\\selenium\\chromedriver.exe");
	     ChromeOptions options = new ChromeOptions();
		         options.addArguments("--disable-notifications");
		           driver = new ChromeDriver(options);
		            driver.get("https://facebook.com");
		             driver.manage().window().maximize();
		     
	}
	
	@BeforeMethod
	public void beforemethod() {
		 loginpage = new LoginPage(driver);
		 loginpage.Tosendusername("gsutar76@gmail.com");
		 loginpage.Tosendpassword("ganesh@143");
		 loginpage.ClickonLogin();
		 
	}
	
	@Test
	public void test1() {
		System.out.println("validate notification button");
		homepage = new HomePage(driver);
	     homepage.Toclickonnotifications();
	     String n=driver.getCurrentUrl();
	     if(n.equals("https://www.facebook.com/")) {
	    	 System.out.println("pass");
	     }	 
	     else {
	    	 System.out.println("fail");
	    	 
	     }
	     
	}
	@AfterMethod
	public void aftermethod() {
	
		homepage.Toclickonaccount();
		homepage.ToclickonLogout();
	}
	@AfterClass
	public void afterclass() {
		driver.close();
	}

}














