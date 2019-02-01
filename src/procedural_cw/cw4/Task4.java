package procedural_cw.cw4;

//Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы в формате Ф.И.О.
//        Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String patronymic=sc.nextLine();
        String surname=sc.nextLine();
        printFIO(name,patronymic,surname);
    }

    private static void printFIO(String name, String patronymic, String surname) {
        StringBuilder sb= new StringBuilder();
        String point=".";
        StringBuilder result=sb.append(name.charAt(0)).append(point).append(patronymic.charAt(0)).append(point).append(surname.charAt(0)).append(point);
        String end=result.toString().toUpperCase();
        System.out.println(end);
    }
}
