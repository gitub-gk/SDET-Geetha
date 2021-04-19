package vtiger.generic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Execution 
{
	@Test
	public void b()
	{
		System.out.println("test b");
	}
	
	@Test
	public void c()
	{
		System.out.println("test c");
	}
	
	@Test
	public void a()
	{
		System.out.println("test a");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Logout");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Login");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("closing the browser");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("launching browser");
	}
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("DB connection");
		
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("close DB connection");
	}
	

}
