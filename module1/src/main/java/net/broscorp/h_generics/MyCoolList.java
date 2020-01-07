package net.broscorp.h_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MyCoolList {

    List<Integer> list = new ArrayList<Integer>();

    public void add(Integer o) {
        list.add(o);
    }

    public Integer get(int index) {
        //list.get(index);
        return list.get(index);
    }

    public Integer remove(int index) {
        //list.remove(index);
        return list.remove(index);
    }

    public Object map(Function f) {
        throw new NotImplementedException();
    }

    @Override
    public String toString() {
        return "MyCoolList{" + "list=" + list + '}';
    }
}
