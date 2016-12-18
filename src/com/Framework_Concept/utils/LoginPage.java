package com.Framework_Concept.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
WebDriver driver;

public LoginPage(WebDriver driver)
	{
	this.driver=driver;
	}
	public WebElement getUsernameTextBox()
	{
		return driver.findElement(By.name("username"));
	}
	  
	public WebElement getPaswordTextBox()
	{
		return driver.findElement(By.name("pwd"));
	}
	
	public WebElement getLoginButton()
	{
		WebElement ele=driver.findElement(By.id("loginButton"));
		return ele;
	}
	
	public WebElement getLogoutButton()
	{
		return driver.findElement(By.id("logoutLink"));
		
	}
}
