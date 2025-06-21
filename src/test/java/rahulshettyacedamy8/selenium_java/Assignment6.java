package rahulshettyacedamy8.selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();

		WebElement element = driver.findElement(By.cssSelector("label[for='honda']"));
		// WebElement element=driver.findElement(By.id("checkBoxOption3"));
		String input1 = element.getText();
		System.out.println(input1);
		WebElement element2=driver.findElement(By.id("dropdown-class-example"));
		//Thread.sleep(2000);
		Select dropdown = new Select(element2);
		dropdown.selectByVisibleText(input1);
		driver.findElement(By.id("name")).sendKeys(input1);
		driver.findElement(By.id("alertbtn")).click();
		String output=driver.switchTo().alert().getText();	
		if(output.contains(input1))
		{
			System.out.println("it conatins the input value: option3");
		}
		else
		{
			System.out.println("it doesn conatins the input value: option3");
		}
		driver.switchTo().alert().accept();

	}

}
