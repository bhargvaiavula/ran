package com.pagelibrary.com.ranford;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testBase.java.TestBase;

public class NewBranchDetailsPage extends TestBase
{
public static WebElement BranchNameButton(WebDriver driver) 
{
	return driver.findElement(By.id(or("BranchName")));	
}

public static WebElement Address1Button(WebDriver driver)
{
	return driver.findElement(By.id(or("Address1")));	
}
//public static WebElement Address2Button(WebDriver driver)
//{
	//return driver.findElement(By.id(or("Address2")));	
//}

//public static WebElement Address3Button(WebDriver driver)
//{
	//return driver.findElement(By.id(or("Address3")));	
//}

public static WebElement AreaButton(WebDriver driver)
{
	return driver.findElement(By.id(or("Area")));	
}

public static WebElement ZipCodeButton(WebDriver driver)
{
	return driver.findElement(By.id(or("Zipcode")));
		
}

public static Select CountryButton(WebDriver driver)
{
	return new Select(driver.findElement(By.id(or("Country_crea"))));
		
}

public static Select StateButton(WebDriver driver)
{
	return new Select(driver.findElement(By.id(or("State_crea"))));

}

public static Select CityButton(WebDriver driver)
{
	return new Select(driver.findElement(By.id(or("City_crea"))));
		
}

public static WebElement SubmitButton(WebDriver driver)
{
	return driver.findElement(By.id(or("Submit_crea")));
		
}

//public static WebElement ResetButton(WebDriver driver)
//{
	//return driver.findElement(By.id(or("Reset")));
		
//}

//public static WebElement CancelButton(WebDriver driver)
//{
	//return driver.findElement(By.id(or("Cancel")));
		
//}



}

