package com.pagelibrary.com.ranford;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excel.Excel_class;

public class TestExecution extends Repository 
{   
	@Parameters({"nodeUrl","browser"})
	@BeforeTest
	public void verify_launch(String url,String browser)
	 {
		 Launch(url,browser);
	 }
	
	@Test(priority=1)
	public  void verifylogin()
	{
		login();
	}
	
	
	
	
     @Test(priority=2)
	
	public void Verify_Admin()
	{
		AdminPage();
		}
	
	/*@Test(priority=4,dataProvider="Branchdata")
	public void Verify_NewBranchDetailsPage(String BranchName,String Address,String Zipcode,String Country,String State,String City)
	{
		NewBranchDetailsPage(BranchName,Address,Zipcode,Country,State,City);
	}*/
	
     @Test(priority=3,enabled=false)
   public void Verify_BranchesSearch()
	{
		BranchesSearch();
	}
	
     
	
	
	
	@Test(priority=5)
	public void verify_RolesPage()
	{
		RolesPage_btn();
	}
	
//	@Test(priority=6,dataProvider="Roledata")
// 	public void Verify_NewRoleInsertionPage(String RoleName,String RoleType)
// 	{
// 		NewRoleInsertionPage(RoleName,RoleType);
// 	}
	
	
//	@Test(enabled=false)
//	public void Verify_UsersPage()
//	{
//		UsersPage();
//	}
//	
//	@Test(enabled=false)
//	public void Verify_NewUserCreationPage()
//	{
//		NewUserCreationPage();
//	}
	
	@Test(priority=7)
	public void Verify_EmployeePage()
	{
		EmployeePage_btn();
	}
	
//	@Test(priority=8,dataProvider="Employeedata")
//	public void Verify_NewEmployeeCreationPage(String Employername,String LoginPassword,String Role,String Branch)
//	{
//		NewEmployeeCreationPage(Employername,LoginPassword,Role,Branch);
//	}
	/*@Test(priority=9)
public void verify_table()                    
{
	table();
}*/
//	@DataProvider(name="Branchdata")
//	public Object[][] verifyexcel1()
//	{
//		return excelcontent("exceldata.xls", "Branchdata");
//	}
//	
//	@DataProvider(name="Roledata")
//	public Object[][] verifyexcel2()
//	{
//		return excelcontent("exceldata.xls", "Roledata");
//	}
//	
//	@DataProvider(name="Employeedata")
//	public Object[][] verifyexcel3()
//	{
//		return excelcontent("exceldata.xls", "Employeedata");
//	}
//	
	@Test(priority=4)
	public void excelcontent()
	{
		Excel_class.excelconnection("exceldata.xls", "Branchdata");
		Excel_class.exceloutputconnection("exceldata.xls", "output.xls", "Branchdata");
		
		for(int r=1;r<Excel_class.rcount();r++)
		{
			NewBranchDetailsPage(Excel_class.readdata(0, r), Excel_class.readdata(1, r), Excel_class.readdata(2, r),  Excel_class.readdata(3, r),  Excel_class.readdata(4, r),  Excel_class.readdata(5, r));
			String text=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			if(text.contains("created successfully"))
			{
				Excel_class.writedata(6, r, "Test passed");
			}
			else if(text.contains("already Exist"))
			{
				Excel_class.writedata(6, r, "Test Failed");
			}
			else
			{
				Excel_class.writedata(6, r, "n/a");
			}
		}
		Excel_class.saveworkbook();
	}
	
	
	@Test(priority=6)
	
	public void excelcontent1()
	{
		Excel_class.excelconnection("exceldata.xls","Roledata");
        Excel_class.exceloutputconnection("exceldata.xls", "output.xls", "Roledata");
		for(int r=1;r<Excel_class.rcount();r++)
		{
			NewRoleInsertionPage(Excel_class.readdata(0, r), Excel_class.readdata(1, r));
			
			String text=driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			
			if(text.contains("Created successfully"))
			{
				Excel_class.writedata(2, r, "Test Passed");
			}
			else if(text.contains("already exist"))
			{
				Excel_class.writedata(2, r, "Test Failed");
			}
			else
			{
				Excel_class.writedata(2, r, "n/a");
			}
		}
		Excel_class.saveworkbook();
	}
	
	
	@Test(priority=8)
	
	public void excelcontent2()
	{
		Excel_class.excelconnection("exceldata.xls","Employeedata");
        Excel_class.exceloutputconnection("exceldata.xls", "output.xls", "Employeedata");
		for(int r=1;r<Excel_class.rcount();r++)
		{
			NewEmployeeCreationPage(Excel_class.readdata(0, r), Excel_class.readdata(1, r), Excel_class.readdata(2, r), Excel_class.readdata(3, r));

			
             String text=driver.switchTo().alert().getText();
			
			driver.switchTo().alert().accept();
			
			if(text.contains("Created successfully"))
			{
				Excel_class.writedata(4, r, "Test Passed");
			}
			else if(text.contains("already exist"))
			{
				Excel_class.writedata(4, r, "Test Failed");
			}
			else
			{
				Excel_class.writedata(4, r, "n/a");
			}
		}
		Excel_class.saveworkbook();
	}

	
		
	}
	
	
	
	

