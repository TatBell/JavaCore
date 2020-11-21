package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Здесь Box позволяет одному объекту инициализировать другой.

class Box1 {
    double width;
    double height;
    double depth;

    // построить клон объекта
    Box1(Box1 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый, когда указаны все размеры
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда не указаны размеры
    Box1() {
        width = -1;  // использовать -1
        height = -1; // для неинициализированного
        depth = -1;  // box
    }

    // конструктор, используемый при создании куба
    Box1(double len) {
        width = height = depth = len;
    }

    // вычислить и вернуть объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons1 {
    public static void main(String[] args) {
        // Создать boxes используя разные конструкторы
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        Box1 myclone = new Box1(mybox1);

        double vol;

        // получить объем первого box
        vol = mybox1.volume();
        System.out.println("объем mybox1: " + vol);

        // получить объем второго box box
        vol = mybox2.volume();
        System.out.println("объем mybox2: " + vol);

        // олучить объем куба box
        vol = mycube.volume();
        System.out.println("объем cube: " + vol);

        // олучить объем box-clone
        vol = myclone.volume();
        System.out.println("объем clone " + vol);
    }
}