package src.main.java.com.tatiana_belkina.javacore.chapter07;

// Этот класс определяет целочисленный стек, который может содержать 10 значений.
class Stack1 {
    /* Теперь и stck, и tos являются приватными. Это означает
       что они не могут быть случайно или злонамеренно
       изменен таким образом, чтобы это было вредно для стека.
    */
    private final int[] stck = new int[10];
    private int tos;

    // Инициализировать верхнюю часть стека
    Stack1() {
        tos = -1;
    }

    // Поместить элемент в stack
    void push(int item) {
        if (tos == 9)
            System.out.println("Stack заполнен.");
        else
            stck[++tos] = item;
    }

    // Извлечь предмет из stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack пуст.");
            return 0;
        } else
            return stck[tos--];
    }
}
