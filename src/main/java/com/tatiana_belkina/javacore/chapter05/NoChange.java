package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Переменная в цикле for-each доступна только для чтения.
class NoChange {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for(int x : nums) {
            System.out.print(x + " ");
            x = x * 10;// переменная не влияет на массив
        }

        System.out.println();

        for(int x : nums)
            System.out.print(x + " ");

        System.out.println();
    }
}