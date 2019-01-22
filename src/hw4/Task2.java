package hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в римском формате");
        String str = sc.nextLine();
        System.out.println(translatingArabic(str));
    }

    private static int translatingArabic(String str) {
        char[] chars = str.toCharArray();
        int number = 0;
        int i = 0;
        while (i <= chars.length - 1) {
            switch (chars[i]) {
                case 'I':
                    if (i + 1 < chars.length && (chars[i + 1] == 'V' || chars[i + 1] == 'X' || chars[i + 1] == 'C'))
                        number -= 1;
                    else number += 1;
                    i++;
                    break;
                case 'V':
                    number += 5;
                    i++;
                    break;
                case 'X':
                    if (i + 1 < chars.length && (chars[i + 1] == 'L' || chars[i + 1] == 'C' || chars[i + 1] == 'M'))
                        number -= 10;
                    else number += 10;
                    i++;
                    break;
                case 'L':
                    number += 50;
                    i++;
                    break;
                case 'C':
                    if (i + 1 < chars.length && (chars[i + 1] == 'D' || chars[i + 1] == 'M'))
                        number -= 100;
                    else number += 100;
                    i++;
                    break;
                case 'D':
                    number += 500;
                    i++;
                    break;
                case 'M':
                    number += 1000;
                    i++;
                    break;
                default:
                    return -1;

            }
        }
        if (number > 3999) {
            System.out.println("Число больше чем 3999");
        }
        return number;
    }
}
