package src.main.java.com.tatiana_belkina.javacore.chapter07;

/* Эта программа демонстрирует разницу между
   public и private.
*/
class Test1 {
    int a; // default(package)
    public int b; // public
    private int c; // private

    // методы доступа c:
    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

class AccessTest {
    public static void main(String[] args) {
        Test1 ob = new Test1();

        // a и b могут быть доступны напрямую
        ob.a = 10;
        ob.b = 20;

        // Это вызовет ошибку
//  ob.c = 100; // Ошибка!

        // Вы должны получить доступ к c через его методы
        ob.setc(100); // OK

        System.out.println("a, b, and c: " + ob.a + " " +
                ob.b + " " + ob.getc());
    }
}
