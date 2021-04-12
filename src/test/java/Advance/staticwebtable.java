package Advance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticwebtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		List<WebElement> l1 = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr[*]/td[*]"));
		
		for(int i = 0; i < l1.size();i++)
		{
			String S = l1.get(i).getText();
			
			System.out.println(S);
			
			if(S.equalsIgnoreCase("Ruby"))
			{
				String V = driver.findElement(By.xpath("//table[@class='data-list']/tbody/tr[i+1]/td[2]")).getText();
				System.out.println(V);
				
			}
			
		}

	}

}
