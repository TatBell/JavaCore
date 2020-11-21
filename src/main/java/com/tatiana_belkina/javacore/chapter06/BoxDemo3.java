package src.main.java.com.tatiana_belkina.javacore.chapter06;

class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

    /* присвоить разные значения mybox2
       переменные экземпляра */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // отображать объем первого бокса
        mybox1.volume();

        // отображать объем второго бокса
        mybox2.volume();
    }
}