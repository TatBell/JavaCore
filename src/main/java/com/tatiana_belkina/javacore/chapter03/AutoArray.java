package src.main.java.com.tatiana_belkina.javacore.chapter03;

// Усовершенствованная версия предыдущей программы.
class AutoArray {
    public static void main(String[] args) {
        int[] month_days;
        month_days = new int[]{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.println("В апреле " + month_days[3] + " дней.");
    }
}
