package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09;

// Пример вложенного интерфейса.

// Этот класс содержит интерфейс-член.
class A {
    // это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// B реализует вложенный интерфейс.
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDemo {
    public static void main(String args[]) {

        // использовать ссылку на вложенный интерфейс
        A.NestedIF nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("10 не отрицательное");
        if(nif.isNotNegative(-12))
            System.out.println("это не будет отображаться");
    }
}