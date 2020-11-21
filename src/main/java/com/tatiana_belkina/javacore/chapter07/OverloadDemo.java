package src.main.java.com.tatiana_belkina.javacore.chapter07;

//Продемонстрируйте перегрузку метода.
class OverloadDemo {
    void test() {
        System.out.println("Без параметров");
    }

    //  integer параметр.
    void test(int a) {
        System.out.println("int a: " + a);
    }

    // два integer параметр.
    void test(int a, int b) {
        System.out.println("int a и int b: " + a + " " + b);
    }

    // double parameter
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        // вызвать все версии test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Результат ob.test(123.25): " + result);
    }
}
