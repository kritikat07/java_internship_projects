package Constructor_and_Methods;
class Car {
    String brand;
    int speed;

    // Default constructor
    Car() {
        brand = "Unknown";
        speed = 0;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}


public class constructor {
    public static void main(String[] args) {
        Car car1 = new Car();  // Calls constructor
        car1.display();
    }
}
