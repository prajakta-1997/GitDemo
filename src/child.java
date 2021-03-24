import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child 
{
	public int welcome()
	{
		System.out.println("in child ");
		return 10;
	}
	public void childm()
	
	{

	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	driver.getWindowHandles();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	//driver.get("https://google.com");
	//System.out.println(driver.getTitle());
	//System.out.println(driver.getCurrentUrl());
	//driver.navigate().back();
	driver.findElement(By.id("username")).sendKeys("praj");;

	driver.findElement(By.name("pw")).sendKeys("praj123");;
	
	//driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//input[@value='Log In']")).click();
	//*[@id="Login"]
	//driver.close();
	//*[@id="error"]
	System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	//driver.close();
	
	}
	
}
