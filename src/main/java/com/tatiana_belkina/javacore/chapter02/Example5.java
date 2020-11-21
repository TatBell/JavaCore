package src.main.java.com.tatiana_belkina.javacore.chapter02;

/*
  Продемонстрировать применение блока кода.

  Присвоить исходному файлу имя "BlockTest.java"
*/
class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        // адресатом этого оператора цикла служит блок код
        for (x = 0; x < 10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение y: " + y);
            y = y - 2;
        }
    }
}