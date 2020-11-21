package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Проверить на простые числа
class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;
        // число 1 не является простым
        isPrime = num >= 2;
// num/i имеет смысл до значения >= 1 ( потенциальный делитель), далее нет делителей кроме самого числа
        for(int i=2; i <= num/i; i++) {
            if((num % i) == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
