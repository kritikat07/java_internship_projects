package Advance_java_programming;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class checked_exception {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt"); // may throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
