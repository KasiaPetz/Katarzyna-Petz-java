package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    private String username;
    private int roundsNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getRoundsNumber() {
        return roundsNumber;
    }

    public void setRoundsNumber(int roundsNumber) {
        this.roundsNumber = roundsNumber;
    }

    public void startNewGame() {
        boolean end = false;

        Scanner scanner = new Scanner(System.in);


        while(!end) {
            printMenu();
            char option = scanner.next().charAt(0);

            switch(option) {
                case '1':
                    //kod dla kamienia
                    break;

                case '2':
                    //kod dla papieru
                    break;

                case '3':
                    //kod dla nozyc
                    break;

                case 'x':
                    end = true;
                    break;
                case 'n':
                    //nowa gra
                    break;
                default:
                    System.out.println("Zła opcja, proszę wybrac ponownie.");
            }


        }
    }

    public void printMenu() {

        System.out.println("Klawisz 1 - zagranie \"kamień\"");
        System.out.println("Klawisz 2 - zagranie \"papier\"");
        System.out.println("Klawisz 3 - zagranie \"nożyce\"");
        System.out.println("Klawisz x - zakończ gre");
        System.out.println("Klawisz n - restart");

    }

}
