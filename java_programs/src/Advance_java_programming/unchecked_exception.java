package Advance_java_programming;

public class unchecked_exception {
    public static void main(String[] args) {
        int a = 10, b = 0;
        try {
            int result = a / b; // may throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
