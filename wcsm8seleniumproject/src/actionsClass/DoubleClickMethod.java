package actionsClass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://nagesh/login.do");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		driver.findElement(By.xpath("//A[@class='content administration']/IMG[@class='sizer']")).click();

		driver.findElement(By.xpath("//a[contains(.,'Logo &')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//label[@for=\"useDefaultReportLogoOption\"]")).click();

		WebElement target = driver.findElement(By.name("formCustomReportLogo.logo"));

		Actions act = new Actions(driver);

		act.doubleClick(target).perform();
		Thread.sleep(2000);

		driver.quit();
	}

}
