package procedural.hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        String str=sc.nextLine();
        searchSum(n);
        sayHello(str);
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


    public static String sayHello(String str)  {
        str.replaceAll(" ","");
        System.out.println(str);
        return str;
    }
}
