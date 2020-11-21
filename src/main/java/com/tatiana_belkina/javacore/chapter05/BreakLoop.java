package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Использование break для выхода из цикла.
class BreakLoop {
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            if(i == 10) break; // завершить цикл, если 10
            System.out.println("i: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}