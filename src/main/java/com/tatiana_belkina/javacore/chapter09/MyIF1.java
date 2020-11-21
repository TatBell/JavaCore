package src.main.java.com.tatiana_belkina.javacore.chapter09;

public interface MyIF1 {
    // Это «обычное» объявление метода интерфейса.
    // Он НЕ определяет реализацию по умолчанию.
    int getNumber();

    // Это метод по умолчанию. Обратите внимание, что он предоставляет
    // реализация по умолчанию.
    default String getString() {
        return "Default String";
    }

    // Это метод статического интерфейса.
    static int getDefaultNumber() {
        return 0;
    }
}