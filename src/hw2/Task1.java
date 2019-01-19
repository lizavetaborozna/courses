package hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        sum(n);
    }

    private static void sum(int n) {
        String str = Integer.toString(n);
        String[] str1;
        String delimeter = "";
        str1 = str.split(delimeter);
        int m = 0;
        for (int i = 0; i < str1.length; i++) {
            int k = Integer.parseInt(str1[i]);
            m += k;
        }
        System.out.println(m);
    }
}
