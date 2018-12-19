package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testBase.java.TestBase;

public class NewEmployeeCreationPage extends TestBase
{
	public static WebElement EmployerNameButton(WebDriver driver) 
	{
		return driver.findElement(By.id(or("EmployerName")));

	}
	
	
	public static WebElement LoginPasswordButton(WebDriver driver) 
	{
		return driver.findElement(By.id(or("LoginPassword")));

	}
	
	public static Select RoleButton(WebDriver driver) 
	{
		return new Select(driver.findElement(By.id(or("Role_crea"))));
		

	}


	public static Select BranchButton(WebDriver driver) 
	{
		return new Select(driver.findElement(By.id(or("Branch_crea"))));

	}
	
	public static WebElement SubmitButton(WebDriver driver) 
	{
		return driver.findElement(By.id(or("Submit_ecrea")));

	}
	
	//public static WebElement ResetButton(WebDriver driver) 
	//{
		//return driver.findElement(By.id(or("Reset")));

	//}
	
	
	//public static WebElement CancelButton(WebDriver driver) 
	//{
	//	return driver.findElement(By.id(or("Cancel")));

	//}
	

}
