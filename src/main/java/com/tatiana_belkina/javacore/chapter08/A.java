package src.main.java.com.tatiana_belkina.javacore.chapter08;

// Простой пример наследования.

// Создать superclass.
class A {
    int i, j;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// Создать subclass by extending class A.
class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // Суперкласс может использоваться сам по себе.
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержание superOb: ");
        superOb.showij();
        System.out.println();

    /* Подкласс имеет доступ ко всем публичным членам
       его суперкласс. */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержание subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Сумма i, j и k в subOb:");
        subOb.sum();
    }
}

