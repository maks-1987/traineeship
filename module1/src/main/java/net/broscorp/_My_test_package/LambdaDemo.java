package net.broscorp._My_test_package;

interface A {
    void show(int i);
}

class XYZ implements A {
    @Override
    public void show(int i) {
        System.out.println("Simple realisation " + i);
    }
}

public class LambdaDemo {
    public static void main(String[] args) {
        /** реализация обычная */
        A objXYZ = new XYZ();
        objXYZ.show(4);

        /** реализация анонимным классом */
        A obj1 = new A() {
            public void show(int i1) {
                System.out.println("Anonim class " + i1);
            }
        };
        obj1.show(4);

        /** реализ через лямбду */
        A obj2 = i2 -> {
            System.out.println("Lambda " + i2);
        };
        obj2.show(4);
    }
}

