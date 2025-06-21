package rahulshettyacedamy8.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
				driver.get("https://the-internet.herokuapp.com/");
				Thread.sleep(2000);
				driver.findElement(By.linkText("Nested Frames")).click();
				System.out.println(driver.findElements(By.tagName("frame")).size());
				driver.switchTo().frame(driver.findElement(By.name("frame-top")));
				driver.switchTo().frame(driver.findElement(By.name("frame-middle")));
				
				System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
				

	}

}
