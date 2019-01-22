package hw3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 1, 3, 5, 6, 7, 9, 7, 8, 9};
        removeDuplicate(array);
    }

    private static int[] removeDuplicate(int[] array) {
        int[] tmp = new int[array.length];
        int i = 0, ind = 1, k = 0;
        boolean isRepeat = false;

        while (i < array.length) {
            isRepeat = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    ind = j;
                    tmp[k] = array[j];
                    isRepeat = true;
                }
            }
            if (!isRepeat)
                tmp[k] = array[i];
            else {
                i = ind;
                isRepeat = false;
            }
            i++;
            k++;
        }
        int[] arr = new int[k];

        for (int l = 0; l < k; l++)
            arr[l] = tmp[l];

        System.out.println(Arrays.toString(arr));

        return arr;
    }
}
