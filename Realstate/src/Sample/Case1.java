package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Case1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Eclipse\\Drivers\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://realestatem1.upskills.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='responsive']/li[7]/a")).click();
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		driver.findElement(By.name("login")).click();
		
	    driver.findElement(By.xpath("//*[@id='menu-users']/a/div[3]")).click();
	    driver.findElement(By.xpath("//*[@id='menu-users']/ul/li[3]/a")).click();
	    driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("Uday");
	    driver.findElement(By.id("email")).sendKeys("uday@guruji.com");
	    driver.findElement(By.id("first_name")).sendKeys("uday");
	    driver.findElement(By.id("last_name")).sendKeys("kiran");
	    driver.findElement(By.id("url")).sendKeys("uday@erwin");
	    driver.findElement(By.xpath("//*[@id='createuser']/table/tbody/tr[6]/td/button")).click();
	    driver.findElement(By.id("pass1-text")).sendKeys("GiveMe500Bucks");
	    WebElement dropdown = driver.findElement(By.id("role"));
		Select select = new Select(dropdown);
		select.selectByValue("author");
		driver.findElement(By.id("createusersub")).click();
		//driver.quit();

	}

}
