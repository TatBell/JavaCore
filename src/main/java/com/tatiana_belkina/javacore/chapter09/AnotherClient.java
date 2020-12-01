package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09;

// Another имплементирует Callback.
class AnotherClient implements Callback {

    public void callback(int p) {
        System.out.println("Another метод callback");
        System.out.println("p в квадрате " + (p * p));
    }
}

class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob; // теперь переменная ссылается на AnotherClient object
        c.callback(42);
    }
}

