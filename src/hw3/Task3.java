package hw3;

import java.util.Arrays;

/////////////////////////////////////////////////не готов,просто трэш какой-то
public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5};
        int[] array1 = new int[]{2, 4, 6, 7, 8};
        newarray(array, array1);
    }

    private static void newarray(int[] array, int[] array1) {
        int size = array.length + array1.length;
        int[] newarray = new int[size];
        int countarray = 0;
        int countarray1 = 0;
        for (int i = 0, k = 0; i < findMinLength(array, array1) * 2; i++, k++) {
            if (i % 2 == 0 && countarray != 0) {
                i--;
                newarray[k] = array[i];
                countarray++;
                i++;

            } else if (i % 2 != 0) {
                i--;
                newarray[k] = array1[i];
                countarray1++;
                i++;
            } else {
                newarray[k] = array[i];
                countarray1++;
            }
            System.out.println(Arrays.toString(newarray));
        }
    }

    private static int findMinLength(int[] array, int[] array1) {
        if (array.length < array1.length) {
            return array.length;
        } else {
            return array1.length;
        }
    }
}