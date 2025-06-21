package rahulshettyacedamy8.selenium_java;

import java.util.Scanner;

public class REVERSEOFASTRING {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();  // dynamic input
       

        // Method 1: Using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed string: " + reversed);
        
        if(input.equals(reversed))
        {
        	System.out.println(reversed+" is a polyndrome number");
        }
        else
        {
        	System.out.println(reversed+" is not a polyndrome number");	
        }
    }
}

