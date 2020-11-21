package src.main.java.com.tatiana_belkina.javacore.chapter09;

abstract class Incomplete implements Callback {
    int a, b;
    void show() {
        System.out.println(a + " " + b);
    }
    // ...
}