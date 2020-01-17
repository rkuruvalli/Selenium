package justrecharge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signinpage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		// Launch the chrome browser);
				System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.justrechargeit.com/SignIn.aspx");
				//driver.findElement(By.id("jriTop_signin9")).click();
				driver.findElement(By.id("txtUserName")).sendKeys("rkuruvalli@gmail.com");
				driver.findElement(By.id("txtPasswd")).sendKeys("123456");
				Thread.sleep(10000);
				driver.findElement(By.id("imgbtnSignin")).click();
			
	}

}
