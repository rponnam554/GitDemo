package rahulshettyacedamy8.selenium_java;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Filter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies=driver.findElements(By.xpath("//tr/td[1]"));
		// 5 resulsts will show after execution
		for(int i=0;i<veggies.size();i++)
		{
			System.out.println(veggies.get(i).getText());
		} 
		
		List<WebElement> filteredList=veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		// 1 result will show for rice after execution
		for(int i=0;i<filteredList.size();i++)
		{
			System.out.println(filteredList.get(i).getText());
		} 
Assert.assertEquals(veggies, filteredList);
	}


}
