package Advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import vtiger.generic.iconstants;

public class loginpom 
{
	//constructor creation
	
	public loginpom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath = "//input[@name='user_name']")
		private WebElement user_name;
		
		@FindBy(xpath="//input[@name='user_password']")
		private WebElement password;
		
		@FindBy(xpath = "//input[@id='submitButton']")
		private WebElement submit;
		
		//getters method

		public WebElement getUser_name()
		{
			return user_name;
		}

		public WebElement getPassword() 
		{
			return password;
		}

		public WebElement getSubmit() 
		{
			return submit;
		}
		
		//Business logic
		public void logintoapp(String username, String Password1)
		{
		user_name.sendKeys("fu.readdatapropfile(iconstants.profilepath, \"username\"");
		password.sendKeys("fu.readdatapropfile(iconstants.profilepath, \"password\"");
		submit.click();
		}
		
		

}
