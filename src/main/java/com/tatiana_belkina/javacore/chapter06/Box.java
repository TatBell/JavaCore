package src.main.java.com.tatiana_belkina.javacore.chapter06;

import java.util.Objects;

public class Box {
    double width;
    double height;
    double depth;

    // отображать объем коробки
    void volume() {
        System.out.print("объем: ");
        System.out.println(width * height * depth);
    }



    // вычислить и вернуть объем
    double volume1() {
        return width * height * depth;
    }

    // устанавливает размеры коробки
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    /* Здесь Box использует конструктор для инициализации
   размеров ящика.
*/
    // Это конструктор для Box.
    public Box() {
        System.out.println("Конструктор Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // Это конструктор для Box.
    /*Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }*/

    // Избыточное использование this.
   /* Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }*/

    // Используйте это для разрешения конфликтов пространства имен.
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

}
