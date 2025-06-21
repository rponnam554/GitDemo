package rahulshettyacedamy8.selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TUTORASSIGNMENT12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

List checkbox2=driver.findElements(By.cssSelector("input[type='checkbox']"));
	
	
System.out.println("checkboxes count in the page is "+checkbox2.size());
}
}