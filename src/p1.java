import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class p1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		*/
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		System.out.println(driver.getTitle());
		//driver.navigate().back();
		WebElement w = driver.findElement(By.id("name"));
		Actions a = new Actions(driver);
		a.moveToElement(w).click().perform();
		w.sendKeys("Hi");
		Thread.sleep(5000);
		w.clear();
		//Thread.sleep(1000);
		//List <WebElement> we = driver.findElements(By.className("btn-style"));
		//System.out.println(we.size());
		//driver.quit();
		driver.close();
	}

}
