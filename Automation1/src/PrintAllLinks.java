import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class PrintAllLinks
{
	 public static void main(String[] args)
	 {
		 //System.setProperty("webdriver.gecko.driver","./drivers/gecko.driver.exe");
			//WebDriver driver=new FirefoxDriver();
			
			 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 Date date=new Date();
			 driver.manage().window().maximize();
			driver.get("http://www.spicejet.com");
		WebElement from=driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT"));
			Actions act=new Actions(driver);
			act.moveToElement(from).perform();
			
			List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
			for(WebElement link:allLinks)
			{
			System.out.println(link.getText());
			
	 }
			System.out.println(date);
			
			
	 }
	 
	 

}
