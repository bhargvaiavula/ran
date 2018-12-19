	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class NavigatingThePage
	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver","./drivers/gecko.driver.exe");
			WebDriver driver=new FirefoxDriver();
			//to enter the url
			driver.get("https://www.google.co.in");
			Thread.sleep(1000);
			
		    driver.navigate().to("https://www.facebook.com/");
	        Thread.sleep(1000);		
	        
	        driver.navigate().back();
	        Thread.sleep(1000);
	        
	        driver.navigate().forward();
	        Thread.sleep(1000);
	        
	        driver.navigate().refresh();
	        Thread.sleep(1000);
	        
	        driver.close();
	}

	}


