package src.main.java.com.tatiana_belkina.javacore.rockPaperScissors;

public class StandardGameLogicImpl implements GameLogic {
    Field field;

    StandardGameLogicImpl() {
        this.field = new Field();

    }

    public static void main(String[] args) {

        StandardGameLogicImpl s = new StandardGameLogicImpl();
        s.start();

    }

/*1. Get input
2. validate input
3. update field
4. generate PC figure
5. update field
6. check winner*/

}
