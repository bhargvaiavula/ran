package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validata {
	
	
	public static  boolean  IsTextpresent(WebDriver driver,String exp)
	{
		boolean b=driver.findElement(By.tagName("tbody")).getText().contains(exp);
		return b;
		
	}
	
	public static boolean IsTitlePresent(WebDriver driver,String exp)
	{
		boolean b=driver.findElement(By.tagName("tboby")).getText().contains(exp);
		return b;
	}
	
	public static boolean IsAlertPresent(WebDriver driver,String exp)
	{
		boolean b=driver.switchTo().alert().getText().contains(exp);
		return b;
	}

}
