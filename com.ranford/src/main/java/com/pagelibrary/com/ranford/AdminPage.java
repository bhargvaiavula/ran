package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.java.TestBase;

public class AdminPage extends TestBase
{
public static WebElement HomeButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("Home")));
}


public static WebElement ChangePasswordButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("ChangePassword")));
}

public static WebElement LogoutButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("Logout")));
}

public static WebElement BranchesButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("Branches")));
}

public static WebElement RolesButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("Roles")));	
}

public static WebElement UsersButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("Users")));	
}


public static WebElement EmployeeButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("Employee")));	
}


}
