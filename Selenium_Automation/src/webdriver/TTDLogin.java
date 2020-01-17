package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TTDLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		driver.manage().window().maximize();
		driver.findElement(By.name("fName")).sendKeys("rupa");
		driver.findElement(By.name("lName")).sendKeys("rupa");
		driver.findElement(By.name("mobNo")).sendKeys("123445678");
		driver.findElement(By.id("regdob")).click();
		Thread.sleep(3000);
		new Select(driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/div/div/select[1]")))
				.selectByVisibleText("March");
		new Select(driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/div/div/select[2]")))
				.selectByVisibleText("1983");
		driver.findElement(By.xpath("/html/body/div[12]/div/div[2]/div/table/tbody/tr[3]/td[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/form/div[1]/div[2]/div[5]/span[2]/input"))
				.click();
		driver.findElement(By.name("address1")).sendKeys("212445 cam");
		driver.findElement(By.name("address2")).sendKeys("1245vfb");
		driver.findElement(By.name("cityS")).sendKeys("ggijl");
		new Select(driver.findElement(By.name("countryS"))).selectByVisibleText("India");
		new Select(driver.findElement(By.name("stateS"))).selectByVisibleText("Andhra Pradesh");
		driver.findElement(By.name("zipCode")).sendKeys("7679");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		new Select(driver.findElement(By.name("proofS"))).selectByVisibleText("PAN Card");
		driver.findElement(By.name("proofId")).sendKeys("tuy9870");
		driver.findElement(By.name("emailId")).sendKeys("gugihoj");
		driver.findElement(By.name("password")).sendKeys("rupa");
		driver.findElement(By.name("repassword")).sendKeys("rupa");

	}

}
