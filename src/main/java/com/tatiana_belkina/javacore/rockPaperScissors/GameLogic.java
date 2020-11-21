package src.main.java.com.tatiana_belkina.javacore.rockPaperScissors;

import java.util.Scanner;


public class GameLogic {

    String resultWin = "Вы выиграли", resultLoss = "Вы проиграли", result;
    String warning = "Введите цифру из предложенного диапазона!";
    String rock = "Камень", scissors = "Ножницы", paper = "Бумага";
    int countUser = 0;
    int countComp = 0;

    public void logic() {

        while (true) {
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
        }
    }
}




