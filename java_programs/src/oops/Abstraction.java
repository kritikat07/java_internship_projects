
package oops;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Shape s2 = new Circle();
        s2.draw();                  // Drawing Circle
        Shape s1 = new Shape() {
            @Override
            void draw() {
                System.out.println("Drawing ");
            }
        };
        s1.draw();                  // Drawing
    }
}