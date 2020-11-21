package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Цикл for.
class ForTick {
    public static void main(String[] args) {
        int n;
        for (n = 10; n > 0; n--)
            System.out.println("такт " + n);

        // объявить переменную в цикле for
        for (int m = 10; m > 0; m--)
            System.out.println("tick " + m);
    }
}

