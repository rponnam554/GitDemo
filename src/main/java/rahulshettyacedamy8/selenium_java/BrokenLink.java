package rahulshettyacedamy8.selenium_java;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		int count=0;
		//Find broken urls
		//Step1 To get all URLS using selenium
		//java methods will call URL's and get you status code
		//Status code > 400 then URL is not accessible -> i.e link is broken
//String url1=driver.findElement(By.cssSelector("a[href*='https://www.soapui.org']")).getAttribute("href"); //customized css
List<WebElement> allLinks=driver.findElements(By.cssSelector("li[class='gf-li'] a"));
SoftAssert a=new SoftAssert();
for(WebElement link: allLinks)
{
	String url2=link.getAttribute("href");
	System.out.println(url2);
	HttpURLConnection conn=(HttpURLConnection)new URL(url2).openConnection();
	conn.setRequestMethod("HEAD");
	conn.connect();
	int respCode=conn.getResponseCode();
	System.out.println(respCode);
		 a.assertTrue(respCode<400, "The link with text "+link.getText()+" is broken with code" +respCode);
	
}
a.assertAll();


	
	}

}
