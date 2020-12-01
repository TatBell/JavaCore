package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09;

interface IntStack1 {

    void push(int item);

    int pop();

    // Поскольку clear () имеет значение по умолчанию, это не обязательно
    // реализуется уже существующим классом, который использует IntStack.
    default void clear() {
        System.out.println("clear");
        //throw UnsupportedOperationException;
    }


}