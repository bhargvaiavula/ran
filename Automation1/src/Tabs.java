import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("(//input[@input_resumeParser='Post your CV'])")).click();
        Set<String> allTabs=driver.getWindowHandles();
	for(String tab:allTabs) 
	{
		Thread.sleep(1000);
		driver.switchTo().window(tab);
	    String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
		
		
	}
}
