package src.main.java.com.tatiana_belkina.javacore.rockPaperScissors;

public interface GameLogic {

    default void start() {

        getInput();

    }

    private void getInput() {
        System.out.println("  Выберите:  ");
        System.out.println(" 1 - камень");
        System.out.println(" 2 - ножницы");
        System.out.println(" 3 - бумага");
        System.out.println(" 0 - выход");







     /*    String deadHeat = "Ничья";
    String winner = "Вы выиграли";
    String loser = "Вы проиграли";


      if (field.getFirstPlayerInput().equals(field.getSecondPlayerInput())) {
            System.out.println(deadHeat);
        }
        if (field.getFirstPlayerInput().equals(Figure.ROCK)){
            switch (field.getSecondPlayerInput()) {
                case SCISSORS -> System.out.println(winner);
                case PAPER -> System.out.println(loser);
            }
        }

        if (field.getFirstPlayerInput().equals(Figure.SCISSORS)){
            switch (field.getSecondPlayerInput()) {
                case PAPER ->  System.out.println(winner);
                case ROCK -> System.out.println(loser);
            }
        }

        if (field.getFirstPlayerInput().equals(Figure.PAPER)){
            switch (field.getSecondPlayerInput()) {
                case ROCK -> System.out.println(winner);
                case SCISSORS -> System.out.println(loser);
            }
        }*/

    }
}
