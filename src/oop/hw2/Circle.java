package oop.hw2;

public class Circle extends Point {
    private int radius;

    public Circle(int x, int y,int radius) {
        super(x, y);
        this.radius=radius;
    }

    public int getRadius() {
        return radius;
    }

    public double square() {
        System.out.println("Площадь окружности: ");
        double squareCir = Math.pow(getRadius(),2)*3.14;
        return squareCir;
    }
    public double lengthCir() {
        System.out.println("Длина окружности: ");
        double lengthCircle = 2*3.14*getRadius();
        return lengthCircle;
    }
}
