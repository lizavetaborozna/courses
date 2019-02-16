package collections.hw2.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car,Integer> cars=new HashMap<>();
        System.out.println(Garage.fillGarage(cars).toString());
    }
}
