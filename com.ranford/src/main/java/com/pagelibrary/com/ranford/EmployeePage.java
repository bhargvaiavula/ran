package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.java.TestBase;

public class EmployeePage extends TestBase
{
	public static WebElement NewEmployeeButton(WebDriver driver)
	{
		return driver.findElement(By.id(or("NewEmployee")));
	}
	
	
	
	
	
//	public static WebElement EmployeeIdButton(WebDriver driver)
//	{
//		return driver.findElement(By.xpath(or("EmployeeId")));
//	}
//	
//	
//	public static WebElement EmployeeNameButton(WebDriver driver)
//	{
//		return driver.findElement(By.xpath("EmployeeName"));
//	}
//	
	//public static WebElement PasswordButton(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//td[.='Password']"));
	//}

	
	//public static WebElement RoleNameButton(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//td[.='roleName']"));
	//}
	
	//public static WebElement BranchNameButton(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//td[.='BranchName']"));
	//}

	
	//public static WebElement EditButton(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//td[.='Edit']"));
	//}
	
	//public static WebElement DelButton(WebDriver driver)
	//{
		//return driver.findElement(By.xpath("//td[.='Del']"));
	//}
	
	



	
}
