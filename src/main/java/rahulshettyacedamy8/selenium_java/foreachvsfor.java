package rahulshettyacedamy8.selenium_java;

public class foreachvsfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30};

		for (int num : arr) {
		    System.out.println(num);
		}
		
		for (int i = 0; i < arr.length; i++) {
		    System.out.println(arr[i]);
		}
	}

}
