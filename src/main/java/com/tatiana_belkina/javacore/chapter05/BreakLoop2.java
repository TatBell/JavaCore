package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Использование break для выхода из цикла.
class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;

        while(i < 100) {
            if(i == 10) break;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Цикл завершен.");
    }
}
