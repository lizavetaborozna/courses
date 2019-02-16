package generics;


public class Main {
    public static void main(String[] args) {
        Pair<Integer> val1 = new Pair<>(2, 56);
        Pair<Integer> val2 = new Pair<>(34, 3);
        System.out.println(val1.getMax());
        System.out.println(val2.getMin());
    }
}
