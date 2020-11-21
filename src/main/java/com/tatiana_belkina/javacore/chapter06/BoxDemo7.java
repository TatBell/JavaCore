package src.main.java.com.tatiana_belkina.javacore.chapter06;

class BoxDemo7 {
    public static void main(String[] args) {
        // объявлять, размещать и инициализировать объекты Box
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        // получить объем первой коробки
        vol = mybox1.volume1();
        System.out.println("объем: " + vol);

        // получить объем второй коробки
        vol = mybox2.volume1();
        System.out.println("объем: " + vol);
    }
}
