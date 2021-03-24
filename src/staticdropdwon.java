import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class staticdropdwon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		try
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		/*
		 <select name="ctl00$mainContent$ddl_originStation1" id="ctl00_mainContent_ddl_originStation1" class="wHuges station ddlfromto formSelect CustomizableDD required" groupcontrolid="ctl00_mainContent_group_details" style="display: none;">
	<option value="">Departure City</option>
		 
		<select name="ctl00$mainContent$DropDownListCurrency" id="ctl00_mainContent_DropDownListCurrency" class="valid">
		<option value="">Select</option>
		<option value="INR">INR</option>
		<option value="AED">AED</option>
		<option value="USD">USD</option>
		*/
		//s.wait(2000);
		s.selectByValue("AED");	
		s.selectByVisibleText("INR");
		//driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		/*
		int i = 1;
		while(i<3)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		//driver.findElement(By.id("hrefIncAdt")).click();
		
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=0;i<3;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[4]/a")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@value = 'MAA']")).click();
		//s.selectByValue("MAA");
		driver.findElement(By.id("autosuggest")).sendKeys("IND");
		Thread.sleep(3000);
		*/
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
		//System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size());
		Thread.sleep(4000);
		Assert.assertNotEquals(driver.findElements(By.cssSelector("input[type = 'checkbox']")).size(), "6");
		System.out.println("in try block");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			System.out.println("in finally");
			driver.close();
		}
	}

}
