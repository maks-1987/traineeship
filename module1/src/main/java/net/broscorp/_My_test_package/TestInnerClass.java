package net.broscorp._My_test_package;

public class TestInnerClass {
    class Content {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    void ship(String destinat) {
        Content cont = new Content();
        Destination d = new Destination(destinat);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        TestInnerClass testInnerClass = new TestInnerClass();
        testInnerClass.ship("UA");
    }
}
