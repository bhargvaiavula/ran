


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllMediaAny 
{
public static void main(String[] args)
{
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	driver.get("http://www.allmediany.com/signup");
	WebElement un=driver.findElement(By.id("username"));
    un.sendKeys("Bhargavi");
	
	WebElement pw=driver.findElement(By.name("txt_password"));
    pw.sendKeys("sravya");
    
    WebElement cpw=driver.findElement(By.name("cpassword"));
    cpw.sendKeys("Sravya");
    
    WebElement fn=driver.findElement(By.name("fname" ));
    fn.sendKeys("Bhargavi" );
    
    WebElement ln=driver.findElement(By.name("lname"));
    ln.sendKeys("banka");
    
    WebElement email=driver.findElement(By.id("txt_email"));
    email.sendKeys("hemansh@gmail.com");
    
    Select sel1=new Select(driver.findElement(By.xpath("//id[.='dobMonth']")));
    sel1.selectByIndex(2);
    
    Select sel2=new Select(driver.findElement(By.xpath("//id[.='dobDate']")));
    sel2.selectByValue("3");
    
    Select sel3=new Select(driver.findElement(By.xpath("//id[.='dobYear']")));
    sel3.selectByValue("1");
    
    WebElement adr=driver.findElement(By.id("txtAddress"));
    adr.sendKeys("fcghdj");
    
    Select sel4=new Select(driver.findElement(By.xpath("//name[.='country']")));
    sel4.selectByVisibleText("62");
    
    Select sel5=new Select(driver.findElement(By.xpath("//name[.='state']")));
    sel5.selectByVisibleText("22");
    
    Select sel6=new Select(driver.findElement(By.xpath("//name[.='cities']")));
    sel6.selectByVisibleText(" ");
    
    WebElement zc=driver.findElement(By.id("txtZipCode"));
    zc.sendKeys("5600093");
    
    WebElement tph =driver.findElement(By.id("txtPhone"));
    tph.sendKeys("9876336545");
    
   // WebElement img =driver.findElement(By.name("imgFile"));
    
    WebElement code =driver.findElement(By.id("6_letters_code_sign"));
    code.sendKeys("ghfwt5");
    
   driver.findElement(By.id("Submit")).click();
  

 driver.close();
	
}

}
