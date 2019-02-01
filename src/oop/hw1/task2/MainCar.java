package oop.hw1.task2;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car(100, 10);
        car.addLiter(40);
        car.goCar(290);
        System.out.println("Пройденное кол-во км " + car.allDistance(230));
        System.out.println(car.gasolineLevel());
    }
}
