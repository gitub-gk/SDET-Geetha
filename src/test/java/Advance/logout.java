package Advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class logout 
{
	public logout(WebDriver driver)
	{
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement signout;
		Actions a=new Actions(driver);
		a.moveToElement(signout).perform();	
	}

}
