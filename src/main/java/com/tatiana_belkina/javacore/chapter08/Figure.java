package src.main.java.com.tatiana_belkina.javacore.chapter08;

// Использование полиморфизма во время выполнения.
class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Площадь Figure не определена.");
        return 0;
    }
}

class Rectangle extends Figure {

    //конструктор на базе суперкласса
    Rectangle(double a, double b) {
        super(a, b);
    }

    // override. Площадь прямоугольника
    double area() {
        System.out.println("Площадь  прямоугольника.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    // override. Площадь прямоугольного треугольника
    double area() {
        System.out.println("Площадь треугольника.");
        return dim1 * dim2 / 2;
    }
}

class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figref;

        figref = r; // Figure r = new Restangle();
        System.out.println("Площадь: " + figref.area());

        figref = t; // Figure r = new Triangle();
        System.out.println("Площадь: " + figref.area());

        figref = f; // Figure r = new Figure();
        System.out.println("Площадь: " + figref.area());
    }
}

