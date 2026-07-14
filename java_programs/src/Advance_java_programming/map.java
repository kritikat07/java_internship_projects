package Advance_java_programming;

import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Alice");
        map.put(3, "Bob");
        map.put(2, "Eve"); // duplicate key replaces value
        System.out.println(map);
    }
}
