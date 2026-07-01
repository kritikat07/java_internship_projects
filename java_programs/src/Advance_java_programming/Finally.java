package Advance_java_programming;

public class Finally {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            System.out.println("This block executes always.");
        }
    }
}
