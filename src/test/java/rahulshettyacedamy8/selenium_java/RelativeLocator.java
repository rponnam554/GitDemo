package rahulshettyacedamy8.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;


public class RelativeLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
	WebElement nameEditBox=	driver.findElement(By.cssSelector("input[name='name']"));
	System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
WebElement DOB=driver.findElement(By.cssSelector("label[for='dateofBirth']"));
driver.findElement(with(By.tagName("input")).below(DOB)).click();
WebElement checkBoxText=driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
driver.findElement(with(By.tagName("input")).toLeftOf(checkBoxText)).click();

WebElement radioBoxText=driver.findElement(By.id("inlineRadio1"));
System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioBoxText)).getText());
	}

}
