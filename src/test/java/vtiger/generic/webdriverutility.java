package vtiger.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webdriverutility 
{
		
	//1. Maximize the browser window
	public void maximizewindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	
	 //2.Implicit wait-until page is loaded
	public void implicitwait(WebDriver driver)
	{
	
		driver.manage().timeouts().implicitlyWait(iconstants.implicitwaittime,TimeUnit.SECONDS);
	}
	

	
	//3.Explicit wait - given element is clickable
	public void explicitwait(WebDriver driver, WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, iconstants.explicitwaittime);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}
	
	
	 //4.dropdown - Visible text and visible number and value
	public void dropdown(WebElement element , String text, int num)
	{
		        Select s = new Select(element);
				s.selectByVisibleText(text);
				s.selectByIndex(num);
				s.selectByValue(text);
	}
	
	//5.MouseHover
	public void mousehover(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
				a.moveToElement(element);
	}
	
	//6.Frame
	public void frame(WebDriver driver, int num)
	{
		driver.switchTo().frame(num);
		
	}
	
	//7.(i)Alertpopup
	public void alertpopupaccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
		
	}
	
	//(ii)Alertpopup
		public void alertpopupdismiss(WebDriver driver)
		{

			driver.switchTo().alert().dismiss();
		}
		
	
	//8.Rightclick
	public void rightclick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
				a.contextClick(ele).perform();
	}
	
	//9.Scrollbar
	public void acrollbar(WebDriver driver, int X, int Y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollby("+X+", "+Y+")");
		
	}
	 
}
