package procedural_cw.cw3;

/**
 * Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.
 */
public class task1 {
    public static void main(String[] args) {
//        int[] array=new int[]{1,2,3,4,5,6,7,8,9};
//        System.out.println(Arrays.toString(array));
//        System.out.println("-----------");
//        for(int i=array.length  -1;i>=0;--i) {
//            System.out.println(array[i]);
//        }
        int[] array = new int[100];
        printArray(array);
    }

    private static void printArray(int array[]) {
        int number = 1;
        int i = 0;
        while (i<array.length) {
            if (number % 13 == 0|| number%17==0) {
                array[i] = number;
                System.out.println(array[i]);
                i++;
            }
            number++;
        }
    }
}
