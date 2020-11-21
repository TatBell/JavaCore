package src.main.java.com.tatiana_belkina.javacore.chapter08;

//Полная реализация BoxWeight.
class Box1 {
    private final double width;
    private final double height;
    private final double depth;

    // построить клон объекта
    Box1(Box1 ob) { // передать объект в конструктор
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //конструктор, используемый, когда указаны все размеры
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда размеры не указаны
    Box1() {
        width = -1;  // использовать -1
        height = -1; // для неинициализированного
        depth = -1;  // box
    }

    // конструктор, используемый при создании куба
    Box1(double len) {
        width = height = depth = len;
    }

    // объем
    double volume() {
        return width * height * depth;
    }
}

// BoxWeight теперь полностью реализует все конструкторы.
class BoxWeight1 extends Box1 {
    double weight; // вес box

    // построить клон объекта
    BoxWeight1(BoxWeight1 ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // конструктор, когда указаны все параметры
    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор суперкласса
        weight = m;
    }

    // конструктор, используемый, когда размеры не указаны
    BoxWeight1() {
        super();
        weight = -1;
    }

    // конструктор, используемый при создании куба
    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }


}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 mybox3 = new BoxWeight1(); // default
        BoxWeight1 mycube = new BoxWeight1(3, 2);
        BoxWeight1 myclone = new BoxWeight1(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1: " + vol);
        System.out.println("Вес mybox1: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2: " + vol);
        System.out.println("Вес  mybox2: " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 is " + vol);
        System.out.println("Вес  mybox3 is " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем  myclone: " + vol);
        System.out.println("Вес  myclone: " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем  mycube:" + vol);
        System.out.println("Вес mycube: " + mycube.weight);
        System.out.println();
    }
}

