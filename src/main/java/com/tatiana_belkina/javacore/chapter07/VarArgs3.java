package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Varargs  и перегрузка.
class VarArgs3 {

    static void vaTest(int... v) {
        System.out.print("vaTest(int ...): " +
                "Номер of args: " + v.length +
                " Содержание: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ...) " +
                "Номер args: " + v.length +
                " Содержание: ");

        for (boolean x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String, int ...): " +
                msg + v.length +
                " Содержание: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Тест: ", 10, 20);
        vaTest(true, false, false);
    }
}