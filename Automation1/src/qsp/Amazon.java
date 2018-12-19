package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in");
	List<WebElement> shopBy=driver.findElements(By.xpath("span[@class='nav-line-2']"));
    Actions act=new Actions(driver);
	
	int count=shopBy.size();
		System.out.println(count);
	
	
	
	}
	 

}
