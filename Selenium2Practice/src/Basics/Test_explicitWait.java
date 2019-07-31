package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_explicitWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Eclipse\\Drivers\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/");
		driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys("krishnarafael@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("password")).sendKeys("Notallowed1");
		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("passwordNext"))).click();;
		
		 String x = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div[2]/div[2]/span"))).getText();
		 
		 System.out.println(x);
		//System.out.println(driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div[2]/div[2]/span")).getText());
	
	}

	
}