package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		
		
		//click on continue to login button
		driver.findElement(By.className("login_button")).click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//click on login button without enter any details
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(5000);
		//handle alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		//using linktext locator we will write the script for hyperlink
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		Thread.sleep(5000);
		//confirmation alert: click on cancle button		
		driver.switchTo().alert().dismiss();
		

	}

}
