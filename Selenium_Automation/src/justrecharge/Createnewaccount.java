package justrecharge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createnewaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		// Launch the chrome browser);
				System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.justrechargeit.com/SignUp.aspx");
				driver.findElement(By.id("signup_name")).sendKeys("sasireddy");
				driver.findElement(By.id("signup_mobileno")).sendKeys("9494008670");
				driver.findElement(By.id("signup_email")).sendKeys("rkuruvalli@gmail.com");
				driver.findElement(By.name("signup_password")).sendKeys("123456");
				driver.findElement(By.name("checkbox1")).click();
				driver.findElement(By.name("checkbox")).click();
				driver.findElement(By.id("imgbtnSubmit")).click();
	
	}

}
