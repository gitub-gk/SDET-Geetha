
package Advance;

import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mi {

	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 WebDriverWait wait =new WebDriverWait(driver, 10);
		
		Date dateObj = new Date ();
		String currentSysDate = dateObj.toString();
		System.out.println(currentSysDate);
		
		String arr[] = currentSysDate.split(" ");
		String var = arr[0];
		String date = arr[2];
		String month = arr[1];
		String year = arr[5];
		
		System.out.println(var+" "+date+" "+month+" "+year);
		
	
		
		Actions action = new Actions(driver);
		action.moveByOffset(15, 15).click().perform();;
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("BOM");
	    driver.findElement(By.xpath("//div[contains(text(),'BOM')]")).click();
	    Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("PNQ");
		driver.findElement(By.xpath("//div[contains(text(),'PNQ')]")).click();
		Thread.sleep(3000);
		
		WebElement departure =driver.findElement(By.xpath("//label[@for='departure']"));
	
		wait.until(ExpectedConditions.elementToBeClickable(departure)).click();
		
		String currdate=var+" "+month+" "+date+" "+year;

		driver.findElement(By.xpath("//div[@aria-label='"+currdate+"']")).click();
		
		driver.quit();
		
	}

	}

