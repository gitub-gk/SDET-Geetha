package Advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leads 
{

//constructor
	
	public Leads()
	{
		WebDriver driver = null;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//img[@title='Create Lead...']")
private static WebElement leadstab;

@FindBy (xpath="//a[@text()='Leads']")
private static WebElement leadslink;

//getters

public WebElement getLeadstab()
{
	return leadstab;
}

public WebElement getLeadslink()
{
	return leadslink;
}

//Businesslogic
public void leadstab()
{
	leadstab.click();
	leadslink.click();
}
}
