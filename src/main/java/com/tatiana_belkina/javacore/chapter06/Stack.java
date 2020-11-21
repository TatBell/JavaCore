package src.main.java.com.tatiana_belkina.javacore.chapter06;


import java.util.Arrays;

// Этот класс определяет целочисленный стек, который может содержать 10 значений.
public class Stack {
    int[] stack = new int[10];
    int tos;

    // Инициализировать верх часть стека
    public Stack() {
        tos = -1;
    }

    //Поместить элемент в Stack
    void push(int item) {
        if (tos != 9) {
            for (int i = 0; i < 10; i++) {
                stack[++tos] = item;
            }
        } else {
            System.out.println("Стек заполнен.");
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else return stack[--tos];
    }

    public static void main(String[] args) {
        Stack stackObject = new Stack();
        //Стек не загружен
        stackObject.pop();
        //Стек заполнен.
        for (int i = 0; i < 2; i++) {
            stackObject.push(1);
        }
        System.out.println(Arrays.toString(stackObject.stack));
    }
}
