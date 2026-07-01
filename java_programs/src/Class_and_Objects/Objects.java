package Class_and_Objects;
class Car {
    // Attributes (fields)
    String brand;
    String color;
    int speed;

    // Method (behavior)
    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h.");
    }

    void brake() {
        System.out.println(brand + " has applied brakes.");
    }
public static class Objects {
    public static void main(String[] args) {
        // Create first object of Car
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.color = "Red";
        car1.speed = 100;

        // Create second object of Car
        Car car2 = new Car();
        car2.brand = "BMW";
        car2.color = "Blue";
        car2.speed = 120;

        // Call methods on objects
        car1.drive();
        car1.brake();

        car2.drive();
        car2.brake();
    }
}
    }


