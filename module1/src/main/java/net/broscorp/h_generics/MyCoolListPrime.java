package net.broscorp.h_generics;

import java.util.Arrays;
import java.util.function.Function;

public class MyCoolListPrime<E> {
    private static final int DEFAULT_CAPACITY = 5; // начальный размер списка
    private static Object[] EMPTY_DATA = {};
    private Object[] elements; // Буфер массива, в котором хранятся элементы MyCoolListPrime
    private int size;

    MyCoolListPrime() {
        this.elements = EMPTY_DATA;
    }

    void add(E e) {
        int minCapacity = size + 1;
        if (minCapacity - elements.length > 0)
            grow(minCapacity);
        elements[size] = e;
        size++;
    }

    private void grow(int minCapacity) {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity + DEFAULT_CAPACITY;
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        elements = Arrays.copyOf(elements, newCapacity);
    }

    Object get(int index) throws ArrayIndexOutOfBoundsException {
        try {
            return elements[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Incorrect index: " + index;
        }
    }

    void remove(int index) {
        try {
            if (index >= size) {
                throw new IndexOutOfBoundsException();
            } else {
                int numMoved = size - index - 1;
                if (numMoved > 0)
                    System.arraycopy(elements, index + 1, elements, index,
                            numMoved);
                elements[--size] = null;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Limit index empty: " + index);
        }
    }

    public Object map(Function f) { // Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R:
        //f=Arrays.stream(elements).map(a->elements).toArray();
        Function<Object[], Number> convert = o-> (Number) new Object();
        //convert.apply(elements);
        //convert.apply(elements);
        return convert.apply(elements);
        //return null;
    }

    @Override
    public String toString() {
        trimToSize();
        return "MyCoolListPrime{" + "elementData=" + Arrays.toString(elements) + '}';
    }

    private void trimToSize() {
        if (size < elements.length) {
            elements = (size == 0) ? EMPTY_DATA : Arrays.copyOf(elements, size);
        }
    }
}