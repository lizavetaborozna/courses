package procedural_cw.cw4;

import java.util.Arrays;

//Написать функцию, разбивающую строку на равные части по n символов и сохраняющую отдельные части в массив.
//        Вывести этот массив.
public class Task7 {
    public static void main(String[] args) {
        String str = "Helloo";
        printNewString(str);
    }

    private static void printNewString(String str) {
        int size = str.length() / 2;
        char[] array = str.toCharArray();
        System.out.println(array.length / 2);
        char[] arrayBegin = new char[str.length()];
        // char[] arrayEnd=new char[size];
        for (int i = 0; i <= (array.length - 1) / 2; i++) {
            arrayBegin[i] = array[i];
        }
        for (int i = array.length / 2; i <= array.length - 1; i++) {
            arrayBegin[i] = array[i];
        }
        System.out.println(Arrays.toString(arrayBegin));
    }
}
