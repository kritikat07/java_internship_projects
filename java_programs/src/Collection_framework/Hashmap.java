package Collection_framework;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // Adding key-value pairs
        map.put(1, "John");
        map.put(2, "Alice");
        map.put(3, "Bob");
        // Accessing values
        System.out.println("Value for key 2: " + map.get(2));
        // Iterating entries
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        // Removing a key-value pair
        map.remove(3);
        System.out.println("After removal: " + map);
    }
}
