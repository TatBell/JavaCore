package src.main.java.com.tatiana_belkina.javacore.chapter06;

// Этот класс объявляет объект типа Box.
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // присвоить значения переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // вычислить объем коробки box
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("объем: " + vol);
    }
}
