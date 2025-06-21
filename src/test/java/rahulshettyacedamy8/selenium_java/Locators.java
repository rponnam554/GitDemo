package rahulshettyacedamy8.selenium_java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("raju");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy1");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("RAJU");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("raju.ponnam554@gmail.com");
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9123456789");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9123456788");
		//driver.findElement(By.className("reset-pwd-btn")).click();
		//driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		//driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("RAJU");
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("RAJU");
		//driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.cssSelector("button.signInBtn")).click();
		//driver.findElement(By.cssSelector("//button[@class='submit signInBtn']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		//System.out.println(driver.findElement(By.xpath("//form/p")).getText());
	//driver.quit();
	}

}
