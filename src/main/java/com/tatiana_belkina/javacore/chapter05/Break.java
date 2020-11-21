package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Использование break  как цивилизованной формы goto.
class Break {
    public static void main(String[] args) {
        boolean t = true;

        first: {
            second: {
                third: {
                    System.out.println("До break.");
                    if(t) break second; // break out of second block
                    System.out.println("Это не будет выполнено");
                }
                System.out.println("Это не будет выполнено");
            }
            System.out.println("После second block.");
        }
    }
}
