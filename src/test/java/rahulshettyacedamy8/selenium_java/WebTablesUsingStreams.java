package rahulshettyacedamy8.selenium_java;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTablesUsingStreams {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers/");
		//click on column for sort
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		//capture all webelements in to list
		List<WebElement> list=driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all web elements into new(original) list
		List<String> originalList=list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the original list of step3 -> sorted list
		List<String> sortedList=originalList.stream().sorted().collect(Collectors.toList());
		//compare original list vs sorted list
		
		Assert.assertEquals(originalList, sortedList);
		Assert.assertTrue(originalList.equals(sortedList));
		
		System.out.println(originalList);
		System.out.println(sortedList);
		List<String> price;
		do
		{
			List<WebElement> rows=driver.findElements(By.xpath("//tr/td[1]"));
		//scan the vegetable row column with get text
		//if encounter rice then print price
		price=rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
		
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();

		}
		}
		while(price.size()<1);
		}
			

	private static String getPriceVeggie(WebElement s)
	{
		String pricevalue=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}
	
}