package src.main.java.com.tatiana_belkina.javacore.chapter08;

// Extend BoxWeight2 включить стоимость доставки.

// Box2.
class Box2 {
    private final double width;
    private final double height;
    private final double depth;

    //clone
    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый, когда указаны все размеры
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда размеры не указаны
    Box2() {
        width = -1;  // использовать -1
        height = -1; // для неинициализированного
        depth = -1;  // box
    }

    // конструктор, используемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }

    // объем
    double volume() {
        return width * height * depth;
    }
}

// добавить weight.
class BoxWeight2 extends Box2 {
    double weight; // вес box

    // clone
    BoxWeight2(BoxWeight2 ob) {
        super(ob);
        weight = ob.weight;
    }

    // конструктор, когда указаны все параметры
    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d); // вызов конструктора superclass
        weight = m;
    }

    // конструктор, используемый, когда размеры не указаны
    BoxWeight2() {
        super();
        weight = -1;
    }

    // конструктор, используемый при создании куба
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

// Добавить стоимость доставки
class Shipment extends BoxWeight2 {
    double cost;

    // clone
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // конструктор, когда указаны все параметры
    Shipment(double w, double h, double d,
             double m, double c) {
        super(w, h, d, m); // вызов конструктора superclass
        cost = c;
    }

    // конструктор, используемый, когда размеры не указаны
    Shipment() {
        super();
        cost = -1;
    }
    // конструктор, используемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 =
                new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =
                new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipment1: " + vol);
        System.out.println("Вес shipment1: "
                + shipment1.weight);
        System.out.println("Стоимость доставки: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipment2: " + vol);
        System.out.println("Вес shipment2: "
                + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
    }
}
