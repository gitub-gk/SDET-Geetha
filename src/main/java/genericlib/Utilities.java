package genericlib;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utilities
{
	//dropdown
	public void dropdown(WebElement ele, int num, String text)
	{
		Select s = new Select(ele);
		s.selectByIndex(num);
		s.selectByValue(text);
	}
	
	//MouseHover
	public void MouseHover(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();	
	}
	
	//Frame
	public void frame(WebDriver driver, int num)
	{
		driver.switchTo().frame(num);
	}
	
	//alertpopup
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	
	}
	
	//Scrollbar
	public void Scrollbar(WebDriver driver, int X,int Y)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+X+","+Y+")");	
	}
	
	//RightClick
	public void rightclick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

}
