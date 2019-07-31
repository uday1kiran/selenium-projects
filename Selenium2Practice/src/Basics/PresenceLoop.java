package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PresenceLoop {
	public static WebDriver driver;
	private static boolean isElementPresent(String x) {
		try{
			driver.findElement(By.xpath(x));
			return true;
		} catch(Throwable t){
		return false;
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Eclipse\\Drivers\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//*[@id="exp-1"]
		int i =1;
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		while(isElementPresent(("//*[@id='exp-"+i+"']"))) {
			driver.findElement(By.xpath("//*[@id='exp-"+i+"']")).click();
			i++;
			
		}
		
		

	}

	


}
