package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Использование break для выхода из вложенного цикла.
class BreakLoop3 {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
            for(int j=0; j<100; j++) {
                if(j == 10) break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Цикл завершен.");
    }
}