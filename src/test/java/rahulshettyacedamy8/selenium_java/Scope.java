package rahulshettyacedamy8.selenium_java;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		int count=0;
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				System.out.println(driver.findElements(By.tagName("a")).size());
				WebElement footerdriver=driver.findElement(By.id("gf-BIG")); //Limiting webdriver scope
				System.out.println(footerdriver.findElements(By.tagName("a")).size());
				WebElement footerdriver2=footerdriver.findElement(By.xpath("//table//tbody/tr/td[1]/ul"));
				System.out.println(footerdriver2.findElements(By.tagName("a")).size());
				List<WebElement> links=footerdriver2.findElements(By.tagName("a"));
				for(int i=1;i<links.size();i++)
				{
					
					String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
					
					links.get(i).sendKeys(clickOnLinkTab);
					Thread.sleep(5000);
				}
					Set<String> abc=driver.getWindowHandles();
				//	System.out.println(links.get(i).getText());
					Iterator<String> it=abc.iterator();
				
				while(it.hasNext())
				{
					driver.switchTo().window(it.next());
					System.out.println(driver.getTitle());
				}
					
				
			
	}

}
