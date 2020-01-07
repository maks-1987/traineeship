package net.broscorp.h_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class MyCoolList implements List {

    List list = new ArrayList();
    /*MyCoolList() {
        List list = new ArrayList();
    }*/


    /*public boolean add(Number e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }
    public E get(int index) {
        rangeCheck(index);

        return elementData(index);
    }
    public E remove(int index) {
        rangeCheck(index);

        modCount++;
        E oldValue = elementData(index);

        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index,
                    numMoved);
        elementData[--size] = null; // clear to let GC do its work

        return oldValue;
    }
    public boolean remove(Object o) {
        if (o == null) {
            for (int index = 0; index < size; index++)
                if (elementData[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                if (o.equals(elementData[index])) {
                    fastRemove(index);
                    return true;
                }
        }
        return false;
    }
    private void fastRemove(int index) {
        modCount++;
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index,
                    numMoved);
        elementData[--size] = null; // clear to let GC do its work
    }*/


    public void add(Object o) {
        list.add(o);
    }

    public Object get(int index) {
        get(index);
        return this;
    }

    public Object remove(int index) {
        remove(index);
        return this;
    }

    public Object map(Function f) {
        throw new NotImplementedException();
    }

}
