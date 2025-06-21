package rahulshettyacedamy8.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
				driver.get("https://jqueryui.com/droppable/");
				System.out.println(driver.findElements(By.tagName("Iframe")).size());
				//driver.switchTo().frame(0);
				driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
				driver.findElement(By.id("draggable")).click();
			WebElement source=driver.findElement(By.cssSelector(".ui-widget-content.ui-draggable.ui-draggable-handle"));
			
			WebElement target=driver.findElement(By.id("droppable"));
			Actions a=new Actions(driver);
			a.dragAndDrop(source,target).build().perform();
			driver.switchTo().defaultContent();
			driver.findElement(By.linkText("Accept")).click();
			
			

	}

}
