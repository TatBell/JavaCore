package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Автоматическое преобразование типов применяются к перегрузке.
class OverloadDemo1 {
    void test() {
        System.out.println("Без параметров");
    }

    // два integer параметра.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    // double параметр и return тип
    void test(double a) {
        System.out.println("Внутреннее преобразование, если тип int test(double) a: " + a);
    }
}

class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);
        ob.test( 123.2);
    }
}