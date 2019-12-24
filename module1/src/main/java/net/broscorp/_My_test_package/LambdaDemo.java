package net.broscorp._My_test_package;

interface A {
    void show();
}

class XYZ implements A {
    @Override
    public void show() {
        System.out.println("First");
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        /** реализация обычная */
        A objXYZ = new XYZ();
        objXYZ.show();
        /** реализация анонимным классом */
        A obj1 = new A() {
            public void show() {
                System.out.println("Two");
            }
        };
        /** реализ через лямбду */
        A obj2 = () -> {
            System.out.println("Lambda");
        };
    }
}

