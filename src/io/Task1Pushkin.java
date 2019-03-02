package io;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задан файл со стихотворением Александра Пушкина.
 * Определить частоту повторяемости всех букв в стихотворении,
 * игнорируя регистр. Вывести результат в файл в виде:
 * а - 15
 * б - 7
 */
public class Task1Pushkin {
    public static void main(String[] args) throws IOException {
        String regex = "[а-яА-Я]";
        List<String> strings = Files.readAllLines(Paths.get(Utils.RESOURCES, "file.txt"));
        for (String string : strings) {
            System.out.println(find(regex, string.toLowerCase()));
        }
    }

    static Map<String, Integer> find(String regex, String input) throws IOException {
        FileWriter writer = new FileWriter("file1.txt", true);
        Map<String, Integer> treeMap = new TreeMap<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String match = matcher.group();
            if (treeMap.containsKey(match)) {
                treeMap.put(match, treeMap.get(match) + 1);
            } else
                treeMap.put(match, 1);
        }
        writer.write(String.valueOf(treeMap));
        writer.flush();
        return treeMap;
    }
}
