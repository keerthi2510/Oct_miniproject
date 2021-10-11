package com.Maven_Automationproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automaction_miniproject {
	
	
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Keerthi\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		
		driver.findElement(By.id("email")).sendKeys("keerthikakeerthi025@gmail.com");
		
		driver.findElement(By.id("passwd")).sendKeys("kee@123");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
		
		driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[4]")).click();
		
		//driver.findElement(By.xpath("//a[@class='quick-view']")).click();
		
		driver.findElement(By.xpath("(//a[@class='product-name'])[2]")).click();
		
		
     //driver.findElement(By.xpath("//a[@class='quick-view']")).click();
		
WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
	
for (int i = 0; i < 9; i++) {
quantity.click();
}
	
	WebElement size = driver.findElement(By.id("group_1"));
	Select s2= new Select(size);
	s2.selectByValue("1");
	
	
	WebElement color = driver.findElement(By.xpath("//a[@class='color_pick']"));
	color.click();
	
//	Thread.sleep(5000);   
	
	driver.findElement(By.xpath("//button[@name='Submit']")).click();
	
	//driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	
	Thread.sleep(5000);
	
	
	//SCREENSHHOT
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\Keerthi\\eclipse-workspace\\Selenium\\Screenshot\\projectsnap.png");
	FileUtils.copyFile(src, dest);
	
	driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
	
	driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
	
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
	driver.findElement(By.id("cgv")).click();
	
	//driver.findElement(By.xpath("//a[@title='Close']")).click();
	
//	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
//	
//	driver.findElement(By.xpath("//i[@class='icon-chevron-left']")).click();
//	
//	
//	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//	
//	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
//	
//	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	driver.findElement(By.xpath("//a[@class='cheque']")).click();
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	
//	
//	TakesScreenshot ts1=(TakesScreenshot) driver;
//	File srsc = ts1.getScreenshotAs(OutputType.FILE);
//	File desti = new File("C:\\Users\\Keerthi\\eclipse-workspace\\Selenium\\Screenshot\\projectsnap1.png");
//	FileUtils.copyFile(src, desti);
//	
//	
	
	
	
	//driver.findElement(By.xpath("//i[@class='icon-chevron-left']")).click();
	
	}
		

}
