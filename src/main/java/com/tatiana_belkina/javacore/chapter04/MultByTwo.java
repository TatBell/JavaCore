package src.main.java.com.tatiana_belkina.javacore.chapter04;

// Применение сдвига влево в качестве быстрого способа умножения на 2.
class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;
        //System.out.println(Integer.toBinaryString(0xFFFFFFE));

        for (i = 0; i < 4; i++) {
            num = num << 1;
            //System.out.println(Integer.toBinaryString(num));
            System.out.println(num);
        }

        //System.out.println("1111_1111_1111_1111_1111_1111_1110_0000");
        long l = 2147483632L;
        l = l << 1;
        System.out.println(l);
        System.out.println(Long.toBinaryString(l));
        System.out.println(l);
    }
}
