package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		       WebDriver driver =new EdgeDriver();
		       driver.manage().window().maximize();
		       
		       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//input[@placeholder='password']")).sendKeys("admin123");
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
