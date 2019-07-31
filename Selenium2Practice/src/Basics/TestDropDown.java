package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Eclipse\\Drivers\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		//driver.findElement(By.xpath("//*[@id='searchLanguage']/option[9]")).click();
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		select.selectByValue("da");
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println("Total values in dropdown are "+values.size());
		System.out.println(values.get(7).getText());
		/*for(int i=0;i<values.size();i++){
			System.out.println(values.get(i).getAttribute("lang"));
		}*/
		
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}*/
		WebElement block = driver.findElement(By.className("other-projects"));
		List<WebElement> SubLink = block.findElements(By.tagName("a"));
		for(int j=0;j<SubLink.size();j++){
			System.out.println(SubLink.get(j).getText());
		}
		
		
	}

}
