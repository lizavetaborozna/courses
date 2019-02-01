package procedural_cw.cw4;

//Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String,
//        второй с помощью StringBuilder и метода append.
//        Сравнить скорость их выполнения.

public class Task1 {
    public static void main(String[] args) {
        String str="string";
        String str1="string1";
        printSumString(str,str1);

    }

    private static void printSumString(String str, String str1) {
        StringBuilder sb= new StringBuilder();
        System.out.println(sb.append(str).append(str1));
    }
}
