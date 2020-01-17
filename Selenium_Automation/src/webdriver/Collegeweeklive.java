package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Collegeweeklive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//
//		driver.get("http://newtours.demoaut.com/");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());

		driver.navigate().to("https://www.collegeweeklive.com/go-signup/go");// ("https://www.collegeweeklive.com/go-signup/go");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("rupa");
		driver.findElement(By.name("lastName")).sendKeys("kuruvalli");
		driver.findElement(By.id("emailAddress")).sendKeys("rkuru@gmail.com");
		driver.findElement(By.name("phoneNumber")).sendKeys("2144998533");
		driver.findElement(By.name("password")).sendKeys("rupa123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("rupa123");
		new Select(driver.findElement(By.name("nationality"))).selectByVisibleText("UNITED STATES");
		new Select(driver.findElement(By.name("attendeeType")))
				.selectByVisibleText("Current Undergraduate Student Looking to Transfer");
		new Select(driver.findElement(By.id("questions[q_134]"))).selectByVisibleText("Fall 2020");
		new Select(driver.findElement(By.id("questions_16_Month"))).selectByVisibleText("April");
		new Select(driver.findElement(By.id("questions_16_DayOfMonth"))).selectByVisibleText("4");
		new Select(driver.findElement(By.id("questions_16_DOBYear"))).selectByVisibleText("1999");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.className("multiselect")).click();
		Thread.sleep(5000);
		WebElement option1 = driver.findElement(By.name("questions[q_19][1]"));
		option1.click();
		WebElement option2 = driver.findElement(By.name("questions[q_19][2]"));
		option2.click();
		Thread.sleep(5000);
		driver.findElement(By.className("multiselect")).click();

	}

}
