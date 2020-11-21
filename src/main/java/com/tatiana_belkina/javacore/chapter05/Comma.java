package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Использовать запятую.
class Comma {
    public static void main(String[] args) {
        int a, b;

        for(a=1, b=4; a<b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}