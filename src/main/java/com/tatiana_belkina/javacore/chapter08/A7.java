package src.main.java.com.tatiana_belkina.javacore.chapter08;

// Простая демонстрация абстрактного класса.
abstract class A7 {
    abstract void callme();

    // конкретные методы все еще разрешены в абстрактных классах
    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

class B7 extends A7 {
    void callme() {
        System.out.println("Реализация в классе В метода callme().");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B7 b = new B7();
        b.callmetoo();
        b.callme();

    }
}