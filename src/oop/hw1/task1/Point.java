package oop.hw1.task1;

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
        Point p1 = new Point(newX, newY);
        return p1;
    }

}
