package oop.hw1.task1;

/**
 * Создать класс Point, описывающий точку в двумерных координатах. Полями этого класса должны быть координаты x и y.
 * Класс должен иметь один конструктор, принимающий координаты x и y.
 * Сделайте информацию о координатах скрытой, а получить её можно только с помощью методов доступа (get/set). Создать метод distance,
 * принимающий объект Point и определяющий расстояние до неё.
 * **(Дополнительно) Сделайте этот класс неизменяемым. Предоставьте методы translate() и scale(). В частности, метод translate() должен
 * перемещать точку на определенное расстояние в направлении координат х и у , а метод scale() — изменять масштаб по обеим координатам
 * на заданный коэффициент. Реализуйте эти методы таким образом, чтобы они возвращали новые точки в качестве результата. Например, в следующей строке кода:\
 */

public class Main {
    public static void main(String[] args) {
        new Point(3, 4).distance();
        new Point(3, 4).translate(1, 3).scale(2);
    }
}