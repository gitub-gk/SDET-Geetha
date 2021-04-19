package Advance;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> l1 = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr[*]/td[1]"));
		
		for(int i = 0; i < l1.size();i++)
		{
			String S = l1.get(i).getText();
			
			System.out.println(S);
			if(S.equalsIgnoreCase("Ruby"))
			{
				String Version = driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr['"+i+"']/td[2]")).getText();
				System.out.println(Version);
				
			}
			driver.close();
			
		}
	

	}

}
