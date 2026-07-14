package Serialization_and_Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student student = (Student) ois.readObject();
            System.out.println("Deserialized object: " + student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
