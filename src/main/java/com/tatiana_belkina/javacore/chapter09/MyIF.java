package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09;

public interface MyIF {
    // Это «обычное» объявление метода интерфейса.
    // Он НЕ определяет реализацию по умолчанию.
    int getNumber();

    // Это метод по умолчанию. Обратите внимание, что он предоставляет
    // реализацию default - по умолчанию.
    default String getString() {
        return "Default String";
    }
}

class MyIFImp implements MyIF {
    // Необходимо реализовать только getNumber (), определенный MyIF.
    // getString () можно разрешить по умолчанию.
    public int getNumber() {
        return 100;
    }
}

// Use the default method.
class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj = new MyIFImp();

        // Можно вызвать getNumber (), потому что это явно
        // реализовано в MyIFImp:
        System.out.println(obj.getNumber());

        // Также может вызвать getString () по умолчанию
        // реализация:
        System.out.println(obj.getString());
    }
}

class MyIFImp2 implements MyIF {
    // Здесь представлены реализации как для getNumber (),
    // так и для getString ()..
    public int getNumber() {
        return 100;
    }

    public String getString() {
        return "Это другой метод String.";
    }
}
