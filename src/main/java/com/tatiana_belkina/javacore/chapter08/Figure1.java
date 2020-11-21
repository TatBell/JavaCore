package src.main.java.com.tatiana_belkina.javacore.chapter08;

// Использование абстрактных методов и классов.
abstract class Figure1 {
    double dim1;
    double dim2;

    Figure1(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // area теперь является абстрактным методом
    abstract double area();
}

class Rectangle1 extends Figure1 {
    Rectangle1(double a, double b) {
        super(a, b);
    }

    // override area для прямоугольника
    double area() {
        System.out.println("Площадь прямоугольника.");
        return dim1 * dim2;
    }
}

class Triangle1 extends Figure1 {
    Triangle1(double a, double b) {
        super(a, b);
    }

    // override area для прямоугольного треугольника
    double area() {
        System.out.println("Площадь треугольника.");
        return dim1 * dim2 / 2;
    }
}

class AbstractAreas {
    public static void main(String[] args) {
        // Figure f = new Figure(10, 10); // сейчас невыполнимо класс абстрактный
        Rectangle1 r = new Rectangle1(9, 5);
        Triangle1 t = new Triangle1(10, 8);

        Figure1 figref; // OK, объект не создается

        figref = r;
        System.out.println("Площадь: " + figref.area());

        figref = t;
        System.out.println("Площадь: " + figref.area());
    }
}