package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testBase.java.TestBase;

public class UsersPage extends TestBase
{
public static WebElement UserIdButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("UserId")));
}


public static Select BranchButton(WebDriver driver)
{
	return new Select(driver.findElement(By.id(or("Branch"))));
}


public static Select RolesButton(WebDriver driver)
{
	return new Select(driver.findElement(By.id(or("Roles"))));
}


public static WebElement SearchtButton(WebDriver driver)
{
	return driver.findElement(By.id(or("Search")));
}


public static WebElement ClearButton(WebDriver driver)
{
	return driver.findElement(By.id(or("Clear")));
}

public static WebElement UserNameButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("UserName")));
}

public static WebElement RoleNameButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("RoleName")));
}

public static WebElement BranchNameButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("BranchName")));
}

public static WebElement EditButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("Edit")));
}


public static WebElement DeleteButton(WebDriver driver)
{
	return driver.findElement(By.xpath(or("Delete")));
}




}