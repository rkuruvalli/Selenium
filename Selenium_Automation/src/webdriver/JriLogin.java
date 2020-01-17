package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JriLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys("gkjkji@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("jgkijlk");
		driver.findElement(By.className("pad0")).click();
		
	}

	
}
