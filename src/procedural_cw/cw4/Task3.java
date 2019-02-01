package procedural_cw.cw4;

//Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и заканчивается этим словом.

public class Task3 {
    public static void main(String[] args) {
        String str="aga hello aga";
        String str1="aga";
        System.out.println( printString(str,str1));

    }

    private static boolean printString(String str, String str1) {
  if(str.startsWith(str1)&& str.endsWith(str1)){
      return true;
  }
  else return false;
    }
}
