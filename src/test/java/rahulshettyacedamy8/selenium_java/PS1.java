package rahulshettyacedamy8.selenium_java;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PS1 extends PS  {
	@Test
	public void testRun()
	{
		PS2 obj=new PS2(3); //parameterized constructor 
	    int a=3;
		doThis();
		System.out.println(obj.increment());
		System.out.println(obj.decrement());
// not required with extends mechansim PS3 obj2=new PS3(3); 
		System.out.println(obj.multplyThree());
	}

}
