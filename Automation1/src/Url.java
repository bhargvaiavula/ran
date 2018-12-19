
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url
{
	public static void main(String[] args)throws InterruptedException
	{
		
    //to open the browser
	 System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 //to enter url
	 driver.get("https://www.facebook.com");
     String title=driver.getTitle();
     System.out.print(title);
	 
	 //to get current url of the web page
	 String url=driver.getCurrentUrl();
	 System.out.print(url);
	 
	 //to get page source code
	 String src = driver.getPageSource();
	 System.out.print("n"+src);
	 
	 //to close the browser
	 driver.close();  
	}
} 
		
		
		
				
		
	


