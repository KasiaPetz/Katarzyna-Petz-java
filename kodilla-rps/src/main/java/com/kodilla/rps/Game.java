package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String username;
    private int roundsNumber;
    private int playerPoints;
    private int secondPlayerPoints;
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
        System.out.println("Start the game!\n");

        playerPoints = 0;
        secondPlayerPoints = 0;
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
                    System.out.println("Are you sure to quit game?");
                    if(confirm()) {
                        end = true;
                        endStatus = "quit";
                    }
                    break;
                case 'n':
                    System.out.println("Are you sure to quit this game ?");
                    if(confirm()) {
                        endStatus = "restart";
                    }
                    break;
                default:
                    System.out.println("Wrong option, chose again.");
            }
        }
        afterGame();
    }

    public void printMenu() {

        System.out.println("1 - \"rock\"");
        System.out.println("2 - \"paper\"");
        System.out.println("3 - \"scissors\"");
        System.out.println("x - finish game");
        System.out.println("n - restart");
    }

    //0 - remis 1 - wygrana -1 - przegrana
    //1 - kamien, 2 - papier, 3 - nozyce
    //1 bije 3
    //2 bije 1
    //3 bije 2
    public void playRound(int playerChoice) {
        Random rnd = new Random();
        int secPlayerChoice = rnd.nextInt(3) + 1;

        System.out.println("Player : " + optionString(playerChoice) + " \n" +
                "Second Player: " + optionString(secPlayerChoice));

        if(playerChoice == secPlayerChoice) {
            System.out.println("Remis!");
            return;
        }

        if((playerChoice == 1 && secPlayerChoice == 3) || (playerChoice == 2 && secPlayerChoice == 1) ||
                (playerChoice == 3 && secPlayerChoice == 2)) {
            System.out.println("You won the round!");
            playerPoints++;
        } else {
            System.out.println("You lost the round!");
            secondPlayerPoints++;
        }
    }

    public String optionString(int option) {
        if(option == 1) {
            return "Rock";
        } else if(option == 2) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public void checkGameStatus() {

        System.out.println("Players points " + playerPoints);
        System.out.println("Second player points " + secondPlayerPoints);

        if(playerPoints == roundsNumber) {
            System.out.println("CONGRATULATIONS! You won!");
            end = true;
            endStatus = "ask";
        } else if(secondPlayerPoints == roundsNumber) {
            System.out.println("Try again!");
            end = true;
            endStatus = "ask";
        }
    }

    public boolean confirm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter y to confirm or any key to cancel: ");
        if(sc.next().equals("y")){
            return true;
        }
        return false;
    }

    public void afterGame() {
        if(endStatus.equals("restart")) {
            startNewGame();
        } else if (endStatus.equals("ask")) {
            System.out.println("Enter n to start new game");
            System.out.println("Enter x to finish game");
            Scanner sc = new Scanner(System.in);
            char option = sc.next().charAt(0);
            if(option == 'n') {
                startNewGame();
            }
        }
    }
}

