package collections.hw2.task1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Задан текст на английском языке. Выделить все различные слова.
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 * Воспользуйтесь для этой цели классом TreeMap<String, Integer>.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findFrequency(str);
    }

    private static void findFrequency(String str) {
        Map<String, Integer> treeMap = new TreeMap<>();
        for (String word : str.split("\\s+")) {
            if (treeMap.containsKey(word)) {
                treeMap.put(word, treeMap.get(word) + 1);
            } else
                treeMap.put(word, 1);
        }
        System.out.println(treeMap);
    }
}
