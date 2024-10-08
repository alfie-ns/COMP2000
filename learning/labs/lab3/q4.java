// Define the Car class
class Car {
    // Attributes
    String model;
    double price;

    // Constructor to initialize the car attributes
    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Method to simulate starting the car
    public void start() {
        System.out.println(model + " is starting.");
    }

    // Method to simulate stopping the car
    public void stop() {
        System.out.println(model + " is stopping.");
    }

    // Method to simulate the car moving
    public void move() {
        System.out.println(model + " is moving.");
    }
}

public class q4 {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car car1 = new Car("Tesla Model S", 79999.99);

        // Call the car's functionalities
        car1.start();
        car1.move();
        car1.stop();
    }
}
