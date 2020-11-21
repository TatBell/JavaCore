package src.main.java.com.tatiana_belkina.javacore.chapter05;

// return.
class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("До return.");

        if (t) return;

        System.out.println("Это не будет выполнено.");
    }
}

