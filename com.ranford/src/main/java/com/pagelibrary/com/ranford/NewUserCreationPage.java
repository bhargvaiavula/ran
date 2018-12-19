package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testBase.java.TestBase;

public class NewUserCreationPage extends TestBase
{
	public static Select RoleButton(WebDriver driver)
	{
		return new Select(driver.findElement(By.id(or("Roles_crea"))));
	}
	
	public static Select BranchButton(WebDriver driver)
	{
		return new Select(driver.findElement(By.id(or("Branch"))));
	}
	
	public static Select CustomerIdButton(WebDriver driver)
	{
		return new Select(driver.findElement(By.id(or("CustomerId"))));
	}
	
	public static WebElement CustomerNameButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("CustomerName")));
	}

	
	public static WebElement UserNameButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("UserName")));
		
	}
	
	public static WebElement LoginPasswordButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("LoginPassword")));
		
	}
	
public static WebElement TransactionPasswordButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("TransactionPassword")));
		
	}

	public static WebElement SubmitButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("Submit")));
		
	}
	
	public static WebElement ResetButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("Reset")));
		
	}
	
	public static WebElement CancelButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("Cancel")));
		
	}
	
}
