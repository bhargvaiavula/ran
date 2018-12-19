package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testBase.java.TestBase;


public class BranchesPage extends TestBase
{
	
public static Select Country(WebDriver driver)
{
 
  return new Select(driver.findElement(By.name(or("Country"))));	
}

public static Select State(WebDriver driver)
{
  return new Select(driver.findElement(By.id(or("State"))));	
}

public static Select City(WebDriver driver)
{
  return new Select(driver.findElement(By.id(or("City"))));	
}

public static WebElement SearchButton(WebDriver driver)
{
  return driver.findElement(By.id(or("Search")));	
}

public static WebElement NewBranchButton(WebDriver driver)
{
  return driver.findElement(By.id(or("NewBranch")));	
}


//public static WebElement ClearButton(WebDriver driver)
//{
 // return driver.findElement(By.id("btn_clsearch"));	
//}


//public static WebElement BranchIdButton(WebDriver driver)
//{
//	return driver.findElement(By.xpath("//td[.='BranchId']"));
//}

//public static WebElement BranchNameButton(WebDriver driver)
//{
	//return driver.findElement(By.xpath("//td[.='BranchName']"));
//}

//public static WebElement AddressButton(WebDriver driver)
//{
	//return driver.findElement(By.xpath("//td[.='Address']"));
//}

//public static WebElement AreaButton(WebDriver driver)
//{
	//return driver.findElement(By.xpath("//td[.='Area']"));
//}

//public static WebElement CityButton(WebDriver driver)
//{
	//return driver.findElement(By.xpath("//td[.='City']"));
//}

//public static WebElement StateButton(WebDriver driver)
//{
	//return driver.findElement(By.xpath("//td[.='State']"));
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
