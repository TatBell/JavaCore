package src.main.java.com.tatiana_belkina.javacore.chapter09.p2;

import src.main.java.com.tatiana_belkina.javacore.chapter09.p1.Protection;

class Protection2 extends Protection {
    Protection2() {
        System.out.println("constructor, унаследованный из другого пакета");

//  только для данного класса или пакета
//  System.out.println("n = " + n);

//  только для данного класса
//  System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}

class OtherPackage {
    OtherPackage() {
        Protection p = new Protection();
        System.out.println("constructor, унаследованный из другого пакета");

//  только для данного класса или пакета
//  System.out.println("n = " + p.n);

//  только для данного класса
//  System.out.println("n_pri = " + p.n_pri);

//  только для данного класса, подкласса или пакета
//  System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}

// Создайте экземпляры различных классов в p2.
class Demo {
    public static void main(String[] args) {
        Protection2 ob1 = new Protection2();
        OtherPackage ob2 = new OtherPackage();
    }
}