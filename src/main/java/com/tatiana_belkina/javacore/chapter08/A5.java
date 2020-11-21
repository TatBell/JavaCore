package src.main.java.com.tatiana_belkina.javacore.chapter08;

// Методы с разными сигнатурами типов перегружены - не переопределены.
class A5 {
    int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }

    // показать i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

// Создать subclass by extending class A.
class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // перегрузка show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override5 {
    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);

        subOb.show("это k: "); // вызов show() в B
        subOb.show(); // вызов show() в A
    }
}