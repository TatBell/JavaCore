package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Отдельные части оператора for могут остутствовать.
class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for (; !done; ) {
            System.out.println("i is " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}