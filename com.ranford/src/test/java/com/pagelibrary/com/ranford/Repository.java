package com.pagelibrary.com.ranford;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import Utility.Library;
import Utility.Validata;
import WebTable.java.Table;
import excel.Excel_class;
import testBase.java.TestBase;

public class Repository extends TestBase{
	
	
	WebDriver driver;

	
	public  void  login()
	{
		HomePage.Username(driver).sendKeys("Admin");
		
		HomePage.Password(driver).sendKeys("Admin");
		

		HomePage.Login(driver).click();
		

	}
	public void Launch(String url,String browser)
	{
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty(config("firefoxDriver"),config("firefoxpath"));
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty(config("chromeDriver"),config("chromepath"));
		
		 driver = new ChromeDriver();
		 
		
		}
		 driver.get(config("build1"));
		 
		if(Validata.IsTextpresent(driver, " Bank dates back to "))
		{
			System.out.println("Test is passed");
		}
		else
		{
			Library.takescreenShot("launch");
			System.out.println("Test is Failed");
			
		}
	}
	public void AdminPage() 
	{
		
		AdminPage.BranchesButton(driver).click();
	}
	
	
   // public void clickonBranchesButton()
    //{
   
  //  }
	public void BranchesSearch()
	{
	     
		BranchesPage.Country(driver).selectByVisibleText("INDIA");
		
	    BranchesPage.State(driver).selectByVisibleText("Karnataka");
		
	    BranchesPage.City(driver).selectByVisibleText("Bangalore");
	    
        BranchesPage.SearchButton(driver).click(); 
        
     
	 }
	
	public void NewBranchDetailsPage(String BranchName,String Address,String Zipcode,String Country,String State,String City)
	{
//		AdminPage.BranchesButton(driver).click();
		   BranchesPage.NewBranchButton(driver).click();
		NewBranchDetailsPage.BranchNameButton(driver).sendKeys(BranchName);
		
		NewBranchDetailsPage.Address1Button(driver).sendKeys(Address);
		
		/*BranchEntryDetailsPage.Address1Button(driver).sendKeys();
		
		BranchEntryDetailsPage.AreaButton(driver).sendKeys("Jntu");
		*/
		NewBranchDetailsPage.ZipCodeButton(driver).sendKeys(Zipcode);
		
		NewBranchDetailsPage.CountryButton(driver).selectByVisibleText(Country);
		
		NewBranchDetailsPage.StateButton(driver).selectByVisibleText(State);
		
		NewBranchDetailsPage.CityButton(driver).selectByVisibleText(City);
		
		NewBranchDetailsPage.SubmitButton(driver).click();
		
		
		/*
		if(Validata.IsAlertPresent(driver,"Expected Alert"))
		{
			Reporter.log("Alert is present");
			
		}
		else {
			Library.takescreenShot("NewbranchDetailspage");
			
			Reporter.log("Alert is failed");
		}
	*/
		

	
	}
	public void RolesPage_btn()
	{
		AdminPage.RolesButton(driver).click();
		
		
	}
	public void NewRoleInsertionPage(String RoleName,String RoleType)
	{
		RolesPage.NewRoleButton(driver).click();
		
		NewRoleInsertionPage.RoleNameButton(driver).sendKeys(RoleName);
		
		//NewRoleInsertionPage.RoleDescButton(driver).sendKeys("");
		
		NewRoleInsertionPage.RoleTypeButton(driver).selectByValue(RoleType);
		
		NewRoleInsertionPage.SubmitButton1(driver).click();
		
		
//		if(Validata.IsAlertPresent(driver, "expected alert"))
//		{
//			Reporter.log(" creation is passed");
//			
//		}
//		else {
//			Library.takescreenShot("NewRoleInsertionpage");
//			
//				Reporter.log("branch creation is failed");
//		}
//	driver.switchTo().alert().accept();
}
	
	
	public void UserPage()
	{
     UsersPage.UserIdButton(driver).sendKeys("10");
     
     UsersPage.UserNameButton(driver).sendKeys("sushasini");
     
     UsersPage.BranchNameButton(driver).sendKeys("mindqsisno2");
     
     UsersPage.RoleNameButton(driver).sendKeys("icustomer");
     
     UsersPage.RolesButton(driver).selectByVisibleText("icustomer");
     
     UsersPage.BranchButton(driver).selectByVisibleText("ABC Branch");
     
    // UsersDetailsPage.EditButton(driver).click();
     
     UsersPage.DeleteButton(driver).click();
     
     UsersPage.SearchtButton(driver).click();
     
     UsersPage.ClearButton(driver).click();	
	}
	
	
	public void NewUserCreationPage()
	{
		NewUserCreationPage.RoleButton(driver).selectByVisibleText("Analyst");
		
		NewUserCreationPage.BranchButton(driver).selectByVisibleText("Ameerpet");
		
		NewUserCreationPage.CustomerIdButton(driver).selectByVisibleText("select");
		
	    NewUserCreationPage.CustomerNameButton(driver).sendKeys("Bunny");
	    
	    NewUserCreationPage.UserNameButton(driver).sendKeys("sai");
	    
	    NewUserCreationPage.LoginPasswordButton(driver).sendKeys("Hemansh2");
	    
        NewUserCreationPage.TransactionPasswordButton(driver).sendKeys("1234");
        
        NewUserCreationPage.SubmitButton(driver).click();
		
	}
	
	

	public void EmployeePage_btn()
	{
		AdminPage.EmployeeButton(driver).click();
		
	}
	
	public void NewEmployeeCreationPage(String Employername,String LoginPassword,String Role,String Branch)
	{
		EmployeePage.NewEmployeeButton(driver).click();
	
		
		NewEmployeeCreationPage.EmployerNameButton(driver).sendKeys(Employername);
		
		NewEmployeeCreationPage.LoginPasswordButton(driver).sendKeys(LoginPassword);
		
		NewEmployeeCreationPage.RoleButton(driver).selectByVisibleText(Role);
		
		NewEmployeeCreationPage.BranchButton(driver).selectByVisibleText(Branch);
		
		NewEmployeeCreationPage.SubmitButton(driver).click();
		
		
		
//		if(Validata.IsAlertPresent(driver, "expected Alert"))
//		{
//			Reporter.log("Alert exists");
//		}
//		else 
//		{
//			Reporter.log("Alert  failed");
//		}
//		
//		driver.switchTo().alert().accept();
	}	

	public void table()
	{
		AdminPage.BranchesButton(driver).click();
		Table.webTable(driver, By.id("DG_bankdetails"), "edit", "168");
	}
	
	public Object[][] excelcontent(String filename,String sheetname)
	{
		Excel_class.excelconnection(filename, sheetname);
		
		int rc=Excel_class.rcount();
		int cc=Excel_class.ccount();
		
		String[][] data=new String[rc-1][cc];
		
		for(int r=1;r<rc;r++)
		{
			for(int c=0;c<cc;c++)
			{
				data[r-1][c]=Excel_class.readdata(c, r);
			}
		}
		return data;
	}
	
}
	
	
	
		
		
	
	
	
