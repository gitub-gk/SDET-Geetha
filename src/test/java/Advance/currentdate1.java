package Advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendercurrentdate
{
	public static void main(String[]args)
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 WebDriverWait wait =new WebDriverWait(driver, 20);
		 
		 Actions a=new Actions(driver);
		 a.moveByOffset(10, 10).click().perform();
		 
		 driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("BOM");
		 driver.findElement(By.xpath("//p[contains(text(),'BOM')]")).click();
		 
		 driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("PNQ");
		 driver.findElement(By.xpath("//p[contains(text(),'PNQ')]")).click();
		
		 
		 WebElement departure=driver.findElement(By.xpath("//input[@id=\"departure\"]);
		 wait.until(ExpectedConditions.elementToBeClickable(departure)).cl
		
		 
		 
		 
		 
	}

}
