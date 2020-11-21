package src.main.java.com.tatiana_belkina.javacore.chapter09.p1;

public class Protection {
    int n = 1;
    private final int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection() {
        System.out.println("базовый constructor");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class Derived extends Protection {
    Derived() {
        System.out.println("constructor подкласса");
        System.out.println("n = " + n);

//  class only
//  System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("constructor подкласса");
        System.out.println("n = " + p.n);

//  class only
//  System.out.println("n_pri = " + p.n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}

// Создайте экземпляры различных классов d p1.
class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}