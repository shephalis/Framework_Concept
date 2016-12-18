package com.Framework_Concept.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateUser {

	WebDriver driver;
 
	public CreateUser(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getUsernameTextBox()
	{
		
		return driver.findElement(By.name("username"));
		}
		  
		public WebElement getPaswordTextBox()
		{
			return driver.findElement(By.name("passwordText"));
		}
		
		public WebElement getRetypePassword()
		{
			return driver.findElement(By.id("passwordTextRetype"));
		}
		
		public WebElement getFirstName()
		{
			return driver.findElement(By.name("firstName"));
		}
	   
		 public WebElement getLastName()
		 {
			 return driver.findElement(By.name("lastName"));
		 }
		 
		 public WebElement getEmail()
		 {
			 return driver.findElement(By.name("email"));
		 }
		 
		 public WebElement getWorkDuration()
		 {
			 return driver.findElement(By.name("workdayDurationStr"));
		 }
		 
		 public WebElement getCreateUserButton()
		 {
			 return driver.findElement(By.xpath("//input[@type='submit']"));
		 }
}
