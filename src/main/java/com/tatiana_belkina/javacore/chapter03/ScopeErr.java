package src.main.java.com.tatiana_belkina.javacore.chapter03;

// Эта программа не скомпилируется
class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {              // создается новая область действия
            //int bar = 2; // Ошибка во время компиляции -
            // bar переменная уже определена
        }
    }
}
