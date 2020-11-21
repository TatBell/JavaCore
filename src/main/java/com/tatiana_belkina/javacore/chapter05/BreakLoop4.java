package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Использование break для выхода из вложенных циклов.
class BreakLoop4 {
    public static void main(String[] args) {
        outer: for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
            for(int j=0; j<100; j++) {
                if(j == 10) break outer; // выйти из обеих циклов
                System.out.print(j + " ");
            }
            System.out.println("Это не будет напечатано");
        }
        System.out.println("Цикл завершен");
    }
}