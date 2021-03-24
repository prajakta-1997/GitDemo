package testng1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readfromexcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("E://Prajakta_test//test1.xlsx");
		XSSFWorkbook wk = new XSSFWorkbook(file);
		XSSFSheet sheet = wk.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		int columncount = sheet.getRow(1).getLastCellNum();
		System.out.println(columncount);
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/fixed-deposit-calculator.html");
		driver.manage().window().maximize();
		/*
		for(int i = 0;i<rowcount;i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			for(int j =0;j<columncount;j++)
			{
				System.out.print(" " + currentrow.getCell(j).toString());
				
			}
			System.out.println();
		}*/
		for(int i =1;i<= rowcount;i++)
		{
			//System.out.println("Amount");
			XSSFRow currentrow = sheet.getRow(i);
			XSSFCell Amnt = currentrow.getCell(0);
			int Amount = (int)Amnt.getNumericCellValue();
			System.out.println(Amount);
			
			//System.out.println("Period");
			XSSFCell period = currentrow.getCell(1);
			int period1 = (int)period.getNumericCellValue();
			//System.out.println(period1);
			
			//System.out.println("Rate");
			XSSFCell Rate = currentrow.getCell(2);
			int Rate1 = (int)Rate.getNumericCellValue();
			//System.out.println(Rate1);
			
			//System.out.println("Amount2");
			XSSFCell Amount2 = currentrow.getCell(3);
			int Amount3 = (int)Amount2.getNumericCellValue();
			//System.out.println(Amount3);
			
			//System.out.println("Tax");
			XSSFCell tax = currentrow.getCell(4);
			int tax2 = (int)tax.getNumericCellValue();
			//System.out.println(tax2);
			
			driver.findElement(By.id("invest_today")).sendKeys(String.valueOf(Amount));
			Thread.sleep(3000);
			driver.findElement(By.id("investment_period")).sendKeys(String.valueOf(period1));
			Thread.sleep(3000);
			driver.findElement(By.id("Interest_rate")).sendKeys(String.valueOf(Rate1));
			Thread.sleep(3000);
			//driver.findElement(By.id("invest_every")).sendKeys(String.valueOf(Amount2));
			Thread.sleep(3000);
			driver.findElement(By.id("tax_rate")).sendKeys(String.valueOf(tax2));
			//driver.findElement(By.id("returnscalculator")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement flag = driver.findElement(By.xpath("//*[@id=\"returnscalculator\"]"));
			js.executeScript("arguments[0].scrollIntoView();", flag);
			
			driver.findElement((By.xpath("//*[@id=\"returnscalculator\"]/div[3]/div/div[1]/div[2]/div[3]/a[1]"))).click();
			System.out.println("Record "+i+" entered"); 
			System.out.println(driver.findElement(By.id("amt_after_investment_period")).getText());
			//driver.findElement(By.id("invest_today")).clear();
			driver.findElement(By.id("reset_btn")).click(); 
			
			
			
			
			
		}
		//driver.close();
		
		
		

	}

}
