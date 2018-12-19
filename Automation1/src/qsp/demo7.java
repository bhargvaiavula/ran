package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo7 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\eclipse-workspace\\Automation1\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		/*driver.get("C:/Users/admin/Desktop/page.html");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("alert(Bhargavi)");
		*/
		
	//	j.executeScript("s='Bhargavi',alert(s)");
	//	j.executeScript("s=arguements[0];alert(s)","Bhargavi");
	//	j.executeScript("s=arguements[1];alert(s)","Bhargavi","ab");
	//    j.executeScript("s1=arguments[0]";"s2=arguments[1]";s3=s1+s2;alert(s3)","Bhargavi","ab");
	    		
	  //  j.executeScript("document.getElementById('t1'),value='Bhargavi'");
	// j.executeScript(e=document.getElementById('t1'),e.value='Bhargavi'");   
	//WebElement element=driver.findElement(By.id("t1"));
	//j.executeScript("e=arguements[0;e.value=arguments[1];element,]
	
		driver.get("http://localhost/login.do");
		Thread.sleep(1000);
		
		JavascriptExecutor j=(JavascriptExecutor) driver;
		
		WebElement un=driver.findElement(By.id("username"));
		j.executeScript("arguments[0].value=arguments[1]",un,"admin");
		
		WebElement pwd=driver.findElement(By.name("pwd"));
		j.executeScript("argument[0].value=arguments[1]",pwd,"manager");
		
		WebElement login=driver.findElement(By.xpath("//div[.='Login ']"));
		j.executeAsyncScript("arguments[0].click()",login);
	
	
	
	}
	

}
