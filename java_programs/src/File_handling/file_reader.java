package File_handling;

import java.io.FileReader;
import java.io.IOException;

public class file_reader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("example.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
