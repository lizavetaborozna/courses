package exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Напишите метод public List<Double> readValues() throws ...,
 * читающий числа с плавающей точкой из ввода консоли, через Scanner.
 * Сгенерируйте подходящие исключения, если ввод если введены данные,
 * не относящиеся к числам с плавающей точкой. Ввод:
 * 1 2 3 4 aaaa
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(readValues());
    }

    public static List<Double> readValues() throws NumberFormatException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Double> list = new ArrayList<>();
        try {
            for (String strings : str.split(" ")) {
                list.add(Double.parseDouble(strings));
            }
        } catch (NumberFormatException number) {
            System.out.println("Неверный формат ввода числа " + number);
        }
        return list;
    }
}
