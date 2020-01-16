package net.broscorp.h_generics;

public class TestMyCoolListt {
    public static void main(String[] args) {
        MyCoolListPrime<Integer> myCoolList = new MyCoolListPrime<>();
        System.out.println(myCoolList);
        myCoolList.add(-5);
        myCoolList.add(6);
        myCoolList.add(9);
        myCoolList.add(4);
        myCoolList.add(5);
        myCoolList.add(0);
        myCoolList.add(99);
        myCoolList.add(-77);
        System.out.println(myCoolList);
        myCoolList.remove(0);
        System.out.println(myCoolList);
        myCoolList.remove(5);
        myCoolList.remove(9);
        System.out.println(myCoolList);
        System.out.println(myCoolList.get(0));
        System.out.println(myCoolList.get(10));
        System.out.println(myCoolList.get(4));
        System.out.println(myCoolList);
        myCoolList.map(myCoolList);

    }
}
