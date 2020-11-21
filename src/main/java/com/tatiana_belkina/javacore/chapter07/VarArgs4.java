package src.main.java.com.tatiana_belkina.javacore.chapter07;

// перегрузка и двусмысленность.
//// Эта программа содержит ошибку и не будет компилировать!
class VarArgs4 {

    static void vaTest(int ... v) {
        System.out.print("vaTest(Integer ...): " +
                "Номер args: " + v.length +
                " Содержание: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...) " +
                "Номер args: " + v.length +
                " Содержание: ");

        for(boolean x : v)
            System.out.print(x + " ");

        System.out.println();
    }


    public static void main(String[] args)
    {
        vaTest(1, 2, 3);  // OK
        vaTest(true, false, false); // OK

        //vaTest(); // Ошибка: неоднозначно!
    }
}