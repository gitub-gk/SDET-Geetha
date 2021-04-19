
		package Advance;

		import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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
				
				//validation to check items are in alphabetical order
				//Before sorting
				ArrayList<String> a1=new ArrayList<String>();
				
				List<WebElement> l1 = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]"));
				for(int i=0; i<l1.size();i++)
				{
					a1.add(l1.get(i).getText());
				}
				Collections.sort(a1);
				
				//elements in app after sorting
				
				ArrayList<String> a2=new ArrayList<String>();
				
				driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		
				List<WebElement> l2 = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]/input[@name='selected_id']"));
				for (int i=0; i<l2.size();i++)
				{
					a2.add(l1.get(i).getText());
				}
				System.out.println(a1);
				System.out.println(a2);
				Assert.assertEquals(a1, a2);
				
			}

			private static boolean assertequals(ArrayList<String> a1, ArrayList<String> a2) {
				// TODO Auto-generated method stub
				return false;
			}
		}