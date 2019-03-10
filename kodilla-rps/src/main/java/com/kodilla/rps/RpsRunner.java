package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String username = scanner.next();
        game.setUsername(username);

        System.out.println("Enter quantity of rounds : ");
        int roundsNumber = scanner.nextInt();
        game.setRoundsNumber(roundsNumber);

        game.startNewGame();

    }

}
