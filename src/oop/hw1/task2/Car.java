package oop.hw1.task2;

/**
 * Реализуйте класс Саг, моделирующий передвижение автомобиля на бензиновом топливе по оси х.
 * Предоставьте методы для передвижения автомобиля на заданное количество километров, заполнения топливного
 * бака заданным количеством литров бензина,вычисления расстояния, пройденного от начала координат, а также
 * уровня топлива в баке. Укажите расход топлива (в л/км) вкачестве параметра конструктора данного класса.
 */
public class Car {
    private int kilometer;
    private double liter;

    public final static double CAPACITY = 60;
    public final static double RUN = 715; //пробег

    public Car(int kilometer, int liter) {
        this.kilometer = kilometer;
        this.liter = liter;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }

    public void goCar(int newkilometer) {
        double oneLiter = RUN / CAPACITY;
        double maxDistance = oneLiter * CAPACITY; //макс расстояние при полном баке
        if (newkilometer + getKilometer() > maxDistance) {
            System.out.println("Слишком большое расстояние даже при условии полного бака");
        } else {
            kilometer = getKilometer() + newkilometer;
            liter = getLiter() - oneLiter * newkilometer / 100;
        }
    }

    public void addLiter(int addliter) {
        if (getLiter() + addliter > CAPACITY) {
            System.out.println("Объем бака меньше данного объема");
        } else {
            liter = getLiter() + addliter;
            System.out.println(liter);
        }
    }

    public int allDistance(int newkilometer) {
        kilometer = getKilometer() + newkilometer;
        return kilometer;
    }

    public double gasolineLevel() {
        if (liter > CAPACITY / 2) {
            System.out.println("Объем бака больше половины");
        } else {
            System.out.println("Объем бака меньше половины");
        }
        return liter;
    }
}


