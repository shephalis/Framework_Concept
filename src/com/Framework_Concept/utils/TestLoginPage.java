package com.Framework_Concept.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestLoginPage {
  @Test
  public void loginTest() throws Exception {
	  
	  System.setProperty("webdriver.firefox.marionette",
				"D:/geckodriver-v0.11.1-win64/geckodriver.exe");
			
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://isha-pc:8080/login.do");
		
		LoginPage login=new LoginPage(driver);
		login.getUsernameTextBox().sendKeys("admin");
		login.getPaswordTextBox().sendKeys("manager");
		login.getLoginButton().click(); 
		Thread.sleep(5000);
		login.getLogoutButton().click();
  }
}
