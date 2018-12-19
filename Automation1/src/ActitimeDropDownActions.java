import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActitimeDropDownActions {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.actitime.com/");
		 WebElement features=driver.findElement(By.xpath("//a[.='Features']"));
		features.click();
		
		 
		 WebElement clients=driver.findElement(By.xpath("//a[.='Clients']"));
		 clients.click();
		 
		 WebElement productivityTalks=driver.findElement(By.xpath("//a[.='Productivity Talks']"));
		 productivityTalks.click();
		 
		 WebElement timeManagement=driver.findElement(By.className("c-layout-header-fixed c-layout-header-mobile-fixed"));
		 timeManagement.click();
		 
		 Actions act=new Actions(driver);
		 act.moveToElement(features).perform();
	}

}
