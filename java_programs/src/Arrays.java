public class Arrays {
    static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;

        int[] marks = {90, 85, 70, 95, 88};

        System.out.println(marks[0]);
        System.out.println(marks.length);
        for (int mark : marks) {
            System.out.println(mark);
        }
    }

}
