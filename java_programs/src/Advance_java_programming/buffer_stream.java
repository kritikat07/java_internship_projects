package Advance_java_programming;
import java.io.*;

public class buffer_stream {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("buffered.txt"))) {
            bw.write("Buffered I/O in Java");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("buffered.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
