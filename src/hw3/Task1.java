package hw3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        printNewArray(array);
    }

    private static void printNewArray(int[] array) {
        int tmp = 0;
        int numberShifts = 5;
        while (numberShifts > 0) {
            for (int i = 0; i <= array.length - 1; i++) {
                tmp = array[i];
                array[i] = array[0];
                array[0] = tmp;
            }
            numberShifts--;
            System.out.println(Arrays.toString(array));
        }
    }
}
