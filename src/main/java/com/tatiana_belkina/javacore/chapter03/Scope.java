package src.main.java.com.tatiana_belkina.javacore.chapter03;

// Продемонстрировать область действия блока кода
class Scope {
    public static void main(String[] args) {
        int x; // эта переменная доступна всему коду из метода main

        x = 10;
        if (x == 10) { // начало новой области действия
            int y = 20; // доступна только этой области кода

            // обе переменные x и y both доступны в этой области кода.
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Ошибка! переменная y не доступна
                    // в этой области кода, тогда как
                    // переменная x доступна и здесь
        System.out.println("x равно " + x);
    }
}
