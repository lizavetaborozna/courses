package hw2;

import java.util.Scanner;

public class Task2Rec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        int f0 = 0;
        int f1 = 1;
        System.out.println("Ряд Фибоначчи");
        System.out.println(f0);
        recursia(f0,f1,n);
    }
    private static void recursia(int f0, int f1,int n) {
        System.out.println(f1);
         int n2 = f0 + f1;
        if (n2 < n) {
            recursia(f1,n2,n);
        }

    }
}
