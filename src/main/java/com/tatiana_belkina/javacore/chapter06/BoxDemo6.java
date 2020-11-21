package src.main.java.com.tatiana_belkina.javacore.chapter06;

class BoxDemo6 {
    public static void main(String[] args) {
        // объявлять, выделять и инициализировать объекты Box
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        // получить объем первой коробки
        vol = mybox1.volume1();
        System.out.println("объем: " + vol);

        // получить объем второй коробки
        vol = mybox2.volume1();
        System.out.println("объем: " + vol);
    }
}

