package src.main.java.com.tatiana_belkina.javacore.chapter07;

//Простой пример рекурсии

public class
Factorial {
// это рекурсивная функция вычисления факториала.
// факториал числа N это сумма произведений чисел от 1 до N. факториал 0 равен 1.
// числа положительные

    int fact(int n) {
        int result;
        if (n < 0) {
            System.out.println("Введите положительное число ");
            return 0;
        }
        if (n == 1 || n == 0) {
            return 1;
        } else {
            result = fact(n - 1) * n;
        }
        return result;
    }
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.fact(-3);//"Введите положительное число ".
        System.out.println("Факториал 0: " + f.fact(0));
        System.out.println("Факториал 1: " + f.fact(1));
        System.out.println("Факториал 3: " + f.fact(3));
        System.out.println("Факториал 4: " + f.fact(4));
        System.out.println("Факториал 5: " + f.fact(5));
    }
}
