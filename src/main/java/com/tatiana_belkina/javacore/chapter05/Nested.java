package src.main.java.com.tatiana_belkina.javacore.chapter05;

// Циклы могут быть вложенными.
class Nested {
    public static void main(String[] args) {
        int i, j;

        //*****
        //****
        //***
        //**
        //*
        for (i = 0; i < 5; i++) {
            for (j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //*****
        // ****
        //  ***
        //   **
        //    *
        StringBuilder x = new StringBuilder();
        for (i = 0; i < 5; i++) {
            System.out.print(x);
            x.append(" ");
            for (j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //*****
        //****
        //***
        //**
        //*
        for (i = 0; i < 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //*
        //**
        //***
        //****
        //*****
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //      *
        //     **
        //    ***
        //   ****
        //  *****
        StringBuilder s = new StringBuilder();
        s.append(" ".repeat(6));
        for (i = 0; i < 5; i++) {
            System.out.print(s);
            s.delete(0,1);
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




