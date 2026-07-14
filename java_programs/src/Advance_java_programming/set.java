package Advance_java_programming;

import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("Banana");
        fruits.add("apple"); // duplicate ignored

        System.out.println(fruits);
    }
}
