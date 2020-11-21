package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Продемонстрируйте inner class.
// При компиляции фрагмента кода, содержащего вложенные классы,
// компилятор создает для каждого из классов собственный файл байт-кода (*.class).
// Их имена составляются из имени внешнего класса и имени вложенного класса,
// соединенных знаком $.
// Например: Outer.class и Outer$Inner.class.
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // Это inner class
    class Inner {
        void display() {
            System.out.println("показать: outer_x = " + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
