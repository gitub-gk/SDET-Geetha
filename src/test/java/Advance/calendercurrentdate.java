package Advance;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendercurrentdate
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 WebDriverWait wait =new WebDriverWait(driver, 10);
		 
		 Actions a=new Actions(driver);
		 a.moveByOffset(10, 10).click().perform();
		 
		 
		 driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys("BOM");
		 driver.findElement(By.xpath("//div[contains(text(),'BOM')]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@for='toCity']")).sendKeys("PNQ");
		 driver.findElement(By.xpath("//div[contains(text(),'PNQ')]")).click();
		 Thread.sleep(1000);
		
		 
		 WebElement departure=driver.findElement(By.xpath("//label[@for='departure']"));
		 wait.until(ExpectedConditions.elementToBeClickable(departure)).click();
		 
		 //selecting date (I )
		 driver.findElement(By.xpath("//p[contains (text(),'17')]")).click();
		 
		 
		 WebElement departure1=driver.findElement(By.xpath("//label[@for='departure']"));
		 wait.until(ExpectedConditions.elementToBeClickable(departure1)).click();
		 
		 //selecting date(II )
		 driver.findElement(By.xpath("//div[@aria-label='Fri Apr 16 2021']")).click();
		 Thread.sleep(3000);
		
		 driver.close();
		 
	}

}
