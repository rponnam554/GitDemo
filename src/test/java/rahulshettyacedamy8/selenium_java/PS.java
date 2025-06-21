package rahulshettyacedamy8.selenium_java;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class PS {
	

	public void doThis()
	{
		
		System.out.println("I am here");
	}
	
	@BeforeMethod
	
	public void beforeRun()
	{
			System.out.println("before method");
	}

@AfterMethod
	
	public void afterRun()
	{
			System.out.println("After method");
	}

}
