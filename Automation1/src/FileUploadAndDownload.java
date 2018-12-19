import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadAndDownload
{ 
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://convertonlinefree.com/ImageToPDFEN.aspx");
		//file upload
		driver.findElement(By.name("ctl00$MainContent$fu")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures");
		
		
	}
	


}
