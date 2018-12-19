
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookElements
{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com");
		 
		driver.findElement(By.name("firstname"));
		
		driver.findElement(By.name("lastname"));
		driver.findElement(By.name("mobile number or emailaddress"));
		driver.findElement(By.name("birthday_day"));
		driver.findElement(By.name("birthday_month"));
		driver.findElement(By.name("birthday_year"));
		
 driver.close();
	   
	    
	     
	}


}
