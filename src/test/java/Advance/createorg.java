
		package Advance;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.Select;
        import org.testng.annotations.Test;

		public class createorg {
			
			webdriverutility wu= new webdriverutility();
			
		@Test
			public  void createorg() {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:8888/");
			
				wu.maximizewindow(driver);
				wu.implicitwait(driver);
			
				
				driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@id='submitButton']")).click();
				
				driver.findElement(By.xpath("//a[text()='Organizations']")).click();
				driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
				
				driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("abcde");
				
				WebElement industry=driver.findElement(By.xpath("//select[@name='industry']"));
				wu.selectbyvisibletextDD(industry, null);
				
				driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			}
		}
				
				
				
				