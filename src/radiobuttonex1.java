import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class radiobuttonex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			List <WebElement> rdbt = driver.findElements(By.xpath("//input[@class = 'radioButton']"));
			for(int i = 0;i<rdbt.size();i++)
			{
				WebElement l1 = rdbt.get(i);
				String l1v = l1.getAttribute("value");
				System.out.println("Values are "+l1v);
				if(l1v.equalsIgnoreCase("radio3"))
				{
					l1.click();
				}	
			}
			driver.findElement(By.id("autocomplete")).sendKeys("Hello good morning");
			List <WebElement> check = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
			for(int i =0;i<check.size();i++)
			{
				WebElement c1 = check.get(i);
				String stringc1 = c1.getAttribute("value");
				System.out.println("Values are "+stringc1);
				if(stringc1.equalsIgnoreCase("Option3") || stringc1.equalsIgnoreCase("Option2"))
				{
					c1.click();	
				}
			}
			/*
			WebElement drop = driver.findElement(By.id("dropdown-class-example"));
			Select s = new Select(drop);
			//List <WebElement> droplist= s.getOptions();
			s.selectByValue("option3");*/
			WebElement drop = driver.findElement(By.id("dropdown-class-example"));
			Select s = new Select(drop);
			//List <WebElement> droplist= s.getOptions();
			s.selectByIndex(2);
			//Assert.assertEquals(12,13,"not matched");
			Assert.assertEquals("Hello","Hello","not matched");
			
			//driver.findElement(By.id("openwindow")).click();
			
			
			
			
			
			
			
			
			
			
			driver.close();
			
	}

}
