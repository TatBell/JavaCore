package src.main.java.com.tatiana_belkina.javacore.chapter07;

// This program will not compile.
class Outer1 {
    int outer_x = 100;

    void test() {
        Inner1 inner = new Inner1();
        inner.display();

    }

    // Это innner class
    class Inner1 {
        int y = 10; // y это локальная переменная класса Inner
        void display() {
            System.out.println("показать: outer_x = " + outer_x);
        }
    }

    void showy() {
        //System.out.println(y); // ошибка, y здесь неизвестно!
    }
}

class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        outer.test();
    }
}
