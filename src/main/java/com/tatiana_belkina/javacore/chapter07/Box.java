package src.main.java.com.tatiana_belkina.javacore.chapter07;

class Box {
    double width;
    double height;
    double depth;

    // конструктор, используемый, когда указаны все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда не указаны размеры
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

class OverloadCons {
    public static void main(String[] args) {
        // Создать boxes используя разные конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // получить объем первого box
        vol = mybox1.volume();
        System.out.println("объем mybox1 is " + vol);

        // получить объем второго box box
        vol = mybox2.volume();
        System.out.println("объем mybox2 is " + vol);

        // получить объем куба box
        vol = mycube.volume();
        System.out.println("объем mycube is " + vol);
    }
}
