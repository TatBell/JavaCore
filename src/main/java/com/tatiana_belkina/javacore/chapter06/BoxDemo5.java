package src.main.java.com.tatiana_belkina.javacore.chapter06;

class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // инициализировать каждую коробку
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // получить объем второго бокса
        vol = mybox1.volume1();
        System.out.println("объем: " + vol);

        // получить get объем второго бокса
        vol = mybox2.volume1();
        System.out.println("объем: " + vol);
    }
}
