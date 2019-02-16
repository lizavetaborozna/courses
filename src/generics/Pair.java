package generics;

/**
 * Реализуйте обобщенный класс Pair, позволяющий сохранять пару элемен­ тов типа Е.
 * Предоставьте методы доступа для получения первого и второго эле­ ментов
 */

/**
 * Видоизмените класс из предыдущего упражнения, введя методы mах() и min() для получения
 * наибольшего и наименьшего из двух элементов. Наложите соответствующее ограничение на обобщенный тип Е.
 */

public class Pair<E extends Comparable<E>> {
    private E first;
    private E second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public E getMax() {
        int i = first.compareTo(second);
        return i <= 0 ? second : first;
    }

    public E getMin() {
        int i = first.compareTo(second);
        return i <= 0 ? first : second;
    }
}
