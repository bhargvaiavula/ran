import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLanguageLinks 
{
 public static void main(String[] args)
 {
   System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.google.co.in");
   List<WebElement> alllinks=driver.findElements(By.linkText("//a"));
   for(WebElement link:alllinks);
  
   driver.close();
   
   }
}

