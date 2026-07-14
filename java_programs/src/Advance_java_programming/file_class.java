package Advance_java_programming;

import java.io.File;
import java.io.IOException;

public class file_class {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File exists? " + file.exists());
        System.out.println("Is directory? " + file.isDirectory());
    }
}
