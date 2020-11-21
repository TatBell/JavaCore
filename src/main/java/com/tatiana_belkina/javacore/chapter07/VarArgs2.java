package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Используйте varargs со стандартными аргументами.
class VarArgs2 {

    // Здесь msg - нормальный параметр, а v -
    // параметр varargs.
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length +
                " Содержание: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("Один vararg: ", 10);
        vaTest("Три varargs: ", 1, 2, 3);
        vaTest("Нет varargs: ");
    }
}