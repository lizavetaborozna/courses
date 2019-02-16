package collections.hw1;

import java.util.Iterator;
import java.util.List;

public class PairIterarable implements Iterable<Integer> {


    List<Pair<Integer>> ints;

    public PairIterarable(List<Pair<Integer>> ints) {
        this.ints = ints;
    }

    @Override
    public Iterator<Integer> iterator() {

        return new PairMaxIterator(ints);
    }
}
