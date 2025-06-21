package rahulshettyacedamy8.selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).click();
		WebElement checkbox= driver.findElement(By.id("checkBoxOption1"));
		boolean isChecked = checkbox.isSelected();
		if (isChecked) {
		    System.out.println("Checkbox is selected.");
		} else {
		    System.out.println("Checkbox is not selected.");
		}
		
		List<WebElement> checkbox2=driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println("Count of number of check boxes present in the page is"+checkbox2.size());
		
		}
			
	}


