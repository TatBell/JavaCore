package src.main.java.com.tatiana_belkina.javacore.chapter03;


// Вычислить расстояние, проходимое светом,
// используя переменные типа long

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;
        // приблизительная скорость света, миль в секунду

        lightSpeed = 186000;
        days = 1000; // указать количество дней
        seconds = 1000 * 24 * 60 * 60;
        distance = lightSpeed * seconds; // вычислить расстояние
        System.out.print("За" + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
