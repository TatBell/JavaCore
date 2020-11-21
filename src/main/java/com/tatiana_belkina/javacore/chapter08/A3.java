package src.main.java.com.tatiana_belkina.javacore.chapter08;

// Продемонстрировать вызов конструкторов.

// Создать super class.
class A3 {
    A3() {
        System.out.println("Внутри конструктора A.");
    }
}

// Создать subclass by extending class A.
class B3 extends A3 {
    B3() {
        System.out.println("Внутри конструктора B.");
    }
}

// Создать другой subclass by extending B.
class C3 extends B3 {
    C3() {
        System.out.println("Внутри конструктора C.");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C3 c = new C3();
    }
}