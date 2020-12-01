package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09.MyPack;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        if (bal < 0)
            System.out.print("-->> ");
        System.out.println(name + ": $" + bal);
    }
}