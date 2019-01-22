package hw3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        linearize(array);
    }

    private static void linearize(int[][] array) {
        int arraysize = array.length * 2;
        int k = 0;
        int odnomearray[] = new int[arraysize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                odnomearray[k] = array[i][j];
                k++;
            }
        }
        System.out.println(Arrays.toString(odnomearray));
    }
}
