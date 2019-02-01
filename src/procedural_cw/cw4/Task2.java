package procedural_cw.cw4;

//Заменить все грустные смайлы :( в строке на весёлые :)

public class Task2 {
    public static void main(String[] args) {
        String str=" hello :c my world :c";
        printPositiveSmile(str);
    }

    private static void printPositiveSmile(String str) {
        String result = str.replaceAll(":c", ":)");
        System.out.println(result);
    }
}
