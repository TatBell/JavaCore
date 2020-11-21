package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Продемонстрируйте строковые массивы.
// Отображаем все аргументы командной строки.
class CommandLine {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++)
            System.out.println("args[" + i + "]: " +
                    args[i]);
    }
}