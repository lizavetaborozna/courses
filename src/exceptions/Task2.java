package exceptions;

/**
 * Напишите метод public double sumOfValues() throws ..., вызывающий
 * метод из предыдущего упражнения и возвращающий сумму введеных значений
 * в разных строках. Организуйте распространение любых исключений вызывающему
 * коду. Ввод:
 * 1 2 3 4
 * 2 3 4 aaa
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(sumOfValues());
    }

    public static double sumOfValues() throws NumberFormatException {
        double sum = 0;
        for (Double numbers : Task1.readValues()) {
            sum += numbers;
        }
        return sum;
    }
}
