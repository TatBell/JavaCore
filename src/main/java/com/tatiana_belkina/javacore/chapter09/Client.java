package src.main.java.com.tatiana_belkina.javacore.chapter09;

public class Client implements Callback {
    @Override
    public void callback(int p) {
        System.out.println("callback вызываемый с параметром " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Классы, реализующие интерфейсы могут также определять других участников.");
    }

    public static void main(String[] args) {

        Callback c = new Client();
        c.callback(42);

    }
}
