package rahulshettyacedamy8.selenium_java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
	

		WebDriver driver = new FirefoxDriver();
	
		         
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		//WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(2));
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		Thread.sleep(2000);
		driver.findElement(By.id("okayBtn")).click();
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.cssSelector("select[class='form-control']"));
		Select obj=new Select(dropdown);
		obj.selectByVisibleText("Teacher");
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInBtn")));
		driver.findElement(By.id("signInBtn")).click();
		
		
		//driver.switchTo().alert().accept();
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn-info")));
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		//List cartlist=driver.findElements(By.cssSelector(".btn.btn-info"));
		Thread.sleep(5000);
		List cartlist=driver.findElements(By.cssSelector(".card-footer .btn-info"));
		
		for(int i=0;i<cartlist.size();i++)
		{
			driver.findElements(By.cssSelector(".btn.btn-info")).get(i).click();
		}
		driver.findElement(By.partialLinkText("Checkout")).click();
//driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click(); 
	}

}
