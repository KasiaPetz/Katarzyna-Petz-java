package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private String username;
    private int roundsNumber;

    private int playerPoints;
    private int cpuPoints;
    private boolean end;
    private String endStatus;

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

    public String getEndStatus() {
        return endStatus;
    }

    public void startNewGame() {
        System.out.println("Rozpoczęto grę!\n");

        playerPoints = 0;
        cpuPoints = 0;
        end = false;

        Scanner scanner = new Scanner(System.in);

        while(!end) {
            printMenu();
            char option = scanner.next().charAt(0);

            switch(option) {
                case '1':
                    playRound(1);
                    checkGameStatus();
                    break;

                case '2':
                    playRound(2);
                    checkGameStatus();
                    break;

                case '3':
                    playRound(3);
                    checkGameStatus();
                    break;

                case 'x':
                    System.out.println("Czy na pewno zakonczyc gre?");
                    if(confirm()) {
                        end = true;
                        endStatus = "quit";
                    }
                    break;
                case 'n':
                    System.out.println("Czy na pewno zakonczyc aktualna gre?");
                    if(confirm()) {
                        endStatus = "restart";
                    }
                    break;
                default:
                    System.out.println("Zła opcja, proszę wybrac ponownie.");
            }

        }

        afterGame();

    }

    public void printMenu() {

        System.out.println("Klawisz 1 - zagranie \"kamień\"");
        System.out.println("Klawisz 2 - zagranie \"papier\"");
        System.out.println("Klawisz 3 - zagranie \"nożyce\"");
        System.out.println("Klawisz x - zakończ gre");
        System.out.println("Klawisz n - restart");

    }

    //0 - remis 1 - wygrana -1 - przegrana
    public void playRound(int playerChoice) {
        Random rnd = new Random();
        int cpuChoice = rnd.nextInt(3) + 1;
        //1 - kamien, 2 - papier, 3 - nozyce
        //1 bije 3
        //2 bije 1
        //3 bije 2

        System.out.println("Gracz : " + optionString(playerChoice) + " - " + optionString(cpuChoice) + " : CPU");

        if(playerChoice == cpuChoice) {
            System.out.println("Remis !");
            return;
        }

        if((playerChoice == 1 && cpuChoice == 3) || (playerChoice == 2 && cpuChoice == 1) ||
                (playerChoice == 3 && cpuChoice == 2)) {
            System.out.println("Wygrałeś runde!");
            playerPoints++;
        } else {
            System.out.println("Przegrałeś runde!");
            cpuPoints++;
        }
    }

    public String optionString(int option) {
        if(option == 1) {
            return "Kamien";
        } else if(option == 2) {
            return "Papier";
        } else {
            return "Nożyce";
        }
    }

    public void checkGameStatus() {

        System.out.println("Punkty gracza " + playerPoints);
        System.out.println("Punkty cpu " + cpuPoints);

        if(playerPoints == roundsNumber) {
            System.out.println("BRAWO! Wygrales/as pojedynek!");
            end = true;
            endStatus = "ask";
        } else if(cpuPoints == roundsNumber) {
            System.out.println("Sprobuj jeszcze raz !");
            end = true;
            endStatus = "ask";
        }
    }

    public boolean confirm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadz y aby potwierdzic lub cokolwiek aby anulowac operacje : ");
        if(sc.next().equals("y")){
            return true;
        }
        return false;
    }

    public void afterGame() {
        if(endStatus.equals("restart")) {
            startNewGame();
        } else if (endStatus.equals("ask")) {
            System.out.println("Aby rozpoczac nowa gre wcisnij n");
            System.out.println("Aby zakonczyc program wcisnij x");
            Scanner sc = new Scanner(System.in);
            char option = sc.next().charAt(0);
            if(option == 'n') {
                startNewGame();
            }
        }
    }

}

