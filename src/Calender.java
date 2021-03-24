import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		try
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    System.out.println("in try block");
		    //Select s = new Select(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")));
		    //s.selectByValue("OneWay");
		    //s.selectByValue("RoundTrip");
		    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		    System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
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
