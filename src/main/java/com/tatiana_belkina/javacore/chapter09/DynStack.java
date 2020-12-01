package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09;

// Реализуйте «растущий» стек.
class DynStack implements IntStack {
    private int[] stck;
    private int tos;

    // выделить и инициализировать стек
    DynStack(int size) {
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
}

class IFTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        // эти циклы заставляют каждый стек расти
        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Stack в mystack1:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack в mystack2:");
        for (int i = 0; i < 20; i++)
            System.out.println(mystack2.pop());
    }
}

/* Создайте переменную интерфейса и
   доступ к стекам через него.
*/
class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack; // создать ссылочную переменную интерфейса
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = ds; // загрузить dynamic stack
        // положить несколько чисел в стек
        for (int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs; // загрузить fixed stack
        for (int i = 0; i < 8; i++) mystack.push(i);


        mystack = ds;
        System.out.println("Значения в динамическом стеке:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack.pop());

        mystack = fs;
        System.out.println("Значения в фиксированном стеке:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());
    }
}

