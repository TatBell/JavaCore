package src.main.java.com.tatiana_belkina.javacore.old;

import java.util.Scanner;


public class A1 {
/*
*  if (gamerChoice == 0) return;
        if (gamerChoice == 1) this.firstPlayerInput = Figure.ROCK;
        if (gamerChoice == 2) this.firstPlayerInput = Figure.SCISSORS;
        if (gamerChoice == 3) this.firstPlayerInput = Figure.PAPER;

* */
    String resultWin = "Вы выиграли", resultLoss = "Вы проиграли", result;
    String warning = "Введите цифру из предложенного диапазона!";
    String rock = "Камень", scissors = "Ножницы", paper = "Бумага";
    int countUser = 0;
    int countComp = 0;

    public void logic() {

        /*while (true) {
            System.out.println("  Выберите:  ");
            System.out.println(" 1 - камень");
            System.out.println(" 2 - ножницы");
            System.out.println(" 3 - бумага");
            System.out.println(" 0 - выход");

            //Choice random [1 , 4)
            int computerRandomChoice = (int) (Math.random() * 3) + 1;

            Scanner scanner = new Scanner(System.in);
            int gamerChoice;
            try {
                gamerChoice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(warning);
                continue;
            }

            if (gamerChoice == 0) {
                System.out.println("Игра окончена");
                System.out.println(resultWin + " " + countUser + " раз");
                System.out.println(resultLoss + " " + countComp + " раз");
                scanner.close();
                return;
            } else if (gamerChoice == computerRandomChoice) {
                System.out.println("Ничья");
            } else {
                switch (gamerChoice) {
                    case 1 -> {
                        System.out.println();
                        result = Field.ROCK - computerRandomChoice == -1 ?
                                rock + " + " + scissors + " = " + resultWin + " " + (++countUser) + " раз"
                                : rock + " + " + paper + " = " + resultLoss + " " + (++countComp) + " раз";
                        System.out.println(result);
                    }
                    case 2 -> {
                        result = Field.SCISSORS - computerRandomChoice == -1 ?
                                scissors + " + " + paper + " = " + resultWin + " " + (++countUser) + " раз"
                                : scissors + " + " + rock + " = " + resultLoss + " " + (++countComp) + " раз";
                        System.out.println(result);
                    }
                    case 3 -> {
                        result = Field.PAPER - computerRandomChoice == 2 ?
                                paper + " + " + rock + " = " + resultWin + " " + (++countUser) + " раз"
                                : paper + " + " + scissors + " = " + resultLoss + " " + (++countComp) + " раз";
                        System.out.println(result);
                    }
                    default -> System.out.println(warning);
                }
            }
        }*/
    }
}


/*
public enum Figure {
    ROCK, SCISSORS, PAPER;
}
    final static int ROCK = 1;
    final static int SCISSORS = 2;
    final static int PAPER = 3;

class Field {
    private String firstPlayerInput;
    private String secondPlayerInput;

//getters + setters
}

interface GameLogic {
    public void start() {

    }

    private void getInput(){

    }


}

class StandardGameLogicImpl implements GameLogic {

}


1. Get input
        2. validate input
        3. update field
        4. generate PC figure
        5. update field
        6. check winner

*/


