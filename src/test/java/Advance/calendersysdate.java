package Advance;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendersysdate
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
		 
		 //i)current systemdate with minutes and seconds
		 
		 Date d = new Date();
			String date = d.toString();
			System.out.println(date);
			
			//ii)current systemdate 
			
			String arr[]=date.split(" ");
			String var=arr[0];
			String mon=arr[1];
			String date1=arr[2];
			String year=arr[5];
			
			String currentsysdate=var+" "+mon+" "+date1+" "+year;
			
			System.out.println(currentsysdate);
		 
		 
		 driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys("BOM");
		 driver.findElement(By.xpath("//div[contains(text(),'BOM')]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//label[@for='toCity']")).sendKeys("PNQ");
		 driver.findElement(By.xpath("//div[contains(text(),'PNQ')]")).click();
		 Thread.sleep(1000);
		
		 
		 WebElement departure=driver.findElement(By.xpath("//label[@for='departure']"));
		 wait.until(ExpectedConditions.elementToBeClickable(departure)).click();
		 
		 driver.findElement(By.xpath("//div[@aria-label='"+currentsysdate+"']")).click();
		 
		
		 driver.close();
		 
	}

}
