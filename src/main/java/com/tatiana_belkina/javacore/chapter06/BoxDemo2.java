package src.main.java.com.tatiana_belkina.javacore.chapter06;

class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

    /* присвоить разные значения mybox2
       переменным экземпляра */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // вычислить объем первой коробки
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("объем: " + vol);

        // вычислить объем второй коробки
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("объем: " + vol);
    }
}
