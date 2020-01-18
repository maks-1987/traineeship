package net.broscorp.h_generics;

import java.util.Arrays;
import java.util.function.Function;

public class MyCoolListPrime<T extends Number> {
    private Object[] elements;
    private Object[] newArray;
    private final int DEFAULT_CAPACITY = 3;
    private int size;

    MyCoolListPrime() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    private void checkCapacity() {
        if (size >= elements.length) {
            grow();
        }
    }

    public boolean add(T o) {
        checkCapacity();
        elements[size++] = o;
        return true;
    }

    private void grow() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public T get(int index) {
        if (index > size - 1) {
            System.out.println("Array max index = " + size + ": requesing_" + index);
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        checkCapacity();
        int elemForCopy = elements.length - index - 1;
        if (index > size - 1) {
            System.out.println("Incorrect index: " + index);
            return;
        } else {
            System.arraycopy(elements, index + 1, elements, index, elemForCopy);
        }
        size--;
    }

    public MyCoolListPrime<? extends Number> map(Function<T, ? extends Number> f) {
        MyCoolListPrime<Number> myArrayList = new MyCoolListPrime<>();
        for (int i = 0; i < size; i++) {
            myArrayList.add(f.apply((T) elements[i]));
        }
        return myArrayList;
    }

    @Override
    public String toString() {
        trimToSize();
        return "MyArrayList{" + "elements=" + Arrays.toString(newArray) + '}';
    }

    private void trimToSize() {
        if (size <= elements.length) {
            newArray = (size == 0) ? new Object[0] : Arrays.copyOf(elements, size);
        }
    }
}