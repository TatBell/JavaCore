package src.main.java.com.tatiana_belkina.javacore.chapter05;

public class DoWhile {
    // Продемонстрировать применение цикла do while

    public static void main(String[] args) {
        int n = 10;

        do{
            System.out.println("tick " + n);
            n--;
        } while (n > 0);

    }
}
