package procedural_cw.cw4;

//Подсчитать количество всех точек, запятых и восклицательных знаков в строке.
public class Task6 {
    public static void main(String[] args) {
        String str = "hello.my,wor,l.d!,";
        sumDelimetr(str);
    }

    private static void sumDelimetr(String str) {
        char[] array = str.toCharArray();
        int counterForPoint = 0;
        int counterForComma = 0;
        int counterForExclamation = 0;
        char point = '.';
        char comma = ',';
        char exclamation = '!';
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] == point) {
                counterForPoint++;
            } else if (array[i] == comma) {
                counterForComma++;
            } else if (array[i] == exclamation) {
                counterForExclamation++;
            }
        }

        System.out.println("Количество точек равно " + counterForPoint);
        System.out.println("Количество запятых равно " + counterForComma);
        System.out.println("Количество воскл знаков равно " + counterForExclamation);

    }
}
