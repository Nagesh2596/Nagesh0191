package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PartialLinkText {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/nages/Desktop/HTMLwebElement/flipkart.html");
		
		driver.findElement(By.partialLinkText("flipkartLink")).click();
	}

}
