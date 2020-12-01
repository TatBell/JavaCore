package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09;

import src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09.MyPack.Balance1;

public class TestBalance {
    public static void main(String[] args) {

    /* Because Balance is public, you may use Balance
       class and call its constructor. */
        Balance1 test = new Balance1("J. J. Jaspers", 99.88);

        test.show(); // you may also call show()
    }
}