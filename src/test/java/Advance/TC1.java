package Advance;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import vtiger.generic.fileutility;
import vtiger.generic.iconstants;

public class TC1 
{

 fileutility fu=new fileutility();

	public void leads() throws IOException
	{
		Browser.launchBrowser(null, fu.readdatapropfile(iconstants.profilepath, "browser"), fu.readdatapropfile(iconstants.profilepath, "url"));
		
		WebDriver driver = null;
		loginpom loginpom=PageFactory.initElements(  driver, loginpom.class);
		loginpom.logintoapp("fu.readdatapropfile(iconstants.profilepath, \"username\"", "fu.readdatapropfile(iconstants.profilepath, \"password\"");
		
		Leads leads=PageFactory.initElements(driver, Leads.class);
		leads.leadstab();
		
		Browser.closeBrowser();
	}
	
}
