package net.broscorp._My_test_package;

import java.util.Arrays;
import java.util.List;

public class LambdaTesting {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,7,3,4,5);

        //list.forEach(i -> System.out.println(i)); // идентичное написание ниже
        list.forEach(System.out::println);
    }
}
