package Advance_java_programming;

public class try_catch {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // may throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
