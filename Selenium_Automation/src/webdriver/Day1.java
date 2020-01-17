package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
WebDriver driver;
	
	
	public void invokebrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",  ".\\BrowserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://www.edureka.co");

			driver.findElement(By.className("new-search-inp")).sendKeys("java");
			
			
			
			//searchcourse();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
//	public void searchcourse()  {
//		
//			driver.findElement(By.id("search-inp-overlay-new")).sendKeys("java");
//			
//			
//		
//		}
//		
		
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Day1 Myobj = new Day1();
	        Myobj.invokebrowser();
	        
	}

}
