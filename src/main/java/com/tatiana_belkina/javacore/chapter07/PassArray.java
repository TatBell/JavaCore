package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Используйте массив для передачи переменного числа
//// аргументы метода.
class PassArray {
    static void vaTest(int[] v) {
        System.out.print("Номер args: " + v.length +
                " Содержание: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        // Обратите внимание, как нужно создать массив, чтобы
        // сохранить аргументы.
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};

        vaTest(n1); // 1 arg
        vaTest(n2); // 3 args
        vaTest(n3); // no args
    }
}
