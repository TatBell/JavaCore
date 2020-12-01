package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09;

public class DynStack1 implements IntStack1{
        private int[] stck;
        private int tos;

        // выделить и инициализировать стек
        DynStack1(int size) {
        stck = new int[size];
        tos = -1;
    }

        // Поместить элемент в stack
        public void push(int item) {
        // если стек заполнен, выделить больший стек
        if (tos == stck.length - 1) {
            int[] temp = new int[stck.length * 2]; // размер*2
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else
            stck[++tos] = item;
    }

        // Вытащить предмет из stack
        public int pop() {
        if (tos < 0) {
            System.out.println("Stack полон.");
            return 0;
        } else
            return stck[tos--];
    }
    @Override
    public void clear() {

            for (int x : stck)
           stck[0] = 0;
        //throw UnsupportedOperationException();

    }
}

class IFTest4 {
    public static void main(String[] args) {
        IntStack1 mystack1 = new DynStack1(8);
        mystack1.push(3);
        mystack1.clear();

    }
}
