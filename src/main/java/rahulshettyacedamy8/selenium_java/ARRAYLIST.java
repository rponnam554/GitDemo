package rahulshettyacedamy8.selenium_java;

import java.util.ArrayList;

public class ARRAYLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		
a.add("rahul");
a.add("raju");
a.add("RAJEEV");
a.add("RAJESH");
//a.remove(0);

for (int i=0;i<a.size();i++)
{
	System.out.println(a.get(i));
}
System.out.println("**********************************************************");
for (String value:a)
//System.out.println(a);
System.out.println(value);
System.out.println(a.contains("RAJEEV1"));
	}

}
