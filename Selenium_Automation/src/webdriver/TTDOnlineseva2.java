package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TTDOnlineseva2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      WebDriver driver;
      System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

      driver.manage().window().maximize();
      driver.get("https://ttdsevaonline.com/#/registration");
      Thread.sleep(5000);
      driver.findElement(By.name("fName")).sendKeys("rupa");
      driver.findElement(By.name("fName")).sendKeys("rupa");
      driver.findElement(By.name("lName")).sendKeys("rupa");
      driver.findElement(By.name("mobNo")).sendKeys("123445678");
      
      
	}

}
