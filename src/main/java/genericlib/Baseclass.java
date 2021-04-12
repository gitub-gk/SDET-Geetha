package genericlib;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class Baseclass implements Autoconstant
{
	public WebDriver driver;
	propertyfiledata p=new propertyfiledata();
	photo p1=new photo();
	
	public void openapp() throws FileNotFoundException, IOException
{
	System.setProperty(key, value);
	driver =new ChromeDriver();
	driver.get(p.getdata("url"));
}

@AfterMethod
public void closeapp(ITestResult r) throws IOException
{
	int status = r.getStatus();
	String name = r.getName();
	if(status==2)
	{
		p1.getphoto(driver, name);
	}
	driver.quit();
}
}
