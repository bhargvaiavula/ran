package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.java.TestBase;

public class RolesPage extends TestBase
{
	public static WebElement NewRoleButton(WebDriver driver) 
	{
		return driver.findElement(By.id(or("NewRole")));
		
	}
	
	//public static WebElement RoleIdButton(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//td[.='Roleid']"));
		
	//}
   
	//public static WebElement RoleNameButton(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//td[.='Rolename']"));
		
	//}
	//public static WebElement RoleDesButton(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//td[.='Roledesc']"));
	//}
	
	//public static WebElement EditButton(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//td[.='Edit']"));
	//}
	
	//public static WebElement DeleteButton(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//td[.='Delete']"));
		
	//}
}

