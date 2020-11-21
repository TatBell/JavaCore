package src.main.java.com.tatiana_belkina.javacore.chapter06;

class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

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
        vol = mybox1.volume1();
        System.out.println("объем: " + vol);

        // отображать объем второго бокса
        vol = mybox2.volume1();
        System.out.println("объем: " + vol);
    }
}
