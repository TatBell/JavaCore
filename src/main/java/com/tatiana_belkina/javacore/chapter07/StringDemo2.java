package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Демонстрировать некоторые String методы.
class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Первый String";
        String strOb2 = "Второй String";
        String strOb3 = strOb1;

        System.out.println("Length of strOb1: " +
                strOb1.length());

        System.out.println("Char at index 3 в strOb1: " +
                strOb1.charAt(3));

        if(strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");

        if(strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}
