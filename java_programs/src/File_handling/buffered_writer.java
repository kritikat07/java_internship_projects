package File_handling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buffered_writer {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            bw.write("Hello, BufferedWriter!");
            bw.newLine();
            bw.write("This is efficient file writing.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
