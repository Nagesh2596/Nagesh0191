package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Airindia {
	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://www.airindia.in/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		Thread.sleep(900);
		driver.switchTo().activeElement().sendKeys("Pune, Lohegaon Airport, PNQ, India, IN",Keys.TAB);
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Delhi, Indira Gandhi International Airport, DEL, India, IN",Keys.TAB);
		

	}

}
