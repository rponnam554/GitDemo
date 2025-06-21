package rahulshettyacedamy8.selenium_java;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Setproxypath {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
	Proxy proxy=new Proxy();
	proxy.setHttpProxy("ipaddress:4444");
	options.setCapability("proxy", proxy);
	Map<String, Object> prefs=new HashMap<String, Object>();
	prefs.put("download.default.directory", "D://EC_DOWNLOAD");
	options.setExperimentalOption("prefs", prefs);
		options.setAcceptInsecureCerts(true);
		options.setExperimentalOption("excludeSwitches",
			     Arrays.asList("disable-popup-blocking"));
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
System.out.println(driver.getTitle());
	}

}
