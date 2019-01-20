package hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        searchSum(n);
    }

    private static void searchSum(int n) {
        String str = Integer.toString(n);
        String delimeter = "";
        String[] number = str.split(delimeter);
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            int k = Integer.parseInt(number[i]);
            sum += k;
        }
        System.out.println(sum);
    }
}
