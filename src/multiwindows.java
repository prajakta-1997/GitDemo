import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("button#openwindow")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Set <String> ids = driver.getWindowHandles();
		Iterator <String> pid = ids.iterator();
		String parentid = pid.next();
		String childid = pid.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.close();
	} 

}
