package Level_1_E2;

public class Car {
    private static final String BRAND = "Mercedes Benz";
    private static String model = "Es315";
    private final int power;

    public Car(int power) {
        this.power = power;
    }

    public static void brake() {
        System.out.println("The car is braking...");
    }

    public void accelerate() {
        System.out.println("The car is accelerating...");
    }
}
