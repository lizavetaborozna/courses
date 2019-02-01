package procedural_cw.cw4;
//Заданы два массива строк. Написать функцию, определяющую, является ли содержимое этих массивов идентичным.
//        Порядок расположения элементов значения не имеет.

public class Task5 {
    public static void main(String[] args) {
        String[] str = new String[]{"A", "B", "Q","M"};
        String[] str1 = new String[]{"M", "B", "A","Q"};
        System.out.println(compareStrings(str, str1));
        testArgs(compareStrings(str, str1), true);
        testArgs(compareStrings( new String[]{""}, str1), true);



    }
    static void testArgs(boolean answer, boolean check){
        if(answer != check){
            System.err.println("!!!");
        }
    }

    private static boolean compareStrings(String[] str, String[] str1) {
        int count = 0;
        for (String st : str) {
            for (String st1 : str1) {
                if (st.equals(st1)) {
                    count++;
                }
                else{
                    continue;
                }
            }
        }
        if (count != str.length) {
            return false;
        }
        return true;
    }
}
