package oops;

class Calculator {
    int add(int a, int b) {
        return a + b;   // Method Overloading
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animals {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animals {
    @Override
    void sound() {      // Method Overriding
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Method Overloading
        Calculator cal = new Calculator();
        System.out.println("Addition of integers: " + cal.add(10, 20));
        System.out.println("Addition of doubles: " + cal.add(10.5, 20.5));

        // Method Overriding
        Animals a = new Cat();
        a.sound();
    }
}