package rahulshettyacedamy8.selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarTest {

	public static void main(String[] args) {
	
		String month="6";
		String date="15";
		String year="2027";
		String expectedresult[]= {month,date,year};
System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		List<WebElement> actualList=driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0;i<actualList.size();i++)
		{
			System.out.println(actualList.get(i).getAttribute("Value"));
			Assert.assertEquals(actualList.get(i).getAttribute("Value"),expectedresult[i]);
		}
		
	}

}
