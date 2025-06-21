package rahulshettyacedamy8.selenium_java;

public class Constructor {
    String model;

    // Parameterized Constructor
    Constructor(String carModel) {
        model = carModel;
    }

    public static void main(String[] args) {
        Constructor myCar = new Constructor("Honda");
        System.out.println("Model: " + myCar.model);
    }
}