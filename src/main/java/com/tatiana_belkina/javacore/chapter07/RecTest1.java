package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Другой пример, использующий рекурсию.

class RecTest1 {
    int[] values;

    RecTest1(int i) {
        values = new int[i];
    }

    // отображение произвольно - рекурсивно
    void printArray(int i) {
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest1 ob = new RecTest1(10);
        int i;

        for(i=0; i<10; i++) ob.values[i] = i;

        ob.printArray(10);
    }
}
