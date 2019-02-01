package procedural.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество дней");
        int kolday = sc.nextInt();
        printPrecipitationByDays(kolday);
    }

    private static void printPrecipitationByDays(int kolday) {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        double maxPrecipitation=0;
        for (int i = 1; i <= kolday; ++i) {
            System.out.println("Введите величину осадков в " + i + "-й день");
            double precipitation = sc.nextInt();
            if(precipitation>maxPrecipitation){
                maxPrecipitation=precipitation;
            }
             sum+=precipitation;
        }
        double averagePrecipitation=sum/kolday;
        System.out.println("Количество дней: " + kolday);
        System.out.println("Сумма осадков равна "+ sum);
        System.out.println("Среднее количество осадков за данный период "+ averagePrecipitation);
        System.out.println("Максимальное количество осадков за этот период "+ maxPrecipitation);
    }
}
