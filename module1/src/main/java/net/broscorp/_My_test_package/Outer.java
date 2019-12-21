package net.broscorp._My_test_package;

public class Outer {

    Inner returnInnerLink() {
        return new Inner();
    }

    class Inner {

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.returnInnerLink(); // обращ к нестатич внутр-му классу
        //Inner inner = new Inner(); // ошиб компиляции!!!
    }
}
