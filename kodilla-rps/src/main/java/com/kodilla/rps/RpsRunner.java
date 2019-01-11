package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imie: ");
        String username = scanner.next();
        game.setUsername(username);

        System.out.println("Podaj liczbe rund: ");
        int roundsNumber = scanner.nextInt();
        game.setRoundsNumber(roundsNumber);

        game.startNewGame();

    }

}
