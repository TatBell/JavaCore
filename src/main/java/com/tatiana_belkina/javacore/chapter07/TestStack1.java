package src.main.java.com.tatiana_belkina.javacore.chapter07;

class TestStack1 {
    public static void main(String[] args) {
        Stack1 mystack1 = new Stack1();
        Stack1 mystack2 = new Stack1();

        // помещаем числа в стек
        for(int i=0; i<10; i++) mystack1.push(i);
        for(int i=10; i<20; i++) mystack2.push(i);

        // извлекаем эти числа из стека
        System.out.println("Stack в mystack1:");
        for(int i=0; i<10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack в mystack2:");
        for(int i=0; i<10; i++)
            System.out.println(mystack2.pop());

        // ОШИБКА
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }
}