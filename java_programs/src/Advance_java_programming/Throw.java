package Advance_java_programming;

public class Throw {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
