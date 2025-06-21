package rahulshettyacedamy8.selenium_java;

import java.util.Scanner;

public class JAVABRUSHUP2 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a value");
		
		int j=scanner.nextInt();
		int l=j;
		int k=0;
		

		while(j!=0)
		{
			int i=j%10;
			{
				k=k*10+i;
				j=j/10;
			}
		} 

		System.out.println("reversed number "+k);
if(k==l)
{
	System.out.println(l+" is a polyndrome number");
}
else
{
	System.out.println(l+" is not a polyndrome number");	
}
}
}
