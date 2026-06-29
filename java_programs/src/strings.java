public class strings {
    static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println(str1 + " " + str2);

        //String Methods:
        String s = "Java Programming";

        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(5));
        System.out.println(s.substring(5, 16));
        System.out.println(s.contains("Java"));
        System.out.println(s.replace("Java", "Python"));


       // Array of Strings Example:
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        for (String fruit : fruits) {
                    System.out.println(fruit.toUpperCase());
        }


    }
}
