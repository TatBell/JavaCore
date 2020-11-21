package src.main.java.com.tatiana_belkina.javacore.chapter02;

/*
   Это еще один короткий пример программы.
   Присвоить исходному файлу имя  "Example2.java".
*/
class Example2 {
    public static void main(String[] args) {
        int num; // в этой строке объявляется переменная с именем num

        num = 100; // в этой строке переменой num
        // присваивается значение 100

        System.out.println("Это переменная num: " + num);

        num = num * 2;

        System.out.print("Значение переменной num * 2 равно ");
        System.out.println(num);
    }
}
