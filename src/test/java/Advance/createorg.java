
package Advance;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.Select;
        import org.testng.annotations.Test;

import vtiger.generic.Excelutility;
import vtiger.generic.fileutility;
import vtiger.generic.javautiity;
import vtiger.generic.webdriverutility;

		public class createorg {
			
			webdriverutility wu= new webdriverutility();
			javautiity ju=new javautiity();
			Excelutility eu=new Excelutility();
			fileutility fu=new fileutility();
			
			
	
			public void  createorg() {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:8888/");
				int randomnumber=ju.createRandomNumber();
			
				wu.maximizewindow(driver);
				wu.implicitwait(driver);
			
				
				driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@id='submitButton']")).click();
				
				driver.findElement(By.xpath("//a[text()='Organizations']")).click();
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				
				driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("zsedf");
				
				WebElement industry=driver.findElement(By.xpath("//select[@name='industry']"));
				wu.dropdown( industry ,Banking);
				
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			}
		}
				
				
				
				