package src.main.java.com.tatiana_belkina.javacore.chapter08;

class A8 {
    final void meth() {
        System.out.println("Это final метод.");
    }
}

class B8 extends A8 {
    /*void meth() { // ERROR! Не override.
        System.out.println("Illegal!");
    }*/
}