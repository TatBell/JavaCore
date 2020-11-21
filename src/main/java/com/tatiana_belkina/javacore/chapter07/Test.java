package src.main.java.com.tatiana_belkina.javacore.chapter07;


class Test {
    int a, b;

    //для инициализации объекта без параметров в классе CallByValue
    Test() {

    }
    //для инициализации объекта в классе RetOb
    Test(int i) {
        a = i;
    }
    //для инициализации объекта в классах PassOb, PassObjRef
    Test(int i, int j) {
        a = i;
        b = j;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    // Передаем объект.
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    // вернуть true, если o равно вызывающему объекту
    boolean equalTo(Test o) {
        return (o.a == a && o.b == b);
    }

    // Возвращаем объект.
    Test incrByTen() {
        Test temp = new Test(a+10);
        return temp;
    }
}



// Объекты могут быть переданы в методы.
class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));

        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));

        Test ob4 = new Test();
        ob4.meth(15, 20);
        System.out.println("а и б перед вызовом метода: " +
                ob4.a + " " + ob4.b);
    }
}

// Простые типы передаются по значению.
class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;

        System.out.println("а и б перед вызовом метода: " +
                a + " " + b);

        ob.meth(a, b);

        System.out.println("a и b после вызова метода: " +
                a + " " + b);
    }
}

// Объекты передаются через их ссылки.

class PassObjRef {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);

        System.out.println("ob.a и ob.b перед вызовом метода: " +
                ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("a и b после вызова метода: " +
                ob.a + " " + ob.b);
    }
}

class RetOb {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;
        /*Возвращаем объект.
        Test incrByTen() {
            Test temp = new Test(a+10);
            return temp;
        }*/
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения: "
                + ob2.a);
    }
}


