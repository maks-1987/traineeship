package net.broscorp.h_generics;

interface MyFunc {
    int func(int n);
}

interface StringFunc {
    String func(String s);
}

public class FuncInterfTest {
    public static void main(String[] args) {
        int num = 10; // действительно завершенная переменная (если она не изменяется в будующем)
        MyFunc myFunc = (n) -> {
            int v = num + n;
            //num++; // not allowed - "захват переменной"
            return v;
        };
    }

    static String stringReverse(String str) {
        String result = "";
        //int i;
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MystringOp {
    String stringReverse(String str) {
        StringBuilder result = new StringBuilder();
        //int i;
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}

class MethodRefDemo {
    // Первый параметр - функциональн интерф, т.е. можн передеть любой экземпляр этого интерф, включая и ссылку на метод
    static String stringOp(StringFunc sFunc, String s) {
        return sFunc.func(s);
    }

    public static void main(String[] args) {
        String inString = "Lambda";
        String outString;
        String outString2;
        // Тут ссылка на метод stringReverse() передается методу stringOp(), путем ссылок на статич методы (Джава 8)
        // Это реботает только если ссылка имеет тип функционального интерф StringFunc (интерф с одним методом)
        outString = stringOp(FuncInterfTest::stringReverse, inString);
        System.out.println("Исходная строка " + inString);
        System.out.println("Измененная строка " + outString);
        // Теперь ссылка на метод экземпляра stringReverse() передается методу stringOp(), путем ссылок на методы экземпляра
        MystringOp mystringOp = new MystringOp();
        outString2 = stringOp(mystringOp::stringReverse, inString);
        System.out.println("Исходная строка " + inString);
        System.out.println("Измененная строка " + outString2);
    }
}
