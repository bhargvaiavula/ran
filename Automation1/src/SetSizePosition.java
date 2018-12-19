import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SetSizePosition
{
	

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		
		//to set the size
	Dimension d=new Dimension(270,380);
	driver.manage().window().setSize(d);
	
	// set the position 
    Point p=new Point(450,540);
    driver.manage().window().setPosition(p);
    
    //to maximize
    driver.manage().window().maximize();
    }

}
