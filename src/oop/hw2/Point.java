package oop.hw2;

/**
 * Продолжение задачи 1. Используя класс точки, создать класс Rectangle, описывающий прямоугольник,
 * и класс Circle описывающий круг. В них должны храниться поля типа Point в роли координат.
 * Создать следующие методы в классе Rectangle:
 * - Высчитывающий длину диагонали
 * Методы в классе Circle:
 * - Высчитывающий длину окружности. У обоих классов должен быть метод нахождения площади.
 * Написать программу, тестовый класс с методом main, демонстрирующим создание объекта класса Rectangle и применение вышеперечисленных методов.
 */

public class Point {
    final private int x;
    final private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        double dist = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
        System.out.println(dist);
        return dist;
    }

    public Point translate(int x1, int y1) {
        int newX, newY;
        newX = getX() + x1;
        newY = getY() + y1;
        Point p1 = new Point(newX, newY);
        return p1;
    }

    public Point scale(int scale) {
        int newX, newY;
        newX = getX() * scale;
        newY = getY() * scale;
        return new Point(newX, newY);
    }

}
