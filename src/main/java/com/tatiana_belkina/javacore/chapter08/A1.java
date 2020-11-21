package src.main.java.com.tatiana_belkina.javacore.chapter08;

/* В иерархии классов private члены остаются
   недоступными для  класса-наследника.

   Эта программа содержит ошибку и не может
   компилироваться.
*/

// Создать superclass.
class A1 {
    int i; // default
    private int j; // private переменная A1

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// j не доступен здесь.
class B1 extends A1 {
    int total;

    void sum() {
        //total = i + j; // ERROR, j не доступен здесь
    }
}

class Access {
    public static void main(String[] args) {
        B subOb = new B();

        //subOb.setij(10, 12);

        subOb.sum();
        //System.out.println("Total is " + subOb.total);
    }
}