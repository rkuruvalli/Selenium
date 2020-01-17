package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Create a webdriver object
		WebDriver driver;
		//Launch the chrome browser);
		System.setProperty("webdriver.chrome.driver",".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("rupsreddy@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("gjho");
		driver.findElement(By.id("u_0_2")).click();
		
		//wait
		Thread.sleep(6000);
		
		//close browser
		driver.close();
	}
}
