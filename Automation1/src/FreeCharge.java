import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreeCharge
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.freecharge.in/");
    driver.findElement(By.xpath("//span[.='Login']")).click();
    
    driver.close();
    

	}

}
