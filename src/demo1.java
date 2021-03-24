import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		@Test
		public void image() throws InterruptedException
			{
			System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
			//Actions a =new Actions(driver);
			driver.get("http://demo.guru99.com/test/web-table-element.php");
			driver.manage().window().maximize();
			//a.moveToElement(driver.findElement(By.id("autocomplete"))).click().keyDown(Keys.SHIFT).sendKeys("india").doubleClick().build().perform();	
			//driver.findElement(By.className("logoclass")).click();		
			/*
			driver.findElement(By.id("name")).sendKeys("Prajakta");
			Thread.sleep(1000);
			driver.findElement(By.id("alertbtn")).click();
			Thread.sleep(1000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			driver.findElement(By.id("name")).sendKeys("Prajakta");
			Thread.sleep(1000);
			driver.findElement(By.id("confirmbtn")).click();
			driver.switchTo().alert().dismiss();
			driver.findElement(By.id("openwindow")).click();
			String w = driver.getWindowHandle();
			System.out.println(driver.switchTo().window(w).getTitle());
			Set <String> wi =driver.getWindowHandles();
			Iterator <String> wis = wi.iterator();
			while(wis.hasNext())
			{
				String child = wis.next();
				if(!w.equalsIgnoreCase(child))
				{
					System.out.println(driver.switchTo().window(child).getTitle());
				}
			}
			driver.switchTo().window(w);
			
			System.out.println(driver.findElement(By.xpath("//table[@id = \"product\"]/tbody/tr[2]/td[1]")).getText());	

			System.out.println(driver.findElement(By.xpath("//table[@id = \"product\"]/tbody/tr[2]/td[3]")).getText());
			
			System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[12]/td[3]")).getText());
			//*[@id="leftcontainer"]/table/tbody/tr[12]/td[3]
			//driver.close();
			*/
		
	}

}
