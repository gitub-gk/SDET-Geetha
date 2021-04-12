package Advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webdriverutility 
{
		
	/*
	 * Maximize the browser window
	 */
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	/*
	 * Implicit wait-wait page is loaded
	 */
	public void implicitwait(WebDriver driver)
	{
		Object Timeunits;
		driver.manage().timeouts().implicitlyWait(iconstants.implicitwaittime, Timeunits.se)
	}
	
	/*
	 * Wait until given element is clickable
	 */
	public void explicitwait(WebDriver driver, WebElement element)
	{
		
	}
	
	/*
	 * Visible text
	 */
	public void selectbyvisibletextDD(WebElement element ,String visibletext)
	{
		Select s = new Select(element);
				s.selectByVisibleText(visibletext);
	}
	 
	 */
	

}
