package rahulshettyacedamy8.selenium_java;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		String itemsNeeded[] = { "Cucumber", "Brocolli","Beetroot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	
		//this block is not required bcoz of method is static
		/*	Greenkart b =new Greenkart();
		addItems(driver, itemsNeeded); */

	}
	
	public static void addItems(WebDriver driver,String itemsNeeded[])
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		int count = 0;
		for (int i = 0; i < products.size(); i++) {
			String name[] = products.get(i).getText().split("-");

			String formattedname = name[0].trim();
			// format it to get actual vegetable name

			// check whether expected vegetable list is present in list or not
			// convert array into arraylist for easy search

			List itemsNeedList = Arrays.asList(itemsNeeded);

			if (itemsNeedList.contains(formattedname)) {
				count++;
				// Thread.sleep(5000);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			}
			if (count == itemsNeeded.length) {
				break;
			}
		}
		
	}
}
