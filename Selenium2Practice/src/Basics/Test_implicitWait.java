package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_implicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Eclipse\\Drivers\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/");
		driver.manage().window().maximize();
		driver.findElement(By.name("identifier")).sendKeys("krishnarafael@gmail.com");
		driver.findElement(By.className("CwaK9")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("password")).sendKeys("Notallowed1");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div[2]/div[2]")).getText());
	
	}

}
