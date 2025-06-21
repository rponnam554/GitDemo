package rahulshettyacedamy8.selenium_java;

public class Stringobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "hello";
		
		String s2=new String("welcome");
		String s3=new String("welcome2");
		
		String s= "RAHUL SHETTY ACEDAMY";
		//String splittedstring[] = s.split("SHETTY");
		//System.out.println(splittedstring[0]);
		//System.out.println(splittedstring[1]);
		//System.out.println(splittedstring[2]);
		//System.out.println(splittedstring[1].trim());
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	}

}
