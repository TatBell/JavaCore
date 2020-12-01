package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09;

// Один интерфейс расширяет другой.
interface A10 {
    void meth1();
    void meth2();
}

// B включает meth1() и meth2() -- это добавляет meth3().
interface B10 extends A10 {
    void meth3();
}

// Этот класс должен реализовывать все A и B
class MyClass implements B10 {
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    public void meth2() {
        System.out.println("Implement meth2().");
    }

    public void meth3() {
        System.out.println("Implement meth3().");
    }
}

class IFExtend {
    public static void main(String[] arg) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}