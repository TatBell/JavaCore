package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Улучшенный класс Stack, который использует длину массива .
class Stack2 {
    private final int[] stck;
    private int tos;


    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }


    void push(int item) {
        if (tos == stck.length - 1) // use length member
            System.out.println("Stack полон.");
        else
            stck[++tos] = item;
    }


    int pop() {
        if (tos < 0) {
            System.out.println("Stack пуст.");
            return 0;
        } else
            return stck[tos--];
    }
}

class TestStack2 {
    public static void main(String[] args) {
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);


        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);


        System.out.println("Stack в mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack в mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
