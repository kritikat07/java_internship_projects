package Collection_framework;


import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));
        // Iterating elements
        for(String fruit : fruits) {
            System.out.println(fruit);
        }
        // Removing elements
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
    }
}
