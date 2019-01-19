package hw1;

import java.util.Scanner;

public class Task1Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день");
        int day = sc.nextInt();
        System.out.println("Введите месяц");
        int month = sc.nextInt();
        System.out.println("Введите год");
        int year = sc.nextInt();
        nextday(day, month, year);
    }

    private static void nextday(int day, int month, int year) {
        int maxdays[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (day == maxdays[month - 1] && month != 12) {
            day = 1;
            month++;
        } else if (month == 12 && day == maxdays[11]) {
            day = 1;
            month = 1;
            year++;
        } else {
            day++;
        }
        format(day, month, year);
    }

    private static void format(int day, int month, int year) {
        System.out.println(day + "." + month + "." + year);
    }
}
