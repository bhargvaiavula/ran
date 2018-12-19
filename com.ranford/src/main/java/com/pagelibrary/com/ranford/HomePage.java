package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.java.TestBase;

public class HomePage extends TestBase
{

	public static WebElement  Username(WebDriver driver)
	{
		return driver.findElement(By.id(or("Username")));
	}
	public static WebElement  Password(WebDriver driver)
	{
		return driver.findElement(By.id(or("Password")));
	}
	public static WebElement  Login(WebDriver driver)
	{
		return driver.findElement(By.id(or("Login")));
	}
	
}
