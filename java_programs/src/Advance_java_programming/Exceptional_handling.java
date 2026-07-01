package Advance_java_programming;

public class Exceptional_handling {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // may throw ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This block executes always.");
        }
    }
}