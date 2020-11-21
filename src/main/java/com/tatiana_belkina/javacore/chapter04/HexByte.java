package src.main.java.com.tatiana_belkina.javacore.chapter04;

// Маскирование двоичных разрядов расширения знака.
class HexByte {
    static public void main(String[] args) {
        char[] hex = {
                '0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte b = (byte) 0xf1;

        System.out.println(0xf1);//  число 241 в шестнадцатеричной системе
        System.out.println(Integer.toBinaryString(0xf1));//  число 241 в двоичной системе
        System.out.println(b + " -(byte) 0xf1: ");
        System.out.println((Integer.toBinaryString(b)) + " -(byte) 0xf1 двоичное");
        System.out.println("b >> 4: " + (b >> 4));
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}
