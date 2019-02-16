package collections.hw1;

import collections.hw1.Pair;

import java.util.Iterator;
import java.util.List;

public class PairMaxIterator implements Iterator<Integer> {

    public PairMaxIterator(List<Pair<Integer>> ints) {
        this.ints = ints;
    }

    List<Pair<Integer>> ints;
    int counter = 0;


    @Override
    public boolean hasNext() {
        return counter < ints.size();
    }

    @Override
    public Integer next() {
        return ints.get(counter++).getMax();
    }

    @Override
    public void remove() {

    }
}
