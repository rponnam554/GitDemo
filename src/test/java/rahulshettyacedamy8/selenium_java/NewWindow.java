package rahulshettyacedamy8.selenium_java;

import java.util.Iterator;
import java.util.Set;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewWindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//switching window
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowID=it.next();
		String childWindowID=it.next();
		driver.switchTo().window(childWindowID);
		driver.get("https://rahulshettyacademy.com");
		String coursename=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		driver.switchTo().window(parentWindowID);
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys(coursename);
		 File src=name.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File("C://Users//RAJU PONNAM//Screenshot.png"));
		 //get height and width
		 System.out.println(name.getRect().getDimension().getHeight());
		 
		 System.out.println(name.getRect().getDimension().getWidth());
	}

}
