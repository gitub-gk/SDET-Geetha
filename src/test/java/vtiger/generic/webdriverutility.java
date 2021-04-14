package vtiger.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class webdriverutility 
{
		
	// Maximize the browser window
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	
	 //Implicit wait-until page is loaded
	public void implicitwait(WebDriver driver)
	{
		Object Timeunits;
		driver.manage().timeouts().implicitlyWait(iconstants.implicitwaittime, Timeunits.se)
	}
	
	
	//Explicit wait - given element is clickable
	public void explicitwait(WebDriver driver, WebElement element)
	{
		
	}
	
	
	 //dropdown - Visible text and visible number and value
	public void dropdown(WebElement element , String text, int num)
	{
		        Select s = new Select(element);
				s.selectByVisibleText(text);
				s.selectByIndex(num);
				s.selectByValue(text);
	}
	
	//MouseHover
	public void mousehover(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
				a.moveToElement(element);
	}
	
	//Frame
	public void frame(WebDriver driver, int num)
	{
		driver.switchTo().frame(num);
		
	}
	
	//(i)Alertpopup
	public void alertpopupaccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
		
	}
	
	//(ii)Alertpopup
		public void alertpopupdismiss(WebDriver driver)
		{

			driver.switchTo().alert().dismiss();
		}
		
	
	//Rightclick
	public void rightclick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
				a.contextClick(ele).perform();
	}
	
	//Scrollbar
	public void acrollbar(WebDriver driver, int X, int Y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollby("+X+", "+Y+")");
		
	}
	 
}
