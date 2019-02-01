package oop_cw.cw7.task2;

/**
 * Создать классы Warrior, Wizard и Archer, представляющие собой наследников класса Hero
 * Переопределить в них метод attackEnemy() для вывода специализированного для этого класса сообщения об атаке.
 * Протестировать создание героев различных классов и их атаки в классе TrainingGround(отдельный класс с методом main).
 */
public class Warrior extends BaseHero {
    public Warrior(String name, int damage) {
        super(name, damage);
    }
}
