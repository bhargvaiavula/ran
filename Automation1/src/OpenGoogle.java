import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle 
{
public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://www.google.co.in");
	}
}