package oops;

public class encapsulation {
    static void main(String[] args) {
        class Student {
            private String name;
            public void setName(String name) {
                this.name = name;
            }
            public String getName() {
                return name;
            }
        }
    }
}
