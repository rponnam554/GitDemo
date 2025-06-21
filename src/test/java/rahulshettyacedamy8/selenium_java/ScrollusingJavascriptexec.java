package rahulshettyacedamy8.selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollusingJavascriptexec {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		int total=0;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> amounts=driver.findElements(By.cssSelector("div[class='tableFixHead'] td:nth-child(4)"));
		for(int i=0;i<amounts.size();i++)
		{
		
			int value=Integer.parseInt(amounts.get(i).getText());
			total=total+value;
			
		}
    System.out.println(total);
    String actualtext=driver.findElement(By.cssSelector("div[class='totalAmount']")).getText();
    int finalamount=Integer.parseInt(actualtext.split(":")[1].trim());
    Assert.assertEquals(total, finalamount);
    if(total==finalamount)
    {
    	System.out.println("Displayed amount is matched with sum amount");
    }
    else
    {
    	System.out.println("Displayed amount is not matched with sum amount");
    }
	}
  
}
