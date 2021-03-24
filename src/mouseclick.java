import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		Actions a =new Actions(driver);
		driver.manage().window().maximize();
		a.moveToElement(driver.findElement(By.id("autocomplete"))).click().keyDown(Keys.SHIFT).sendKeys("india").doubleClick().build().perform();	
		
		
		
	}

}
