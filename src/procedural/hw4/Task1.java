package procedural.hw4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово");
        String str = sc.nextLine();
        TestPalindrom(str);
    }

    private static void TestPalindrom(String str) {
        char[] chars = str.toCharArray();
        String begin = new String();
        String end = new String();
        for (int i = 0; i <= chars.length - 1; i++) {
            begin += chars[i];
        }
        for (int k = chars.length - 1; k >= 0; k--) {
            end += chars[k];
        }
        if (begin.equals(end)) {
            System.out.println("Слово палиндром");
        } else {
            System.out.println("Слово не палиндром");
        }
    }
}
