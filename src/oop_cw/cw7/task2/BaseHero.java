package oop_cw.cw7.task2;

public class BaseHero  extends Hero{

    public BaseHero(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println(getName()+" attack");
    }
}
