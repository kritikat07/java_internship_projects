package File_handling;

import java.io.FileWriter;
import java.io.IOException;

public class file_writer {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("example.txt", true)) { // true for append
            fw.write("Hello, FileWriter!\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
