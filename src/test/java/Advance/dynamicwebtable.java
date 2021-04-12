
		package Advance;

		import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class dynamicwebtable {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://localhost:8888/");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
				driver.findElement(By.xpath("//input[@id='submitButton']")).click();
				driver.findElement(By.xpath("//a[text()='Organizations']")).click();
				List<WebElement> l1 = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]/a"));
				for(int i=0; i<l1.size();i++)
				{
					System.out.println(l1.get(i).getText());
				}
		
				List<WebElement> l2 = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]/input[@name='selected_id']"));
				for (int i=0; i<l2.size();i++)
				{
					l2.get(i).click();
				}
				
			}
		}