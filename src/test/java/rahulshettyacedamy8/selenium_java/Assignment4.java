package rahulshettyacedamy8.selenium_java;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Multiple Windows")));
		driver.findElement(By.linkText("Multiple Windows")).click();
		//driver.findElement(By.linkText("Click Here")).click();
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		String parentId= itr.next();
		String childId= itr.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		
		
	}

}
