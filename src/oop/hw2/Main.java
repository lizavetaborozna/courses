package oop.hw2;


public class Main {
    public static void main(String[] args) {
        new Rectangle(5, 6).distance();
        Rectangle rec = new Rectangle(3, 4);
        System.out.println(rec.square());
        Circle circle = new Circle(3, 4, 5);
        System.out.println(circle.square());
        System.out.println(circle.lengthCir());

    }
}
