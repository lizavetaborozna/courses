package collections.hw2.task2;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    public static Map<Car, Integer> fillGarage(Map<Car, Integer> list) {
        list = new HashMap<>();

        list.put(new Audi("Audi", "A4", 2014, false,200), 3);
        list.put(new BMW("BMW", "M85", 2019, true,300), 2);
        list.put(new Mazda("Mazda", "Continental", 2016, false,150), 5);
        list.put(new Truck("Truck", "A123", 2012, false,180), 5);
        return list;
    }

    public static Map<Car, Integer> exitFromGarage(Map<Car, Integer> list, String model) {
        if (list.get(model).intValue() > 0) {
            list.remove(model);
        }
        return list;
    }
}
