package src.main.java.com.tatiana_belkina.javacore.chapter03;

// Вычислить площадь круга.
class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; // радиус круга
        pi = 3.1416; // приблизительное значение числа pi
        a = pi * r * r; // ыычислить площадь круга

        System.out.println("Площадь круга равна " + a);
    }
}
