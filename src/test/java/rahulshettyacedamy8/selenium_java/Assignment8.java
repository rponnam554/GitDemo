package rahulshettyacedamy8.selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> test=driver.findElements(By.cssSelector("li[class='ui-menu-item'] div[class='ui-menu-item-wrapper']"));
		for(int i=0;i<test.size();i++)
		{
			
			if(test.get(i).getText().equalsIgnoreCase("india"))
			{
		driver.findElements(By.cssSelector("li[class='ui-menu-item'] div[class='ui-menu-item-wrapper']")).get(i).click();
			}
		}

	}

}
