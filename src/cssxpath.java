import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		//driver.getWindowHandles();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.get("https://google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.navigate().back();
		driver.findElement(By.cssSelector("[name = 'name']")).sendKeys("praj");
		driver.findElement(By.xpath("//*[@name = 'email']")).sendKeys("praj@qqw.zxc");
		driver.findElement(By.cssSelector("input#exampleInputPassword1")).sendKeys("praj123");
		//driver.findElement(By.xpath("//input[@id = 'exampleInputPassword1']")).sendKeys("prajakta");
		
		//driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		//*[@id="Login"]
		//driver.close();
		//*[@id="error"]
		//driver.close();

	}

}
