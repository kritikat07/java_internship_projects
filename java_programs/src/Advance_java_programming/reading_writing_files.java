package Advance_java_programming;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class reading_writing_files {
    public static void main(String[] args) {
        // Writing to a file
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, Java I/O!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        try (FileReader reader = new FileReader("example.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
