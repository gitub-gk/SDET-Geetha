
package Advance;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import vtiger.generic.Excelutility;
import vtiger.generic.fileutility;
import vtiger.generic.iconstants;
import vtiger.generic.javautiity;
import vtiger.generic.webdriverutility;


//Launch Browser
 
public class Browser
{
	public static WebDriver driver;
	static webdriverutility wu= new webdriverutility();
	javautiity ju=new javautiity();
	Excelutility eu=new Excelutility();
	static fileutility fu=new fileutility();
	
	 public static  WebDriver launchBrowser(WebDriver driver, String Browser, String url) throws IOException 
	 {

	 	//String BROWSER=fu.readdatapropfile(iconstants.profilepath, "browser");

	 	
	 	if(Browser.equalsIgnoreCase("chrome")) {
	 		driver= new ChromeDriver();
	 	}
	 	else if(Browser.equalsIgnoreCase("firefox")) {
	 		driver= new FirefoxDriver();
	 	}
	 	else if(Browser.equalsIgnoreCase("ie")) {
	 		driver= new InternetExplorerDriver();
	 	}
	 	wu.maximizewindow(driver);
	 	wu.implicitwait(driver);
	 	
	 	driver.get(url);
	 	return driver;
	 }
	 
	 //Close Browser
	 public static void closeBrowser() 
	 {
			driver.quit();
	 }
	 
	 //Login
	 public void logintoapp() throws IOException 
	 {
	 	loginpom lp = new loginpom(driver);
	 	lp.logintoapp(fu.readdatapropfile(iconstants.profilepath, "username"),fu.readdatapropfile(iconstants.profilepath, "password"));

	 }


}
