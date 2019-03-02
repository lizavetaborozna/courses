package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Создать программно и заполнить файл случайными целыми числами.
 * Отсортировать содержимое файла по возрастанию.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        int k = 10;
        List<Integer> list = new ArrayList<>(k);
        Random rn = new Random();
        while (list.size() != k) {
            int number = rn.nextInt(10) + 1;
            list.add(number);
        }
        list.sort(Comparator.naturalOrder());
        try (FileWriter writer = new FileWriter("E:\\ courses\\src\\io\\numbers.txt", false)) {
            for (int i = 0; i <= list.size() - 1; i++) {
                writer.write(Integer.parseInt(String.valueOf(list.get(i))));
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
