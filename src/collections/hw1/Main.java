package collections.hw1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (Integer max : new PairIterarable(Arrays.asList(new Pair<>(1, 2), new Pair<>(3, 2), new Pair<>(1, 5)))) {
            System.out.print(max + " ");
        }
    }
}
