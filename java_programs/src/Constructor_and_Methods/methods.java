package Constructor_and_Methods;

class Calculator {
    // Method with return type
    int add(int a, int b) {
        return a + b;
    }

    // Method without return type
    void greet() {
        System.out.println("Welcome to Calculator!");
    }
}

public class methods {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.greet();                 // Call void method
        System.out.println(calc.add(5, 10)); // Call method with return value
    }
}
