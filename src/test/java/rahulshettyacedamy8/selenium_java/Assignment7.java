package rahulshettyacedamy8.selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        System.out.println("#######################ROWS#####################");
        List<WebElement> rows=driver.findElements(By.cssSelector("table[name='courses']  tr"));
       
     /*   for(int i=0;i<rows.size();i++)
        {
        	System.out.println(driver.findElements(By.cssSelector("table[name='courses']  tr")).get(i).getText());
        }
        System.out.println("#######################COLUMNS#####################");
        List<WebElement> columns=driver.findElements(By.cssSelector("table[name='courses']  th"));
        
        for(int i=0;i<columns.size();i++)
        {
        	System.out.println(driver.findElements(By.cssSelector("table[name='courses']  th")).get(i).getText());
        } */
        System.out.println(driver.findElements(By.cssSelector("table[name='courses']  tr")).size());
        System.out.println(driver.findElements(By.cssSelector("table[name='courses']  th")).size());
        System.out.println("#######################2nd row values#####################");
        System.out.println(driver.findElements(By.cssSelector("table[name='courses']  tr")).get(2).getText());
	}

}
