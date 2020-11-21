package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Продемонстрируйте аргументы переменной длины.
class VarArgs {

    // vaTest() использует vararg.
    static void vaTest(int... v) {
        System.out.print("Номер args: " + v.length +
                " Содержание: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {


        // vaTest() переменное количество аргументов.
        vaTest(10);      // 1 arg
        vaTest(1, 2, 3); // 3 args
        vaTest();        // no args
    }
}

