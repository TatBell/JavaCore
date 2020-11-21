package src.main.java.com.tatiana_belkina.javacore.chapter08;

// Эта программа использует  extend Box.
class Box {
    double width;
    double height;
    double depth;

    // построить клон объекта
    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый, когда указаны все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда размеры не указаны
    Box() {
        width = -1;  // использовать -1
        height = -1; // для неинициализированного
        depth = -1;  // box
    }

    // конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // вычислить и вернуть объем
    double volume() {
        return width * height * depth;
    }
}

// Здесь Box расширен, чтобы включить вес.
class BoxWeight extends Box {
    double weight; // вес box

    // конструктор BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1: " + vol);
        System.out.println("Вес mybox1: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2: " + vol);
        System.out.println("Вес mybox2: " + mybox2.weight);
    }
}

// Здесь Box расширен за счет включения цвета.
class ColorBox extends Box {
    int color; // цвет box

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}

class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox: " + vol);
        System.out.println("Вес weightbox: " + weightbox.weight);
        System.out.println();

        // передать ссылку BoxWeight ссылке Box
        plainbox = weightbox;

        vol = plainbox.volume(); // OK, volume() определено в Box
        System.out.println("Объем plainbox: " + vol);

    /* Следующее утверждение недействительно, поскольку plainbox
       не определяет весовой элемент. */
//  System.out.println("Вес plainbox: " + plainbox.weight);
    }
}
