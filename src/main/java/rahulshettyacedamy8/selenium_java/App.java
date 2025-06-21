package rahulshettyacedamy8.selenium_java;

public class App {
    public static void main(String[] args) {
        String[] arr = {"1", "3", "?", "8"};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            try {
                int num = Integer.parseInt(arr[i]);
                sum += num;
            } catch (NumberFormatException e) {
                // Ignore non-numeric values like "?"
            }
        }

        System.out.println("Sum of numeric values: " + sum);
    }
}