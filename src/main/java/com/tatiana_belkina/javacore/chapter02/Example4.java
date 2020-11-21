package src.main.java.com.tatiana_belkina.javacore.chapter02;

/*
  Продемонстрировать цикл for.

  Присвоить исходному файлу имя "ForTest.java".
*/
class ForTest {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 10; x = x + 1)
            System.out.println("Значение x: " + x);
    }
}
