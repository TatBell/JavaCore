package src.main.java.com.tatiana_belkina.javacore.rockPaperScissors;

import java.util.Scanner;

public class Field {

    private Figure firstPlayerInput;
    private Figure secondPlayerInput;
    Scanner scanner = new Scanner(System.in);
    int gamerChoice = 0;


    public void setFirstPlayerInput() {
        scanner.nextInt();
        if (gamerChoice == 0) return;
        if (gamerChoice == 1) this.firstPlayerInput = Figure.ROCK;
        if (gamerChoice == 2) this.firstPlayerInput = Figure.SCISSORS;
        if (gamerChoice == 3) this.firstPlayerInput = Figure.PAPER;

    }

    public void setSecondPlayerInput() {
        int computerRandomChoice = (int) (Math.random() * 3) + 1;
        if (computerRandomChoice == 0) return;
        if (computerRandomChoice == 1) this.secondPlayerInput = Figure.ROCK;
        if (computerRandomChoice == 2) this.secondPlayerInput = Figure.SCISSORS;
        if (computerRandomChoice == 3) this.secondPlayerInput = Figure.PAPER;
    }

    public Figure getFirstPlayerInput() {
        return firstPlayerInput;
    }

    public Figure getSecondPlayerInput() {
        return secondPlayerInput;
    }

}
