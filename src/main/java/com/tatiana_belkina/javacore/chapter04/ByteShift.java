package src.main.java.com.tatiana_belkina.javacore.chapter04;

// Сдвиг влево значения типа byte.
class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Первоначальное значение a: " + a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println("a << 2:  "+ Integer.toBinaryString(i));
        System.out.println("(byte) (a << 2):  " + b);
        System.out.println("i и b: " + i + " " + b);
    }
}
