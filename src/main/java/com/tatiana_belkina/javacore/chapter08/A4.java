package src.main.java.com.tatiana_belkina.javacore.chapter08;

// Переопределение метода.
class A4 {
    int i, j;

    A4(int a, int b) {
        i = a;
        j = b;
    }

    // показать i и j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // показать k -- переопределение show() в A


    /*void show() {
            System.out.println("k: " + k);
    }*/

    void show() {
        super.show(); // вызов A show()
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        B4 subOb = new B4(1, 2, 3);

        subOb.show(); // вызов show() в B
    }
}
