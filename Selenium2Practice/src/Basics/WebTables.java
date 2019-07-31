package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	
		
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Eclipse\\Drivers\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> Rows= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		
		List<WebElement> Columns= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td"));
	
		System.out.println("Number of rows in the WebTable are "+Rows.size());
		System.out.println("Number of columns in the WebTable are "+Columns.size());
		
		////*[@id="customers"]/tbody/tr[2]/td[1]
		for(int i =2;i<=Rows.size();i++){
			System.out.println("\n");
			for(int j=1;j<=Columns.size();j++){
				System.out.print(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText());
				System.out.println("\n");
				
			}
		}
		

	}

}
