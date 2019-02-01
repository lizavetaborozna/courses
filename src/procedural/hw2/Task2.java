package procedural.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
         printFibonachi(n);
    }

    private static void printFibonachi(int n) {
        int f0 = 0;
        int f1 = 1;
        int n2=0;
        System.out.println("Ряд Фибоначчи");
        System.out.println(f0);
        System.out.println(f1);
        while (n2 < n){
            System.out.println(n2);
            n2 = f0 + f1;
            f0 = f1;
            f1 = n2;
        }

    }
}
