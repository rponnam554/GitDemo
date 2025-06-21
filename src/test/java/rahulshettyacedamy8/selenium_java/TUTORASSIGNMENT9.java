package rahulshettyacedamy8.selenium_java;

	
	import org.openqa.selenium.By;



	import org.openqa.selenium.Keys;



	import org.openqa.selenium.WebDriver;



	import org.openqa.selenium.WebElement;



	import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.support.ui.ExpectedConditions;

	import org.openqa.selenium.support.ui.Select;

	import org.openqa.selenium.support.ui.WebDriverWait;



	public class TUTORASSIGNMENT9 {




	public static void main(String[] args) throws InterruptedException {



	// TODO Auto-generated method stub



		System.setProperty("webdriver.chrome.driver", "D:/chromedriver-win64/chromedriver-win64/chromedriver.exe");



	    WebDriver driver = new ChromeDriver();

	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	    driver.findElement(By.id("autocomplete")).sendKeys("united");

	    Thread.sleep(2000);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	   driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

	       

	       

	}

	}


