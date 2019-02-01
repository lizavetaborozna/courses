package oop.hw2;

public class Rectangle extends Point {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public double distance() {
        System.out.println("Длина диагонали равна: ");
        return super.distance();
    }

    public double square() {
        System.out.println("Площадь прямоугольника: ");
        double squareRec = getX() * getY();
        return squareRec;
    }


}
