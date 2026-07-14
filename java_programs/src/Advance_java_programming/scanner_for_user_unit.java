package Advance_java_programming;
import java.io.*;
import java.util.Scanner;

public class scanner_for_user_unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        sc.close();
    }
}
