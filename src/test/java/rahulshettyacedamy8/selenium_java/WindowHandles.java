package rahulshettyacedamy8.selenium_java;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.partialLinkText("Free Access to")).click();
		//driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		//driver.findElement(By.cssSelector(".blinkingText")).click();
       Set<String> windows= driver.getWindowHandles();
       Iterator<String> itr=windows.iterator();
     String parentId= itr.next();
       String childId=itr.next();
       driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
       driver.findElement(By.cssSelector(".im-para.red")).getText();
       String emailID=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
       driver.switchTo().window(parentId);
       driver.findElement(By.id("username")).sendKeys(emailID);
       driver.findElement(By.id("password")).sendKeys("learning");
       driver.findElement(By.cssSelector("input[value='user']")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("okayBtn")).click();
      driver.findElement(By.id("signInBtn")).click();
	}

}
