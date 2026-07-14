package Advance_java_programming;

import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate allowed

        System.out.println(fruits);
    }
}
