package src.main.java.com.tatiana_belkina.javacore.chapter03.chapter09;

// Определите интерфейс целочисленного стека.
interface IntStack {

    void push(int item); // сохранить item

    int pop(); // извлечь item
}

// Реализация IntStack, использующая фиксированное хранилище.
class FixedStack implements IntStack {
    private final int[] stck;
    private int tos;

    // выделить и инициализировать стек
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Поместить элемент в stack
    public void push(int item) {
        if (tos == stck.length - 1) // использовать length member
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    // Pop из stack
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек пуст.");
            return 0;
        } else
            return stck[tos--];
    }
}

class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        // положить несколько чисел в стек
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        // положить несколько чисел в стек
        System.out.println("Stack в mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Stack в mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack2.pop());
    }
}
