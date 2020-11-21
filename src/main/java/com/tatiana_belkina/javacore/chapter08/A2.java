package src.main.java.com.tatiana_belkina.javacore.chapter08;

// Использование super для преодоления сокрытия имени.
class A2 {
    int i;
}

// Создайте подкласс class A.
class B2 extends A2 {
    int i; // это i скрывает i в A

    B2(int a, int b) {
        super.i = a; // i в A
        i = b; // i в B
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}

class UseSuper2 {
    public static void main(String[] args) {
        B2 subOb = new B2(1, 2);

        subOb.show();
    }
}