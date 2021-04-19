package Advance;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import vtiger.generic.Excelutility;
import vtiger.generic.fileutility;
import vtiger.generic.iconstants;
import vtiger.generic.javautiity;
import vtiger.generic.webdriverutility;

public class Base 
{
	public WebDriver driver;
	webdriverutility wu= new webdriverutility();
	javautiity ju=new javautiity();
	Excelutility eu=new Excelutility();
	fileutility fu=new fileutility();

//Creating DB
	
@BeforeSuite
public void beforesuite() 
{
	System.out.println("==DB connection==");

}

@AfterSuite
public void afterSuite() 
{
	System.out.println("==Close DB connection==");
	
}

//Launch Browser and get the URL

@BeforeClass
public void launchBrowser() throws IOException 
{

	String BROWSER=fu.readdatapropfile(iconstants.profilepath, "browser");

	
	if(BROWSER.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("firefox")) {
		driver= new FirefoxDriver();
	}
	else if(BROWSER.equalsIgnoreCase("ie")) {
		driver= new InternetExplorerDriver();
	}
	wu.maximizewindow(driver);
	wu.implicitwait(driver);
	
	driver.get(fu.readdatapropfile(iconstants.profilepath, "url"));
}

@AfterClass
public void closeBrowser() {
	driver.quit();
}

@BeforeMethod
public void logintoapp() throws IOException 
{
	loginpom lp = new loginpom(driver);
	lp.logintoapp(fu.readdatapropfile(iconstants.profilepath, "username"),fu.readdatapropfile(iconstants.profilepath, "password"));

}

@AfterMethod
public void logoutfromApp() 
{
	
}

}
