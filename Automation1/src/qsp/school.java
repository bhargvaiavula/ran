package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class school 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.w3schools.com");
	
		 driver.findElement(By.xpath("//a[@classname='w3-bar-item w3-button w3-hover-white w3-padding-16 w3-rightV']")).sendKeys("json");
		 driver.findElement(By.xpath("//span[.='Visit Website']")).click();
		 
	}



}
