package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testBase.java.TestBase;

public class NewRoleInsertionPage extends TestBase
{

	public static WebElement RoleNameButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("RoleName")));
	}
	
	public static WebElement RoleDescButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("RoleDesc")));
	}
	
	public static Select RoleTypeButton(WebDriver driver)
	{
		return new Select(driver.findElement(By.id(or("RoleType"))));
	}
	
	public static WebElement SubmitButton1(WebDriver driver)
	{
		return driver.findElement(By.id(or("Submit_rcrea")));
		
		
	}
	
	public static WebElement CancelButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("Cancel")));
	}
	
}
