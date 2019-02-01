package procedural_cw.cw3;

//Определить сумму элементов целочисленного массива, расположенных между минимальным и максимальным значениями.

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 8, 4, 0, 7, 2, 3,9};
        findMinMax(array);
    }

    private static void findMinMax(int [] array) {
        int max=array[0];
        int min=array[0];
        int i = 0;
        int indexMax=0;
        int indexMin=0;
        int sum=0;
        while (i<array.length-1) {
            if(max<array[i+1]){
                max=array[i+1];
                 indexMax=i+1;
            }
            if(min>array[i+1]){
                min=array[i+1];
                indexMin=i+1;
            }
            i++;
        }
        for(i=indexMin;i<indexMax;++i){
            sum+=array[i];
        }
        System.out.println(indexMax);
        System.out.println(indexMin);
        System.out.println(" Максимальный элемент "+ max);
        System.out.println(" Минимальный элемент "+ min);
        System.out.println("Сумма "+ sum);
    }
}
