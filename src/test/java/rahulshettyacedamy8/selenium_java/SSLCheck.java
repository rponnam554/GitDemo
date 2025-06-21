package rahulshettyacedamy8.selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
	//	FirefoxOptions options1=new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	//	WebDriver driver=new FirefoxDriver(options1);
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
System.out.println(driver.getTitle());
	}

}
