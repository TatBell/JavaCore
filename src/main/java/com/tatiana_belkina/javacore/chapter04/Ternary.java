package src.main.java.com.tatiana_belkina.javacore.chapter04;

//  Продемонстрируйте применение тернарного оператора.
class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        k = i < 0 ? -i : i;

        System.out.println(i + " = " + k);
    }
}