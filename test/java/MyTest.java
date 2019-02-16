import exceptions_cw.MyException;
import generics.Pair;
import io_cw.Utils;
import oop_cw.cw5.Time;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class MyTest {

    @Test
    public void arraySizeTest() {
        List<Integer> ints = Arrays.asList(6, 3, 4, 5, 1);
        ArrayList<Integer> arrayList = new ArrayList<>(ints);
        arrayList.add(6);
        Assert.assertEquals(6, arrayList.size());
    }

    @Test(timeout = 15)
    public void timeTest() {
        Time time = new Time(2, 15, 15);
        Time time1 = new Time(2, 15, 15);
        Assert.assertNotEquals(time1, time);
    }

    @Test
    public void pairExpectedTest() {
        Pair<Integer> val1 = new Pair<>(2, 56);
        Pair<Integer> val2 = new Pair<>(34, 3);
        Assert.assertEquals(56, (long) val1.getMax());
        Assert.assertEquals(3, (long) val2.getMin());
    }

    @Test
    public void arrayHasSizeTest() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Assert.assertThat(list, Matchers.hasSize(3));
    }

    @Test
    public void arrayListHasItemTest() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Assert.assertThat(list, Matchers.hasItem(4));
    }

    @Test(expected = MyException.class)
    public void expectedExceptionTest() throws MyException {
        throw new MyException();
    }

    @Test
    public void isFile() throws IOException {
        List<String> strings = Files.readAllLines(Paths.get(Utils.RESOURCES, "file.txt"));
        Assert.assertNotNull(strings);

    }
}
