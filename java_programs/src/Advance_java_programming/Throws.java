package Advance_java_programming;

import java.io.FileReader;
import java.io.IOException;

public class Throws {
    static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
